/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio10 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
        int[][] producao = new int[3][6];

        System.out.println("Digite a produção de cada máquina por turno:");
        for (int i = 0; i < 3; i++) { 
            System.out.println("Máquina " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) { 
                System.out.print(" Turno " + (j + 1) + ": ");
                producao[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n---> RELATÓRIO <---");

        int[] totalMaquina = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                totalMaquina[i] += producao[i][j];
            }
            System.out.printf("Máquina %d produziu: %d unidades%n", (i + 1), totalMaquina[i]);
        }

        System.out.println();

        int[] totalTurno = new int[6];
        for (int j = 0; j < 6; j++) { 
            for (int i = 0; i < 3; i++) { 
                totalTurno[j] += producao[i][j];
            }
            System.out.printf("Turno %d produziu: %d unidades%n", (j + 1), totalTurno[j]);
        }

        int maiorProducao = totalMaquina[0];
        int maquinaMaior = 1;
        for (int i = 1; i < 3; i++) {
            if (totalMaquina[i] > maiorProducao) {
                maiorProducao = totalMaquina[i];
                maquinaMaior = i + 1;
            }
        }

        
        System.out.printf("\nMáquina com maior produção: Máquina %d com %d unidades%n", maquinaMaior, maiorProducao);

         
        scanner.close();
    }
}