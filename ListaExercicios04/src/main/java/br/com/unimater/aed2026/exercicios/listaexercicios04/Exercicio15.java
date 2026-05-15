/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio15 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
        double[][] lancamentos = new double[4][4];

        
        System.out.println("Digite os 16 valores do relatório financeiro:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Posição [%d][%d]: ", i, j);
                lancamentos[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n---> AUDITORIA <---");

        
        double somaDiagonal = 0;
        for (int i = 0; i < 4; i++) {
            somaDiagonal += lancamentos[i][i];
        }
        System.out.printf("a) Soma da diagonal principal: %.2f%n", somaDiagonal);

        
        System.out.println("\nb) Soma de cada coluna:");
        for (int j = 0; j < 4; j++) { 
            double somaColuna = 0;
            for (int i = 0; i < 4; i++) { 
                somaColuna += lancamentos[i][j];
            }
            System.out.printf(" Coluna %d: %.2f%n", j, somaColuna);
        }

        double maiorValor = lancamentos[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (lancamentos[i][j] > maiorValor) {
                    maiorValor = lancamentos[i][j];
                }
            }
        }
        System.out.printf("\nc) Maior valor na matriz: %.2f%n", maiorValor);

        int negativos = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (lancamentos[i][j] < 0) {
                    negativos++;
                }
            }
        }
        System.out.printf("d) Quantidade de valores negativos: %d%n", negativos);

         
        scanner.close();
    }
}