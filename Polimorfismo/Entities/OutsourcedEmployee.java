package Polimorfismo.Entities;

public class OutsourcedEmployee extends Employee{
    double additionalCharge;

    
    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee() {
        super();
    }



    @Override
    public double payment(int hour, double valuePerHour) {
        return super.payment(hour, valuePerHour) + (additionalCharge * 1.1);
    }
}
