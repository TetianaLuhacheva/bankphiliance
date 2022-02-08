package com.philiance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.philiance.model.Business;
import com.philiance.model.Compte;
import com.philiance.model.Particulier;
@Repository
public interface CompteRepository extends JpaRepository<Compte, String> {
	

}
