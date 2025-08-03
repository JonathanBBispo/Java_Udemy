package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aul03 {
    public static void main(String[] args) {
        //Convertendo data-hora global para local
        Instant d03 = Instant.parse("2025-08-01T20:27:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); //converte a data global em local com o zoneid do computador
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); //converte a data global em local com o zoneid escolhido
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
