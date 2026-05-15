/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio11 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         double[] distancias = new double[12];
        double soma = 0;

        System.out.println("Digite a distância das 12 entregas em km:");
        for (int i = 0; i < distancias.length; i++) {
            System.out.print("Entrega " + (i + 1) + ": ");
            distancias[i] = scanner.nextDouble();
            soma += distancias[i];
        }

        double media = soma / distancias.length;

        int abaixoMedia = 0;
        for (int i = 0; i < distancias.length; i++) {
            if (distancias[i] < media) {
                abaixoMedia++;
            }
        }

        System.out.println("\n---> RELATÓRIO <---");
        System.out.printf("a) Soma total das distâncias: %.2f km%n", soma);
        System.out.printf("b) Média de distância por entrega: %.2f km%n", media);
        System.out.println("c) Entregas abaixo da média: " + abaixoMedia);

        if (abaixoMedia > 0) {
            System.out.println("\nEntregas abaixo da média:");
            for (int i = 0; i < distancias.length; i++) {
                if (distancias[i] < media) {
                    System.out.printf("Entrega %d: %.2f km%n", (i + 1), distancias[i]);
                }
            }
        }
         
        scanner.close();
    }
}