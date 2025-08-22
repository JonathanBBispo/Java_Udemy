import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.Reservation;
import Exceptions.DomainException;

public class Aula {
  public static void main(String[] args){
    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    try(Scanner sc = new Scanner(System.in)){
      try{
        System.out.print("Room number: ");
        var number = sc.nextInt();
  
        System.out.print("Check-in date (DD/MM/YYYY): ");
        Date checkIn = fmt.parse(sc.next());
        System.out.print("Check-out date (DD/MM/YYYY): ");
        Date checkOut = fmt.parse(sc.next());
        
        Reservation reservation = new Reservation(number, checkIn, checkOut);
        System.out.print("Reservation: " + reservation);
        System.out.println();
        System.out.println("Enter data to update the reservation: ");
        System.out.print("Check-in date (DD/MM/YYYY): ");
        checkIn = fmt.parse(sc.next());
        System.out.print("Check-out date (DD/MM/YYYY): ");
        checkOut = fmt.parse(sc.next());
  
        reservation.updateDates(checkIn, checkOut);
        System.out.print("Reservation: " + reservation);
      }
      catch (ParseException e) {
			System.out.println("Invalid date format");
		  }
      catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		  }
      catch (RuntimeException e) {
			System.out.println("Unexpected error");
      }
    }  
  } 
}
