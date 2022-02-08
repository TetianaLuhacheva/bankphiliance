package com.philiance.service;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.philiance.dto.TransactionDto;
import com.philiance.model.Compte;
import com.philiance.model.TransactionRetrait;
import com.philiance.model.TransactionVersement;
import com.philiance.repository.CompteRepository;
import com.philiance.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private CompteRepository compteRepository;
	public TransactionDto save(TransactionDto t) {
		if(t.getTypeTransaction().equalsIgnoreCase("V")) {
			TransactionVersement transactionVersement = new TransactionVersement();
			transactionVersement.setTransactionId(t.getTransactionId());
			transactionVersement.setAmount(t.getAmount());
			transactionVersement.setTransactionDate(new Date());
			Optional<Compte> compte = compteRepository.findById( t.getNumeroCompte());
			transactionVersement.setCompte(compte.get());
			Compte c=compte.get();
			c.setAccountAmount(c.getAccountAmount()+t.getAmount());
			transactionRepository.save(transactionVersement);
			compteRepository.save(c);
		
		
		}
		else if(t.getTypeTransaction().equalsIgnoreCase("R")) {
			Optional<Compte> compte = compteRepository.findById( t.getNumeroCompte());
			if(compte.get().getAccountAmount()>=t.getAmount()) {
			TransactionRetrait transactionRetrait= new TransactionRetrait();
			transactionRetrait.setTransactionId(t.getTransactionId());
			transactionRetrait.setAmount(t.getAmount());
			transactionRetrait.setTransactionDate(new Date());
			
			transactionRetrait.setCompte(compte.get());
			Compte c=compte.get();
			c.setAccountAmount(c.getAccountAmount()-t.getAmount());
			transactionRepository.save(transactionRetrait);
			compteRepository.save(c);
			}
			else {
				System.out.println("Pas d'argent suffisant");
			}
		}
		
		
		
		return t;
		
	}

}
