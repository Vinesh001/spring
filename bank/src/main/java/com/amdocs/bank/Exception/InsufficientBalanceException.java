package com.amdocs.bank.Exception;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        super("Insufficient balance for the transaction.");
    }
}
