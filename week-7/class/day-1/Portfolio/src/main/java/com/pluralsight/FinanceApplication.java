package com.pluralsight;

import com.pluralsight.finance.assets.BankAccount;
import com.pluralsight.finance.assets.Gold;
import com.pluralsight.finance.interfaces.Account;
import com.pluralsight.finance.interfaces.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Account account2 = new BankAccount("Gary", "1Gary", 1500);
        Valuable g = new Gold("gold", 1, 1);

        // try to deposit money into both accounts
        account1.deposit(100);
//        account2.getValue();
        account2.getTotalBalance();
        g.getValue();
    }
}
