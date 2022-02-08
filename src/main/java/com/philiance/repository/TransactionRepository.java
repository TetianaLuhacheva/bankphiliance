package com.philiance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.philiance.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
