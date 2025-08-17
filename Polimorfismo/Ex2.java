package Polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.Entities.Product;
import Polimorfismo.Entities.UsedProduct;
import Polimorfismo.Entities.ImportedProduct;

public class Ex2 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<Product> products = new ArrayList<>();
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("Enter the number of product: ");
      var n = sc.nextInt();

      for(int i=1; i<=n; i++){
        System.out.printf("Product #%d data\n", i);
        System.out.print("Common, used or imported (c/u/i)? ");
        var ch = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Name: ");
        var name = sc.nextLine();

        System.out.print("Price: ");
        var price = sc.nextDouble();
        
        switch (ch){
          case 'i':
            System.out.print("Custom free: ");
            var customsFree = sc.nextDouble();
            products.add(new ImportedProduct(name, price, customsFree));
            break;
          
          case 'u':
            System.out.print("Manufacture date (DD/MM/YYYY): ");
            LocalDate manufacturDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            products.add(new UsedProduct(name, price, manufacturDate));
            break;
          
            default:
            products.add(new Product(name, price));
            break;
        }
        System.out.println();
      }

      System.out.println("PRICE TAGS: ");
      for (Product product: products) {
        System.out.println(product.priceTag());
      }
    }
  }
}