/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio06 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         double[] vendas = new double[7];
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta",
                        "Quinta", "Sexta", "Sábado"};

        double total = 0;

        
        System.out.println("Digite o total vendido em cada dia:");
        for (int i = 0; i < vendas.length; i++) {
            System.out.print(dias[i] + ": R$ ");
            vendas[i] = scanner.nextDouble();
            total += vendas[i];
        }

        double media = total / vendas.length;

        int diasAcimaMedia = 0;
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] > media) {
                diasAcimaMedia++;
            }
        }

        System.out.println("\n---> RELATÓRIO <---");
        System.out.printf("a) Total arrecadado na semana: R$ %.2f%n", total);
        System.out.printf("b) Média de vendas por dia: R$ %.2f%n", media);
        System.out.println("c) Dias com venda acima da média: " + diasAcimaMedia);

        // Bônus: mostrar quais foram os dias
        System.out.println("\nQuais os dias estão acima da média:");
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] > media) {
                System.out.printf("%s: R$ %.2f%n", dias[i], vendas[i]);
            }
        }

        scanner.close();
    }
}