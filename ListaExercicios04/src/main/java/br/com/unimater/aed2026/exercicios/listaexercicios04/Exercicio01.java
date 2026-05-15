/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio01 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
       String[] dias = {"Domingo", "Segunda", "Terça", "Quarta",
                        "Quinta", "Sexta", "Sábado"};

        double[] gastos = new double[7]; 
        double soma = 0;

        
        for (int i = 0; i < dias.length; i++) {
            System.out.print("Digite o total de gasto de " + dias[i] + ": R$ ");
            
            gastos[i] = scanner.nextDouble(); 
            
            soma += gastos[i]; 
        }
        

        System.out.println("\nGastos da semana:\n ");

        
        for (int i = 0; i < dias.length; i++) {
            System.out.printf("%s: R$ %.2f%n", dias[i], gastos[i]);
            
        }

        
        System.out.printf("\nTotal gasto na semana: R$ %.2f%n", soma);

        
        scanner.close();
    }
}