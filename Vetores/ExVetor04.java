package Vetores;
import java.util.Scanner;

public class ExVetor04 {
    public static void main(String[] args) {
        try(var sc = new Scanner(System.in)){
            System.out.print("Quantos numeros voce deseja digitar? ");
            var max = sc.nextInt();
            var numeros = new int[max];
            int par = 0;
            for(int i=0; i < max; i++){
                System.out.print("Digite um numero: ");
                numeros[i] = sc.nextInt();
            }
            System.out.println("\nNumeros pares:");
            for(int i=0; i < max; i++) 
                if(numeros[i] % 2 == 0){
                    System.out.printf("%d ", numeros[i]);
                    par++;   
                }
            System.out.printf("\n\nQuantidade de pares = %d", par);        
        }        
    }
}
