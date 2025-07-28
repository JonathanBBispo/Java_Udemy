package Vetores;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int m, n;
            m = sc.nextInt();
            n = sc.nextInt();
            int [][] matriz = new int[m][n];

            for(int i = 0; i < matriz.length; i++)
                for(int j = 0; j < matriz[i].length; j++)
                    matriz[i][j] = sc.nextInt();

            int busca = sc.nextInt();

            for(int i = 0; i < matriz.length; i++)
                for(int j = 0; j < matriz[i].length; j++)
                    if(matriz[i][j] == busca){
                        System.out.printf("Position %d,%d:\n", i, j);
                        if(j > 0) {
                            System.out.printf("Left: %d\n", matriz[i][j-1]);
                        }
                        if(i > 0) {
                            System.out.printf("Up: %d\n", matriz[i-1][j]);
                        }
                        if(j < matriz[i].length-1) {
                            System.out.println("Right: " + matriz[i][j+1]);
                        }
                        if(i < matriz.length-1) {
                            System.out.println("Down: " + matriz[i+1][j]);
						}
                    }
        }
    }
}
