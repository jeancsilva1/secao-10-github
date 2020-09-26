/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Exercicio_proposto_lista {

    public static void main(String[] args) {
        int n;
        List<Funcionario> listfunc = new ArrayList<>();
        Funcionario funcionario = new Funcionario();
        Scanner in = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Employee #" + i + ":");
            System.out.println("");
            System.out.print("Id:");
            int id = in.nextInt();
            in.nextLine();
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Salary:");
            Double salario = in.nextDouble();
            funcionario = new Funcionario(id, name, salario);
            listfunc.add(funcionario);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = in.nextInt();

        funcionario = listfunc.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (funcionario == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = in.nextDouble();
            funcionario.increaseSalary(percentage);
        }

        System.out.println("List of Employees:");
        for (Funcionario funcionario1 : listfunc) {
            System.out.println(funcionario1);

        }
        in.close();
    }
}
