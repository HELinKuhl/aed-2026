/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio09 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
        int[][] ocupacao = new int[5][4];

        String[] dias = {"Dia 1", "Dia 2", "Dia 3", "Dia 4", "Dia 5"};
        String[] periodos = {"Manhã", "Tarde", "Noite", "Madrugada"};

        System.out.println("Digite a quantidade de veículos:");
        for (int i = 0; i < 5; i++) { 
            System.out.println(dias[i] + ":");
            for (int j = 0; j < 4; j++) { 
                System.out.print(" " + periodos[j] + ": ");
                ocupacao[i][j] = scanner.nextInt();
            }
        }

        int totalGeral = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                totalGeral += ocupacao[i][j];
            }
        }

        System.out.println("\n---> RELATÓRIO <---");

        for (int i = 0; i < 5; i++) {
            int totalDia = 0;
            int maiorPeriodo = ocupacao[i][0];
            int indiceMaior = 0;

            for (int j = 0; j < 4; j++) {
                totalDia += ocupacao[i][j];
                if (ocupacao[i][j] > maiorPeriodo) {
                    maiorPeriodo = ocupacao[i][j];
                    indiceMaior = j;
                }
            }

            System.out.printf("\n%s: %d veículos no total%n", dias[i], totalDia);
            System.out.printf("Período com mais veículos: %s com %d%n", periodos[indiceMaior], maiorPeriodo);
        }

        
        System.out.println("\n\nTotal geral dos 5 dias: " + totalGeral + " veículos");
         
        scanner.close();
    }
}