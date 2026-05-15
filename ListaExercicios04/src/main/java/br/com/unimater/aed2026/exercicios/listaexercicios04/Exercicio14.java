/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio14 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
        double[][] consumo = new double[5][4];

        System.out.println("Digite o consumo de energia em kWh:");
        for (int i = 0; i < 5; i++) { 
            System.out.println("Setor " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) { 
                System.out.print(" Semana " + (j + 1) + ": ");
                consumo[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n---> RELATÓRIO <---");

        double[] totalSetor = new double[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                totalSetor[i] += consumo[i][j];
            }
            System.out.printf("Setor %d consumiu: %.2f kWh%n", (i + 1), totalSetor[i]);
        }

        System.out.println();

        double[] totalSemana = new double[4];
        for (int j = 0; j < 4; j++) { 
            for (int i = 0; i < 5; i++) { 
                totalSemana[j] += consumo[i][j];
            }
            System.out.printf("Semana %d consumiu: %.2f kWh%n", (j + 1), totalSemana[j]);
        }

        double maiorConsumo = totalSetor[0];
        int setorMaior = 1;
        for (int i = 1; i < 5; i++) {
            if (totalSetor[i] > maiorConsumo) {
                maiorConsumo = totalSetor[i];
                setorMaior = i + 1;
            }
        }

        double somaGeral = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                somaGeral += consumo[i][j];
            }
        }
        double mediaGeral = somaGeral / (5 * 4); 

        System.out.printf("\nc) Setor com maior consumo: Setor %d com %.2f kWh%n", setorMaior, maiorConsumo);
        System.out.printf("d) Média geral de consumo: %.2f kWh%n", mediaGeral);

         
        scanner.close();
    }
}