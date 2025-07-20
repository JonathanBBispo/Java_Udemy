package Vetores;

import java.util.Scanner;

public class ExVetor09 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantas pessoas serão ddigitadas? ");
            var max = sc.nextInt();

            int [] idades = new int[max];
            String [] nomes = new String[max];

            for(int i = 0; i < max; i++){
                System.out.printf("Dados da %da pessoa\n", i+1);
                System.out.print("Nome: ");
                nomes[i] = sc.next();
                System.out.print("Idade: ");
                idades[i] = sc.nextInt();
            }


            int maiorIdade = 0, index = 0;
            for (int i = 0; i < max; i++){
                if(idades[i] > maiorIdade){ 
                    maiorIdade = idades[i];
                    index = i;
                }
            }
            System.out.printf("Pessoa mais velha: %s", nomes[index]);
        }
    }
}
