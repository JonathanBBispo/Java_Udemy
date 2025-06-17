package Static;

import java.util.Locale;
import java.util.Scanner;

import Static.Entities.CurrencyConverter;

public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(var sc = new Scanner(System.in)){
            System.out.println("What is the dollar price? ");
            var dollar = sc.nextDouble();
            System.out.println("How many dollars will be bought? ");
            var amount = sc.nextDouble();

            System.out.printf("Amount to be paid in reais = %.2f",  CurrencyConverter.dollarToReal(amount, dollar));
        }
    }
}
