package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aul02 {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2025-08-01");
        LocalDateTime d02 = LocalDateTime.parse("2025-08-01T20:27:26");
        Instant d03 = Instant.parse("2025-08-01T20:27:26Z");
        //formatação
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d01 = " + d01.format(fmt1));
        //equivalentes
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d01 = " + fmt1.format(d01));

        System.out.println("d02 = " + d02.format(fmt1));//formatação sem horário 
        System.out.println("d02 = " + d02.format(fmt2));

        System.out.println("d03 = " + fmt3.format(d03));


    }
}
