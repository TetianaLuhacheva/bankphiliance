package com.philiance.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_COMPTE")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract  class Compte  {
	@Id
	@Column(name = "ACCOUNT_ID")
	private String accountNumber;
	
	@Column(name = "ACCOUNT_AMOUNT")
	private double accountAmount;
	
	@Column(name = "CREATED_DT")
	private Date createDate=new Date();
	
    @ManyToOne
	@JoinColumn(name = "PERSON_ID")
	private Person person;

	public Compte() {
	
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountAmount() {
		return accountAmount;
	}

	public void setAccountAmount(double accountAmount) {
		this.accountAmount = accountAmount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	


	
	
	
}
