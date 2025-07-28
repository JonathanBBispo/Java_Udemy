package Vetores;
import java.util.*;

import Vetores.Entities.Employee;

public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(var sc = new Scanner(System.in)){
            System.out.print("How many employees will be registered ");
            var n = sc.nextInt();
            var employees = new ArrayList<Employee>();

            for(int i=0; i < n; i++){
                System.out.printf("Employee #%d:\n", i+1);
                System.out.print("Id: ");
                var id = sc.nextInt();
                while(hasId(id, employees)){
                    System.out.print("Id already taken. Try again: ");
                    id = sc.nextInt();
                }

                System.out.print("Name: ");
                sc.nextLine();
                var name = sc.nextLine();

                System.out.print("Salary: ");
                var salary = sc.nextDouble();

                Employee employee = new Employee(id, name, salary);
                employees.add(employee);
            }
            
            System.out.print("Enter the employee id that will have salary increase : ");
            var id = sc.nextInt();

            Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if(emp == null) System.out.println("This id does not exist!");
            else{
                System.out.print("Enter the percentage: ");
                var percent = sc.nextDouble();
                emp.increaseSalary(percent);
            }

            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public static boolean hasId(int id, ArrayList<Employee> employees){
        for (Employee employee : employees) {
            if(employee.getId() == id) return true;
        }
        return false;
    }
}
