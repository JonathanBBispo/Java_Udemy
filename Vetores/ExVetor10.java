package Vetores;
import java.util.Scanner;

public class ExVetor10 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantos alunos serão digitados? ");
            var num = sc.nextInt();
            String[] alunos = new String[num];
            double [] sem1 = new double[num]; 
            double [] sem2 = new double[num];
            for(int i=0; i < num; i++){
                System.out.printf("Digite nome, primeira e segunda nota do %do aluno\n", i+1);
                sc.nextLine();
                alunos[i] = sc.nextLine();
                sem1[i] = sc.nextDouble();
                sem2[i] = sc.nextDouble();
            }

            System.out.println("Alunos aprovados");
            for (int i=0; i < num; i++) {
                if((sem1[i] + sem2[i]) / 2 >= 6)
                    System.out.println(alunos[i]);
            }
        }
    }    
}
