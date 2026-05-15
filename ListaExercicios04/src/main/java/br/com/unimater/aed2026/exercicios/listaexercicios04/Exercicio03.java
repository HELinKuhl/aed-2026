/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         double[] temperaturas = new double[6];

        
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            
        }

        
        double maior = temperaturas[0];
        double menor = temperaturas[0];

        
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
                
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        double diferenca = maior - menor;

        
        
        System.out.printf("Maior temperatura: %.1f°C%n", maior);
        System.out.printf("Menor temperatura: %.1f°C%n", menor);
        System.out.printf("Diferença: %.1f°C%n", diferenca);

        scanner.close();
    }
}
