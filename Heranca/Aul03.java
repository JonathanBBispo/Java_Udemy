package Heranca;

import Heranca.Entities.Account;
import Heranca.Entities.BusinessAcount;
import Heranca.Entities.SavingsAccount;

public class Aul03 {
    public static void main(String[] args) {
        Account acc1 = new Account(1001,"Alex",1000);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAcount(103, "Jorge", 1000.0, 500);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }    
}
