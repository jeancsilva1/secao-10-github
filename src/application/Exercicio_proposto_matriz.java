/*
Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz
 */
package application;

import java.util.Scanner;

public class Exercicio_proposto_matriz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ordem da Matriz:");
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }

        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
//System.out.print(mat[i][j] + " ");
            }

        }
        System.out.println("Negativos: " + count);
        for (int i = 0; i < n; i++) {
         

                System.out.print(mat[i][i] + " ");
            
        }
    }
}
