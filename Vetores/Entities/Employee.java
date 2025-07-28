package Vetores.Entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        this.salary += (percent * salary)/100;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, name, salary);
    }
}
