package com.example.Bank.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bank.Entity.Loan;

public interface LoanRepo extends JpaRepository<Loan, Integer> {

}
