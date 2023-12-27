package com.example.solidbank;

public class Transaction {
    String transaction;
    public Transaction(String transaction) {
        this.transaction = transaction;
    }
    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }
}
