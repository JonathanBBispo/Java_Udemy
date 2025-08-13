package Heranca.Entities;

public class BusinessAcount extends Account{
    private double loanLimit;

    public BusinessAcount(){
        super();
    }
    public BusinessAcount(int number, String holder, double balance,double loanLimit){
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit) balance += amount - 10.0;
    }

    public double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

}