package Construtores;
import java.util.Scanner;

import Construtores.Entities.ContaBancaria;

import java.util.Locale;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);
        ContaBancaria user;

        System.out.print("Enter account number: ");
        var account = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        var name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        var escolha = sc.next().charAt(0);
        if(escolha == 'y'){
            System.out.print("Enter initial deposit value: ");
            var deposit = sc.nextDouble();
            user = new ContaBancaria(name, account, deposit);
        }
        else user = new ContaBancaria(name, account);            
        System.out.println(user);

        System.out.print("Enter a deposit value: ");
        var amount = sc.nextDouble();
        user.depositValue(amount);
        System.out.println(user);

        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        user.withdraw(amount);
        System.out.println(user);

        sc.close();
    }
}
