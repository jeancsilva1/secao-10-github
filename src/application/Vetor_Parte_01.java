/*
Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.
 */
package application;

import java.util.Scanner;

public class Vetor_Parte_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o tamanho do Vetor: ");
        int n = in.nextInt();
        System.out.println("");
         double[] vet = new double[n];
         for(int i = 0; i<n; i++){
             System.out.print("Informe a altura: ");
             vet[i] = in.nextDouble();
            
         }
         double soma = 0;
         for(int i = 0; i<n; i++){
             soma += vet[i];
         }
         
         double media = soma / n;
         System.out.println("Media: " + media);
             
        
        
    }

}
