package com.example.solidbank;

public class SavingAccount extends AccountWithdraw{

    public SavingAccount(AccountType accountType, String id, String clientID, double balance) {
        super(accountType, id, clientID, balance);
    }
}
