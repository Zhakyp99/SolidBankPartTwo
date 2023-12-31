package com.example.solidbank;

public class AccountDepositServiceImpl implements AccountDepositService{
    private AccountDAO accountDAO;
    public AccountDepositServiceImpl(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }
    @Override
    public void deposit(double amount, Account account) {
        account.setBalance(account.getBalance()+amount);
    }
}
