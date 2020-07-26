package com.example.WalletService.exception;

public class TransactionBadRequest extends RuntimeException {

    public TransactionBadRequest(){
        super("TransactionBadRequest");
    }
}
