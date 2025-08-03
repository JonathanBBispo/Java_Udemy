package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aul04 {
    public static void main(String[] args) {
        //obtendo dados de data-hora local
        LocalDate d01 = LocalDate.parse("2025-08-03");
        LocalDateTime d02 = LocalDateTime.parse("2025-08-03T17:30:20");

        System.out.println("d01 dia = " + d01.getDayOfMonth());
        System.out.println("d01 mês = " + d01.getMonthValue());
        System.out.println("d01 ano = " + d01.getYear());

        System.out.println("d02 hora = " + d02.getHour());
        System.out.println("d02 hora = " + d02.getMinute());
    }    
}
