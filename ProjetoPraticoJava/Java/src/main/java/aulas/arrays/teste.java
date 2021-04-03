package aulas.arrays;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para linhas e colunas da matriz: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        System.out.println("Digite os números a serem inseridos na matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
                System.out.println(matriz[i][j]);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[j].length; j++) {
                matriz[j][i] = sc.nextInt();
                System.out.println(matriz[i][j]);
            }
        }
    }
}

