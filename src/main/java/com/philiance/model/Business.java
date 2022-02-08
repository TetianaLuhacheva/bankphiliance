package com.philiance.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue(value ="Business")
public class Business extends Person {
	
	@Column(name ="FNAME")
	private String financialFirstNam;
	
	@Column(name ="FLNAME")
	private String financialLastNam;
	
	
	@Column(name="FPHONE")
	private String financialPhone;
	
	

}
