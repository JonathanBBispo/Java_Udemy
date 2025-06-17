package Classes;
import java.util.Scanner;

import Classes.Entities.Employee;

public class Ex2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var func = new Employee();
        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.print("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();
        System.out.println(func);
        System.out.print("Wich percentage to increase salary: ");
        func.increaseSalary(sc.nextDouble());
        System.out.println(func);
        
        sc.close();
        
    }
    
}
