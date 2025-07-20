package Vetores;
import java.util.*;
public class ExVetor03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        var max = sc.nextInt();

        var nomePessoas = new String[max]; 
        var idadePessoas = new int[max]; 
        var alturaPessoas = new double[max];
        double mediAltura = 0;
        double percent = 0.0;
        
        for(int i=0; i<max; i++){
            System.out.printf("Dados da %d° pessoa\n", i+1);
            System.out.print("Nome: ");
            nomePessoas[i] = sc.next();
            System.out.print("Idade: ");
            idadePessoas[i] = sc.nextInt();
            if(idadePessoas[i] < 16)
                percent++;
            System.out.print("Altura: ");
            alturaPessoas[i] = sc.nextDouble();
            mediAltura += alturaPessoas[i];
        }
        mediAltura /= max;
        percent = (percent / max) * 100;

        System.out.printf("\nAltura média: %.2f\n", mediAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.0f%%\n", percent);
        for(int i=0; i<max; i++)
            if(idadePessoas[i] < 16)
                System.out.println(nomePessoas[i]);

            
        sc.close();
    }
}
