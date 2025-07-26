package com.amdocs.bank.Exception;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(Long id) {
        super("Account with ID " + id + " not found.");
    }
}
