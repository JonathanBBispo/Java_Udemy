package Polimorfismo.Entities;

public abstract class TaxPayer {
  protected String name;
  protected double anualIncome;

  public abstract double tax();

  public TaxPayer(){}
  public TaxPayer(String name, double anualIncome){
    this.name = name;
    this.anualIncome = anualIncome;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAnualIncome() {
    return anualIncome;
  }

  public void setAnualIncome(double anualIncome) {
    this.anualIncome = anualIncome;
  }
}
