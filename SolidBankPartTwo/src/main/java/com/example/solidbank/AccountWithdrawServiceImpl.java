package com.example.solidbank;

public class AccountWithdrawServiceImpl implements AccountWithdrawService{
    private AccountDAO accountDAO;
    public AccountWithdrawServiceImpl(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }
    @Override
    public void withdraw(double amount, AccountWithdraw account) {
        account.setBalance(account.getBalance()-amount);
    }
}
