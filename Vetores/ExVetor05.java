package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExVetor05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(var sc = new Scanner(System.in)){
            System.out.print("Quantos numeros voce vai digitar? ");
            var max = sc.nextInt();
            double[] numeros = new double[max];
            
            double maior = 0;
            int pos = 0;
            for(int i = 0; i < max; i++){
                System.out.print("Digite um numero: "); 
                numeros[i] = sc.nextDouble();
                if(numeros[i] >= maior){
                    maior = numeros[i];
                    pos = i;
                }
            }
            System.out.printf("\nMaior valor = %.2f", maior);
            System.out.printf("\nPosicao do Maior valor = %d", pos);
        }
    }    
}
