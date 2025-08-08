package EnumComposicao;

import EnumComposicao.Entities.Order;
import EnumComposicao.Entities.Enums.OrderStatus;

import java.util.Date;

public class Aul01 {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //conversão de string para enum

        System.out.println(os1);
        System.out.println(os2);
    }
}
