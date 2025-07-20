package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantos elementos terá o vetor? ");
            var max = sc.nextInt();
            double [] numeros = new double[max];
            double med = 0;
            for(int i = 0; i < max; i++){
                System.out.print("Digite um numero: ");
                numeros[i] = sc.nextDouble();
                med += numeros[i];
            }
            med /= max;
            System.out.printf("Media do vetor = %.3f\n", med);
            for (double num : numeros)
                if(num < med) System.out.println(num);
        }
    }    
}
