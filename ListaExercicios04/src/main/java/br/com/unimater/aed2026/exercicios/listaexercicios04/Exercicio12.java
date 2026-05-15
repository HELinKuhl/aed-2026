/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio12 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         int[][] hotel = new int[4][5];

        System.out.println("Digite a quantidade de hóspedes em cada quarto:");
        for (int i = 0; i < 4; i++) { 
            System.out.println("Andar " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) { 
                System.out.print(" Quarto " + (j + 1) + ": ");
                hotel[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n---> RELATÓRIO <---");

        int[] totalAndar = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                totalAndar[i] += hotel[i][j];
            }
            System.out.printf("Andar %d: %d hóspedes%n", (i + 1), totalAndar[i]);
        }

        System.out.println();

        int maiorOcupacao = hotel[0][0];
        int andarMaior = 1;
        int quartoMaior = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (hotel[i][j] > maiorOcupacao) {
                    maiorOcupacao = hotel[i][j];
                    andarMaior = i + 1; 
                    quartoMaior = j + 1;
                }
            }
        }
        System.out.printf("Maior ocupação: Andar %d, Quarto %d com %d hóspedes%n",
                          andarMaior, quartoMaior, maiorOcupacao);

        
        int quartosVazios = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (hotel[i][j] == 0) {
                    quartosVazios++;
                }
            }
        }
        System.out.println("Quartos vazios: " + quartosVazios);

         
        scanner.close();
    }
}