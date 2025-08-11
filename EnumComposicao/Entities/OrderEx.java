package EnumComposicao.Entities;

import EnumComposicao.Entities.Enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderEx {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public OrderEx(){}

    public OrderEx(LocalDateTime moment,OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public LocalDateTime getMoment() {
        return moment;
    }
    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public OrderStatus getStatus() {
        return status;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "ORDER SUMMARY: \nOrder moment: " + moment.format(fmt) + 
            "\nOrder status: " + status +
            "\nClient: " + getClient().getName() +
            " (" + getClient().getBirthDate().format(fmt2) + ") - " + getClient().getEmail() + 
            "\nOrder items:\n");
        
        double totalPrice = 0;
        for (OrderItem item : items) {
            sb.append(item);
            totalPrice += item.subTotal();
        }

        sb.append("Total price: $" + totalPrice);

        return sb.toString();
    }
}
