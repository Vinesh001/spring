package com.amdocs.BankManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.BankManagementSystem.Model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    
}
