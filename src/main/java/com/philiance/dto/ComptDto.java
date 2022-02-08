package com.philiance.dto;


import javax.persistence.Column;
import javax.persistence.Id;

public class ComptDto {
	
	
	private String personId;	
	private String fullName;	
	private String phoneNumber;
	private String email;
	private String personType;
	private String numeroCompte;
	private String typeCompte;
	
	
	
	public ComptDto() {


	}
	
	
	
	public String getNumeroCompte() {
		return numeroCompte;
	}


	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}


	public String getTypeCompte() {
		return typeCompte;
	}


	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}


	public String getPersonType() {
		return personType;
	}


	public void setPersonType(String personType) {
		this.personType = personType;
	}


	
	public String getPersonId() {
		return personId;
	}


	public void setPersonId(String personId) {
		this.personId = personId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ComptDto [personId=" + personId + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", email="
				+ email + "]";
	}
	
	
	
}