package EnumComposicao;
import EnumComposicao.Entities.Enums.WorkLevel;
import EnumComposicao.Entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            DateTimeFormatter ft1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.print("Enter department's name: ");
            var departmentName = sc.nextLine();

            System.out.print("Enter worker data: ");
            System.out.print("Name: ");
            var name = sc.nextLine();

            System.out.print("Level: ");
            var workLevel = sc.nextLine();
            WorkLevel level = WorkLevel.valueOf(workLevel.toUpperCase());

            System.out.print("Base salary: ");
            var baseSalary = sc.nextDouble();

            var worker = new Worker(name, level, baseSalary, new Department(departmentName));

            System.out.print("How many contracts to this worker? ");
            var cont = sc.nextInt();

            for(int i=0; i < cont; i++){
                System.out.printf("Enter contract #%d data:", i+1);
                System.out.print("Date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), ft1);
                
                System.out.print("Value per hour: ");
                var valuePerHour = sc.nextDouble();

                System.out.print("Duration (hours): ");
                var hours = sc.nextInt();

                worker.addContract(new HourContract(date, valuePerHour, hours));
            }

            System.out.println();
            System.out.print("Enter month and year to calculate income (MM/YYYY)");
            String monthYear = sc.next();
            int month = Integer.parseInt(monthYear.substring(0, 2));
            int year = Integer.parseInt(monthYear.substring(3));

            System.out.printf("Name: %s\n", worker.getName());
            System.out.printf("Department: %s\n", worker.getDepartment().getName());
            System.out.printf("Income for %s: %.2f\n", monthYear, worker.income(year, month));
        }
    }
}
