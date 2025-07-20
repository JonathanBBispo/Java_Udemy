package Vetores;
import java.util.Scanner;

public class ExVetor11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantas pessoas serão digitadas? ");
            var num = sc.nextInt();
            var alturas = new double [num];
            var generos = new char [num];

            for(int i = 0; i < num; i++){
                System.out.printf("Altura da %da pessoa: ", i+1);
                alturas[i] = sc.nextDouble();
                System.out.printf("Genero da %da pessoa: ", i+1);
                generos[i] = sc.next().charAt(0);
            }

            double menorAlt = alturas[0], maiorAlt = alturas[0];
            for (double altura : alturas) {
                if(altura > maiorAlt) maiorAlt = altura;
                if(altura < menorAlt) menorAlt = altura;
            }
            double medAltF = 0.0;
            int contM = 0, contF = 0;
            for(int i=0; i < num; i++)
                if(generos[i] == 'f' || generos[i] == 'F'){
                    medAltF += alturas[i]; 
                    contF++;
                } else contM++;
            medAltF /= contF;
            System.out.printf("Menor altura = %.2f\n", menorAlt);
            System.out.printf("Maior altura = %.2f\n", maiorAlt);
            System.out.printf("Media das alturas das mulheres = %.2f\n", medAltF);
            System.out.printf("Numeros de homens = %d", contM);
        }
    }
    
}
