package com.amdocs.bank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amdocs.bank.Exception.AccountNotFoundException;
import com.amdocs.bank.Exception.InsufficientBalanceException;
import com.amdocs.bank.Model.Account;
import com.amdocs.bank.Repository.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repo;

    public Account createAccount(Account acc) {
        acc.setBalance(0.0);
        return repo.save(acc);
    }

    public double checkBalance(Long id) {
        Account acc = repo.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
        return acc.getBalance();
    }

    public Account deposit(Long id, double amount) {
        Account acc = repo.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
        acc.setBalance(acc.getBalance() + amount);
        return repo.save(acc);
    }

    public Account withdraw(Long id, double amount) {
        Account acc = repo.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
        if (acc.getBalance() < amount) throw new InsufficientBalanceException();
        acc.setBalance(acc.getBalance() - amount);
        return repo.save(acc);
    }

    @Transactional
    public void transfer(Long fromId, Long toId, double amount) {
        Account from = repo.findById(fromId).orElseThrow(() -> new AccountNotFoundException(fromId));
        Account to = repo.findById(toId).orElseThrow(() -> new AccountNotFoundException(toId));

        if (from.getBalance() < amount) throw new InsufficientBalanceException();

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        repo.save(from);
        repo.save(to);
    }
}
