package Vetores;
import java.util.*;

import Vetores.Entities.Aluguel;
public class Ex6 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int max = 10, n;
        var aluguel = new Aluguel[max];
        do{
            System.out.print("How many rooms will be rented? ");
            n = sc.nextInt();
        }while(n > max);

        for(int i=0; i < n; i++){
            System.out.printf("Rent #%d\n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            aluguel[room] = new Aluguel(name, email);
            System.out.println();
        }
        System.out.printf("\nBusy rooms:\n");
        for(int i=0; i < max; i++)
            if(aluguel[i] != null)
                System.out.printf("%d: %s\n", i, aluguel[i]);

        sc.close();

    }
    
}
