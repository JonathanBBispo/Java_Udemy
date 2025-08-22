package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import Exceptions.DomainException;

public class Reservation {
  private int roomNumber;
  private Date checkIn;
  private Date checkOut;

  private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

  public long duration(){
    long diff = checkOut.getTime() - checkIn.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }

  public void updateDates(Date checkIn, Date checkOut)throws DomainException{
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) throw new DomainException("Reservation dates for update must be future dates"); 
		if (!checkOut.after(checkIn))	throw new DomainException("Check-out date must be after check-in date");

    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public Reservation() {
  }
  

  public Reservation(int roomNumber, Date checkIn, Date checkOut) throws DomainException{
    if (!checkOut.after(checkIn)) throw new DomainException("Check-out date must be after check-in date");
    this.roomNumber = roomNumber;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
  }

  public int getRoomNumber() {
    return roomNumber;
  }
  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }
  public Date getCheckIn() {
    return checkIn;
  }
  public Date getCheckOut() {
    return checkOut;
  }

  @Override
  public String toString() {
    return String.format("Room %s, check-in: %s, check-out: %s, %d nights", roomNumber, fmt.format(checkIn),fmt.format(checkOut), duration());
  }
}
