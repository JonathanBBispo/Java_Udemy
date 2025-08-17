package Polimorfismo.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
  private LocalDate manufactureDate;

  public UsedProduct() {
    super();
  }
  public UsedProduct(String name, double price, LocalDate manufactureDate) {
    super(name, price);
    this.manufactureDate = manufactureDate;
  }

  @Override
  public String priceTag() {
    return String.format("%s (used) $ %.2f (Manufacture date: %s)", name, price, manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
  }

  public LocalDate getManufactureDate() {
    return manufactureDate;
  }
  public void setManufactureDate(LocalDate manufactureDate) {
    this.manufactureDate = manufactureDate;
  } 
}
