package com.philiance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="PARTICULIER")
public class Particulier extends Person {
	

}
