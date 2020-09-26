package application;

import entities.Estudante;
import java.util.Scanner;

public class Exercicio_proposto {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("How many rooms will be rented?");
        int n = in.nextInt();
        Estudante[] vect = new Estudante[10];
        for (int i = 1; i <= n; i++) {
            in.nextLine();
            System.out.print("Rent #" + i + ":");
            System.out.print("Name: ");
            String nome = in.nextLine();
            System.out.print("Email: ");
            String email = in.nextLine();
            System.out.print("Room: ");
            int quarto = in.nextInt();
            vect[quarto] = new Estudante(nome, email);

        }
        for(int i = 0; i<10; i++){
            if(vect[i] != null)
        System.out.print(i + " - "+ vect[i]);
        }

    }
}
