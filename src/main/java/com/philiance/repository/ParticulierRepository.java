package com.philiance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.philiance.model.Particulier;
@Repository
public interface ParticulierRepository extends JpaRepository<Particulier, String> {
	

}
