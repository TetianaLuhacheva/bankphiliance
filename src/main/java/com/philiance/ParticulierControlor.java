package com.philiance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.philiance.dto.ComptDto;
import com.philiance.dto.TransactionDto;
import com.philiance.model.Particulier;
import com.philiance.model.Transaction;
import com.philiance.service.CompteService;
import com.philiance.service.TransactionService;

@RestController
public class ParticulierControlor {
	
	@Autowired
	CompteService cs;
	@Autowired
	TransactionService transactionService;
	@PostMapping("/compte/add")
	public ResponseEntity<ComptDto> save (@RequestBody ComptDto comptDto){
		//System.out.println("bonsoir !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		cs.save(comptDto);
		return new ResponseEntity<ComptDto>(comptDto,HttpStatus.OK);
 
	}
	@GetMapping("/bonjour")
	public String bonjour() {
		System.out.println("la méthode bonjour est appellée");
		return "bonjour";
		
	}
	@GetMapping ("/hello")
	public String sayHello () {
		System.out.println("la méthode hello est appellée");
		return "Test Hello";
	}
	
	@PostMapping("/transaction/add")
	public ResponseEntity<TransactionDto>  addTransaction(@RequestBody TransactionDto  transactionDto ) {
		transactionService.save(transactionDto);
		return new  ResponseEntity<TransactionDto>(transactionDto,HttpStatus.OK);
		
	}

	
	}

