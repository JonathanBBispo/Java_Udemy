package Construtores.Entities;
public class ContaBancaria {
    private String name = null;
    private int account;
    private double deposit;

    public ContaBancaria(String name, int account, double deposit){
        this.name = name;
        this.account = account;
        depositValue(deposit);
    }

    public ContaBancaria(String name, int account){
        this.name = name;
        this.account = account;
        depositValue(0.0);
    }

    public void depositValue(double amount) {
        this.deposit += amount;
    }

    public void withdraw(double amount){
        this.deposit -= 5.0 + amount;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
        "\nUpdate account data:\nAccount %d, Holder: %s, Balance: $ %.2f\n"
        ,account, name, deposit);
    }
    
}
