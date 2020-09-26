/*
Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
 */
package application;

import java.util.Scanner;

public class Exercicio_proposto_matriz_02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ordem da matriz: ");
        int m = in.nextInt();
        int n = in.nextInt();
        int mat[][] = new int[m][n];

        System.out.println("Preencha a matriz " + m + "x" + n + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();

            }
        }
        System.out.print("Escolha um numero da matriz:");
        int x = in.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + (mat[i][j - 1]));
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + (mat[i][j + 1]));
                    }

                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    break;
                }

            }
        }

    }
}
