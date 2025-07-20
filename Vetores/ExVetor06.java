package Vetores;
import java.util.Scanner;

public class ExVetor06 {
    public static void main(String[] args) {
        try(var sc = new Scanner(System.in)){
            System.out.print("Quantos valores terão cada vetor? ");
            var max = sc.nextInt();
            var a = new int[max];
            var b = new int[max];
            var c = new int[max];
            
            System.out.println("Digite os valores do vetor A");
            criaVetor(a, max, sc);
            System.out.println("Digite os valores do vetor B");
            criaVetor(b, max, sc);
            
            System.out.println("Vetor resultante:");
            for(int i = 0; i < max; i++) c[i] = a[i] + b[i];
            for(int num : c) System.out.println(num);
        }
    }

    public static void  criaVetor(int [] x, int max, Scanner sc){
        for(int i=0; i < max; i++) x[i] = sc.nextInt();
    }
}
