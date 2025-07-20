package Vetores;
import java.util.Scanner;

public class ExVetor08 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantos elementos terá o vetor? ");
            var max = sc.nextInt();
            int [] numeros = new int[max];
            for(int i = 0; i < max; i++){
                System.out.print("Digite um número: ");
                numeros[i] = sc.nextInt();
            }

            double med = 0;
            int contPar = 0;
            for (int num : numeros) {
                if(num % 2 == 0){
                    med += num;
                    contPar ++;
                }                  
            }
            if(contPar > 0){
                med /= contPar;
                System.out.printf("Media dos pares = %.2f", med);
            }else System.out.println("Nenhum numero par");
        }
    }
}
