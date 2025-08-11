package EnumComposicao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import EnumComposicao.Entities.Product;
import EnumComposicao.Entities.OrderItem;
import EnumComposicao.Entities.Enums.OrderStatus;
import EnumComposicao.Entities.Client;
import EnumComposicao.Entities.OrderEx;


public class Ex3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Enter cliente data: ");
            System.out.print("Name: ");
            var name = sc.nextLine();

            System.out.print("Email: ");
            var email = sc.nextLine();
            
            System.out.print("Birth date (DD/MM/YYYY): ");
            LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt);

            var client = new Client(name, email, birthDate);

            System.out.println("Enter order data: ");
            System.out.print("Status: ");
            OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine().toUpperCase());

            OrderEx order = new OrderEx(LocalDateTime.now(), orderStatus, client);

            System.out.print("How many items to this order? ");
            var n = sc.nextInt();
            for(int i = 0; i < n; i++){
                System.out.printf("Enter #%d item data\n", i+1);
                System.out.print("Product name: ");
                var produtoName = sc.next();
                
                System.out.print("Product price: ");
                var price = sc.nextDouble();

                Product product = new Product(produtoName, price);

                System.out.print("Quantity: ");
                var quantity = sc.nextInt();
                OrderItem Orderitem = new OrderItem(quantity, price, product);
                
                order.addItem(Orderitem);
            }

            System.out.println();
            System.out.println(order);
        }
    }
}
