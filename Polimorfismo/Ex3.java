package Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.Entities.Company;
import Polimorfismo.Entities.Individual;
import Polimorfismo.Entities.TaxPayer;

public class Ex3 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<TaxPayer> list = new ArrayList<>();
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("Enter the number of tax payers: ");
      var n = sc.nextInt();

      for(int i=1; i<=n; i++){
        System.out.printf("Tax payer #%d data: ", i);
        System.out.print("Individual or company (i/c)? ");
        var ch = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Name: ");
        var name = sc.nextLine();

        System.out.print("Anual income: ");
        var anualIncome = sc.nextDouble();

        if(ch == 'i'){
          System.out.print("Health expenditures: ");
          var healthExpenditures = sc.nextDouble();
          list.add(new Individual(name, anualIncome, healthExpenditures));
        }else{
          System.out.print("Number of employees: ");
          var numberOfEmployees = sc.nextInt();
          list.add(new Company(name, anualIncome, numberOfEmployees));
        }
        System.out.println();
      }

      double totalTaxes = 0;
      System.out.println("TAXES PAID:");
      for (TaxPayer tp : list) {
        System.out.printf("%s: $ %.2f\n", tp.getName(), tp.tax());
        totalTaxes += tp.tax();
      }
      System.out.println();
      System.out.printf("Total Taxes: $ %.2f", totalTaxes);
    }
  }
}
