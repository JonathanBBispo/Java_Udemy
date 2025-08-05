package DataHora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class Aul07 {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2019-06-19T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime(); //adiciona 4h do dia e atualiza o objeto d
        System.out.println(sdf.format(d));

        int minutes = cal.get(Calendar.MINUTE); //coleca o minuto dawuela data
        int month = 1+ cal.get(Calendar.MONTH); //calendar inicia com janeiro sendo 0

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month); 
    }
}
