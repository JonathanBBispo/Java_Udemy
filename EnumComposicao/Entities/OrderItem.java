package EnumComposicao.Entities;

public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem(int quantity, double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal(){
        return price * quantity;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f\n", getProduct().getName(), price, quantity, subTotal());
    }
}
