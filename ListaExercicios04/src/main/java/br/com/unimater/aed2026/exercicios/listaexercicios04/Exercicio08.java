/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio08 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
        double[] precos = new double[10];

        System.out.println("Digite o preço dos 10 produtos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Produto " + (i + 1) + ": R$ ");
            precos[i] = scanner.nextDouble();
        }

        for (int i = 0; i < precos.length; i++) {
            precos[i] = precos[i] * 1.08; 
        }

        double maiorPreco = precos[0];
        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > maiorPreco) {
                maiorPreco = precos[i];
            }
        }

        
        System.out.println("\n--> PREÇOS ATUALIZADOS COM 8% <--\n");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", (i + 1), precos[i]);
        }

        System.out.printf("\nMaior preço após reajuste: R$ %.2f%n", maiorPreco);

        scanner.close();
    }
}