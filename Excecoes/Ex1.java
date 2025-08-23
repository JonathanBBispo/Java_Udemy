import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.BussinessException;

public class Ex1 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    try(Scanner sc = new Scanner(System.in)){
      System.out.println("Enter account data");
      System.out.print("Number: ");
      var number = sc.nextInt();
      sc.nextLine();
      System.out.print("Holder: ");
      var holder = sc.nextLine();
      System.out.print("Initial balance: ");
      var balance = sc.nextDouble();
      System.out.print("Withdraw limit: ");
      var withdrawLimit = sc.nextDouble();

      Account acc = new Account(number, holder, balance, withdrawLimit);
      try {
        System.out.print("Enter amount for withdraw: ");
        var amount = sc.nextDouble();
        acc.withdraw(amount);

        System.out.println("New balance: " + acc.getBalance());
      } catch (BussinessException e) {
        System.out.print("Withdraw error: " + e.getMessage());
      }
    }
  }
}
