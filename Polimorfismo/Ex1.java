package Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Polimorfismo.Entities.Employee;
import Polimorfismo.Entities.OutsourcedEmployee;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("The number of employees: ");
            int n = sc.nextInt();
            Employee[] employees = new Employee[n];
            for(int i = 0; i < n; i++){
                System.out.printf("Employee #%d data: \n", i+1);
                System.out.print("Outsourced (y/n)? ");
                char choise = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Hours: ");
                int hours = sc.nextInt();

                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                if(choise == 'y') {
                    System.out.print("Additional charge: ");
                    double additionalCharge = sc.nextDouble();
                    employees[i] = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                }else{
                    employees[i] = new Employee(name, hours, valuePerHour);
                }
                System.out.println();
            }

            System.out.println("PAYMENTS:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
