package Heranca.Entities;

public final class SavingsAccount extends Account{ //final faz com que a classe não seja herdada
    private double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(int number, String holder, double balance, double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public final void withdraw(double amount){ //final faz com que o método não possa ser sobreposto
        balance -= amount;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
