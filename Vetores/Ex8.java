package Vetores;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            int[][] matriz = new int[num][num];
            for(int i=0; i < num; i++)
            for(int j = 0; j < num; j++)
            matriz[i][j] = sc.nextInt();
            
            System.out.println("Main diagonal:");
            for(int i = 0;i < num; i++)
            System.out.printf("%d " ,matriz[i][i]);
            
            int contNegative = 0;
            for(int i = 0; i < num; i++)
                for(int j = 0; j < num; j++)
                    if(matriz[i][j] < 0) contNegative++;

            System.out.printf("\nNegative number = %d", contNegative);
        }
    }
}
