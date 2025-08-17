package Polimorfismo.Entities;

public class ImportedProduct extends Product{
  private double customsFree;

  
  public ImportedProduct() {
    super();
  }
  
  public ImportedProduct(String name, double price, double customsFree) {
    super(name, price);
    this.customsFree = customsFree;
  }
  
  @Override
  public String priceTag() {
    return String.format("%s $ %.2f (Customs free: $ %.2f)", name, totalPrice(), customsFree);
  }

  public double totalPrice(){
    return price + customsFree;
  }

  public double getCustomsFree() {
    return customsFree;
  }

  public void setCustomsFree(double customsFree) {
    this.customsFree = customsFree;
  }  
}
