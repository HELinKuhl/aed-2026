/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio07 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
        double[] notas = new double[6];

        
        System.out.println("Digite as notas das 6 apresentações:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Apresentação " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.print("\nDigite a nota de referência: ");
        double referencia = scanner.nextDouble();

        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= referencia) {
                contador++;
            }
        }

        System.out.println("Apresentações com nota maior ou igual a " + referencia + ": " + contador);

        if (contador > 0) {
            System.out.println("\nNotas que atingiram a referência:");
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= referencia) {
                    System.out.printf("Apresentação %d: %.1f%n", (i + 1), notas[i]);
                }
            }
        }

        scanner.close();
    }
}