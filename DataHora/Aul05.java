package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aul05 {
    public static void main(String[] args) {
        //Cálculos com data-hora
        LocalDate d01 = LocalDate.parse("2025-08-03");
        LocalDateTime d02 = LocalDateTime .parse("2025-08-03T17:30:20");
        Instant d03 = Instant.parse("2025-08-03T17:30:20Z");

        LocalDate semanaPas = d01.minusDays(7);
        LocalDate proxSemana = d01.plusDays(7);

        System.out.println("seamana passada = " + semanaPas);
        System.out.println("próxima seamana = " + proxSemana);
        
        
        LocalDateTime pasMinuto = d02.minusMinutes(30);
        LocalDateTime proxHora = d02.plusHours(1);
        
        System.out.println("Minutos atrása = " + pasMinuto);
        System.out.println("Próxima hora = " + proxHora);

        Instant semanaPasInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant proxSemanaInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("seamana passada = " + semanaPasInstant);
        System.out.println("próxima seamana = " + proxSemanaInstant);

        Duration t1 = Duration.between(semanaPas.atStartOfDay(), d01.atTime(0,0)); // precisa colocar horário para saber a diferença entre data local
        Duration t2 = Duration.between(semanaPasInstant, d03);

        System.out.println("Diferença de dias = " + t1.toDays());
        System.out.println("Diferença de dias = " + t2.toDays());
    }
}
