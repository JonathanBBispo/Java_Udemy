package Classes;
import java.util.Scanner;

import Classes.Entities.Rectangle;

import java.util.Locale;

public class Ex1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        var retangle = new Rectangle(4.0, 5);

        System.out.println("Enter rectangle width and height:");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();
        System.out.println(retangle);
        sc.close();
    }
}
