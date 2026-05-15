/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio13 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
        double[] tempos = new double[8];

        System.out.println("Digite os tempos das 8 sessões em segundos:");
        for (int i = 0; i < tempos.length; i++) {
            System.out.print("Treino " + (i + 1) + ": ");
            tempos[i] = scanner.nextDouble();
        }

        double melhorTempo = tempos[0];
        double piorTempo = tempos[0];
        int treinoMelhor = 1; 

        for (int i = 1; i < tempos.length; i++) {
            if (tempos[i] < melhorTempo) {
                melhorTempo = tempos[i];
                treinoMelhor = i + 1; 
            }
            if (tempos[i] > piorTempo) {
                piorTempo = tempos[i];
            }
        }

        System.out.println("\n---> DESEMPENHO <---");
        System.out.printf("a) Melhor tempo: %.2f s%n", melhorTempo);
        System.out.printf("b) Pior tempo: %.2f s%n", piorTempo);
        System.out.printf("c) O melhor tempo ocorreu no Treino %d%n", treinoMelhor);

         
        scanner.close();
    }
}