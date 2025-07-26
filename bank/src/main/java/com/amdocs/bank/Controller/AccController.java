package com.amdocs.bank.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.bank.Model.Account;
import com.amdocs.bank.Service.AccountService;

@RestController
public class AccController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("Welcome to the Bank API", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        Account createdAccount = accountService.createAccount(account);
        return new ResponseEntity<>(createdAccount, HttpStatus.CREATED);
    }

    @GetMapping("/balance/{id}")
    public ResponseEntity<Double> checkBalance(@PathVariable Long id) {
        double balance = accountService.checkBalance(id);
        return new ResponseEntity<>(balance, HttpStatus.OK);
    }

    @PostMapping("/deposit/{id}")
    public ResponseEntity<Account> deposit(@PathVariable Long id, @RequestParam double amount) {
        Account updatedAccount = accountService.deposit(id, amount);
        return new ResponseEntity<>(updatedAccount, HttpStatus.OK);
    }

    @PostMapping("/withdraw/{id}")
    public ResponseEntity<Account> withdraw(@PathVariable Long id, @RequestParam double amount) {
        Account updatedAccount = accountService.withdraw(id, amount);
        return new ResponseEntity<>(updatedAccount, HttpStatus.OK);
    }

    @PostMapping("/transfer")
    public ResponseEntity<Void> transfer(@RequestParam Long fromId, @RequestParam Long toId, @RequestParam double amount) {
        accountService.transfer(fromId, toId, amount);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


