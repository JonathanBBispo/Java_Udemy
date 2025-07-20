package Vetores;
import java.util.Locale;
import java.util.Scanner;

public class ExVetor02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números voce vai digittar?");
        var max = sc.nextInt();
        var vetor = new double [max];
        double total = 0;
        for(int i=0; i<max; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextDouble();
            total += vetor[i];
        }
        var media = total / max;
        System.out.println("Valores = ");
        for(int i=0;i<max;i++)
            System.out.printf("%.2f ", vetor[i]);
        System.out.printf("\nSoma = %.2f\n", total);
        System.out.printf("Media = %.2f\n", media);
        sc.close();
    }
}
