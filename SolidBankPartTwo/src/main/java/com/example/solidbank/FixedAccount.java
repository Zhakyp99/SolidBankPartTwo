package com.example.solidbank;

public class FixedAccount extends AccountDeposit{

    public FixedAccount(AccountType accountType, String id, String clientID, double balance) {
        super(accountType, id, clientID, balance);
    }
}
