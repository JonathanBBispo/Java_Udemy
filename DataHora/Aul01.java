package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aul01 {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //instancias
        LocalDate d01 = LocalDate.now(); //data local
        LocalDateTime d02 = LocalDateTime.now(); //data-hora local
        Instant d03 = Instant.now(); // data-hora global

        LocalDate d04 = LocalDate.parse("2025-08-01"); //texto ISO 8601 data local
        LocalDateTime d05 = LocalDateTime.parse("2025-08-01T20:27:26"); //texto ISO 8601 data-hora local
        Instant d06 = Instant.parse("2025-08-01T20:27:26Z"); //texto ISO 8601 data-hora global
        Instant d07 = Instant.parse("2025-08-01T20:27:26-03:00"); //texto ISO 8601 data-hora global com GMT diferente
        LocalDate d08 = LocalDate.parse("01/08/2025", fmt1); //texto customizado
        LocalDate d09 = LocalDate.of(2025, 8, 1); //data local com valores separados

        System.out.println("Instanciação:");
        System.out.println("Data local = " + d01);
        System.out.println("Data-hora local = " + d02);
        System.out.println("Data-hora global = " + d03);
        System.out.println("Texto ISO8601 data local = " + d04);
        System.out.println("Texto ISO8601 data-hora local = " + d05);
        System.out.println("Texto ISO8601 data-hora global = " + d06);
        System.out.println("Texto ISO8601 data-hora global (GMT-3) = " + d07);
        System.out.println("Texto customizado = " + d08);
        System.out.println("Data com valores separados = " + d09);
    }
}
