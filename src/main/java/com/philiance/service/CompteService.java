package com.philiance.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philiance.ParticulierControlor;
import com.philiance.dto.ComptDto;
import com.philiance.model.Business;
import com.philiance.model.Courant;
import com.philiance.model.Epargne;
import com.philiance.model.Particulier;
import com.philiance.model.Person;
import com.philiance.repository.BusinessRepository;
import com.philiance.repository.CompteRepository;
import com.philiance.repository.ParticulierRepository;
@Service
@Transactional
public class CompteService {
	@Autowired
	private ParticulierRepository particulierRepository;
	@Autowired
	BusinessRepository businessRepository;
	@Autowired
	CompteRepository compteRepository;
	
	
	public ComptDto save(ComptDto p) {
		if(p.getPersonType().equalsIgnoreCase("P")) {
		Particulier particulier = new Particulier();
		particulier.setPersonId(p.getPersonId());
		particulier.setFullName(p.getFullName());
		particulier.setPhoneNumber(p.getPhoneNumber());
		particulier.setEmail(p.getEmail());
		particulierRepository.save(particulier);
		saveCompte(p, particulier);
		/*
		 * if(p.getTypeCompte().equalsIgnoreCase("C")) { Courant courant =new Courant();
		 * courant.setAccountNumber(p.getNumeroCompte());
		 * courant.setPerson(particulier); courant.setAccountAmount(0);
		 * courant.setCreateDate(new Date ()); compteRepository.save(courant); }
		 * if(p.getTypeCompte().equalsIgnoreCase("E")) { Epargne epargne=new Epargne();
		 * epargne.setAccountNumber(p.getNumeroCompte());
		 * epargne.setPerson(particulier); epargne.setAccountAmount(200);
		 * epargne.setCreateDate(new Date()); compteRepository.save(epargne);
		 * 
		 * }
		 */
		
		}
		else if (p.getPersonType().equalsIgnoreCase("B")) {
			Business bus=new Business();
			bus.setPersonId(p.getPersonId());
			bus.setFullName(p.getFullName());
			bus.setPhoneNumber(p.getPhoneNumber());
			bus.setEmail(p.getEmail());
			businessRepository.save(bus);
			saveCompte(p, bus);
			
			/*
			 * if(p.getPersonType().equalsIgnoreCase("C")) { Courant courantb = new
			 * Courant(); courantb.setAccountNumber(p.getNumeroCompte());
			 * courantb.setPerson(bus); courantb.setAccountAmount(3000);
			 * courantb.setCreateDate(new Date()); compteRepository.save(courantb); } else
			 * if(p.getPersonType().equalsIgnoreCase("E")) { Epargne epargneb = new
			 * Epargne(); epargneb.setAccountNumber(p.getNumeroCompte());
			 * epargneb.setPerson(bus); epargneb.setAccountAmount(2000);
			 * epargneb.setCreateDate(new Date()); compteRepository.save(epargneb);
			 * 
			 * }
			 */
		}
		
		
				
		System.out.println(p);
		return p;
		}
	
		
		private void saveCompte(ComptDto p,Person particulier) {
			if(p.getPersonType().equalsIgnoreCase("C")) {
			Courant courant =new Courant();
			courant.setAccountNumber(p.getNumeroCompte());
			courant.setPerson(particulier);
			courant.setAccountAmount(0);
			courant.setCreateDate(new Date ());
			compteRepository.save(courant);
		}
		if(p.getTypeCompte().equalsIgnoreCase("E")) {
			Epargne epargne=new Epargne();
			epargne.setAccountNumber(p.getNumeroCompte());
			epargne.setPerson(particulier);
			epargne.setAccountAmount(200);
			epargne.setCreateDate(new Date());
			compteRepository.save(epargne);
					
		}
		}
		
	
	
	
	

}
