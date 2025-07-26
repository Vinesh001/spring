package com.amdocs.bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.bank.Model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    
}
