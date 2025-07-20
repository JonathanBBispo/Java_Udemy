package Vetores;
import java.util.Scanner;

public class ExVetor01 {
    public static void main(String[] args) {
        int max;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Quantos números deseja digitar?");
            max = sc.nextInt();
        }while(max > 10);

        int [] vetor = new int[max];
        for(int i=0; i < max; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Números negativos:");
        for(int i = 0; i < max; i++)
            if(vetor[i] < 0) System.out.println(vetor[i]);

        sc.close();
    }
}
