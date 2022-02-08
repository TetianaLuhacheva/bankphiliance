package com.philiance.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.philiance.model.Compte;

public class TransactionDto {
	
	
	private String transactionId;
	private double amount;
    private String numeroCompte;
    private String typeTransaction;
    
    public String getTypeTransaction() {
		return typeTransaction;
	}


	public void setTypeTransaction(String typeTransaction) {
		this.typeTransaction = typeTransaction;
	}


	public TransactionDto() {
		
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getNumeroCompte() {
		return numeroCompte;
	}


	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}


	@Override
	public String toString() {
		return "TransactionDto [transactionId=" + transactionId + ", amount=" + amount + ", numeroCompte="
				+ numeroCompte + "]";
	}
	
    
	

}
