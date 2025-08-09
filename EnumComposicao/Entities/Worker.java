package EnumComposicao.Entities;

import java.util.ArrayList;
import java.util.List;

import EnumComposicao.Entities.Enums.WorkLevel;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}
    public Worker(String name, WorkLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        for (HourContract contract : contracts) {
            int contractYear = contract.getDate().getYear();
            int contractmouth = contract.getDate().getMonthValue();
            if(year == contractYear && month == contractmouth) sum += contract.totalValue();
        }
        return sum;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Department getDepartment() {
        return department;
    }public void setDepartment(Department department) {
        this.department = department;
    }

    public WorkLevel getLevel() {
        return level;
    }public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
}
