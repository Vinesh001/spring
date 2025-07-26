package com.amdocs.BankManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amdocs.BankManagementSystem.Model.Account;
import com.amdocs.BankManagementSystem.Repository.AccountRepository;


@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account acc) {
        acc.setBalance(0.0); 
        return accountRepository.save(acc);
    }

    public double checkBalance(Long id) {
        return accountRepository.findById(id).orElseThrow().getBalance();
    }

    public Account deposit(Long id, double amount) {
        Account acc = accountRepository.findById(id).orElseThrow();
        acc.setBalance(acc.getBalance() + amount);
        return accountRepository.save(acc);
    }

    public Account withdraw(Long id, double amount) {
        Account acc = accountRepository.findById(id).orElseThrow();
        if (acc.getBalance() < amount)
            throw new RuntimeException("Insufficient balance");
        acc.setBalance(acc.getBalance() - amount);
        return accountRepository.save(acc);
    }

    @Transactional
    public void transfer(Long fromId, Long toId, double amount) {
        Account from = accountRepository.findById(fromId).orElseThrow();
        Account to = accountRepository.findById(toId).orElseThrow();

        if (from.getBalance() < amount)
            throw new RuntimeException("Insufficient balance for transfer");

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        accountRepository.save(from);
        accountRepository.save(to);
    }
}
