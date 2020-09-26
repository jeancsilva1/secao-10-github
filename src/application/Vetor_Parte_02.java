/*
 Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos
 */
package application;

import entities.Produto;
import java.util.Scanner;

public class Vetor_Parte_02 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
       int n = in.nextInt();
       Produto[] p = new Produto[n];
        Produto produto = new Produto();
        for(int i = 0; i<n; i++){
         in.nextLine();
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Preço: ");
            double preco = in.nextDouble();
            p[i] = new Produto(nome, preco);
            
        }
        double soma = 0;
        double media =0;
        
        for(int i = 0; i<n; i++){
            soma += p[i].getPreco();
        }
        
        media = soma /n;
        System.out.println("Media: " + media);
    }

}
