package DataHora;

import java.text.SimpleDateFormat;
import java.util.*;

public class Aul06 {
    public static void main(String[] args) throws Exception{
        //Usando Date java8
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("25/06/2019");
        Date y2 = sdf2.parse("25/06/2019 15:42:07");

        Date x1 = new Date(); //instancia a data de agora

        System.out.println(y1); //impriessão padrão do date calendar
        System.out.println(sdf1.format(y1)); //imprime com a formatação
        System.out.println(sdf2.format(y2));
        System.out.println(sdf2.format(x1));
        System.out.println(sdf3.format(x1)); //imprime com o horário de Londres

    }    
}
