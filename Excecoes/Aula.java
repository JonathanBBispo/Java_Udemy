import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.Reservation;

public class Aula {
  public static void main(String[] args) throws ParseException{
    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    try(Scanner sc = new Scanner(System.in)){
      System.out.print("Room number: ");
      var number = sc.nextInt();

      System.out.print("Check-in date (DD/MM/YYYY): ");
      Date checkIn = fmt.parse(sc.next());
      System.out.print("Check-out date (DD/MM/YYYY): ");
      Date checkOut = fmt.parse(sc.next());

      if(!checkOut.after(checkIn)) System.out.println("Error in reservation: Check-out date must be after check-in date");
      else{
        Reservation reservation = new Reservation(number, checkIn, checkOut);
        System.out.print("Reservation: " + reservation);

        System.out.println();
        System.out.println("Enter data to update the reservation: ");
        System.out.print("Check-in date (DD/MM/YYYY): ");
        checkIn = fmt.parse(sc.next());
        System.out.print("Check-out date (DD/MM/YYYY): ");
        checkOut = fmt.parse(sc.next());

        String error = reservation.updateDates(checkIn, checkOut);
			  if (error != null) System.out.println("Error in reservation: " + error);
        else{
          reservation.updateDates(checkIn, checkOut);
          System.out.print("Reservation: " + reservation);
        }
      } 
    }
  }
}
