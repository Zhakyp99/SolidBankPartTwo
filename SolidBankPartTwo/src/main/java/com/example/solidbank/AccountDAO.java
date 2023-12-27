package com.example.solidbank;
import java.util.List;
public interface AccountDAO {
    List<Account> getClientAccounts(String clientID);
    public void createNewAccount(Account account);
    public void updateAccount(Account account);
    List<Account> getClientAccountsByType(String clientID,AccountType accountType);
    public AccountWithdraw getClientWithdrawAccount(String clientID,String accountID);
    public Account getClientAccount(String clientID, String accountID);
}
