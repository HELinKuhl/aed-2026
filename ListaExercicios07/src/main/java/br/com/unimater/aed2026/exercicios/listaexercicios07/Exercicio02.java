/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios07;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio02 {
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de parcelas: ");
        if (scanner.hasNextInt()) {
            int quantidade = scanner.nextInt();

            System.out.print("Valor da parcela: R$ ");
            if (scanner.hasNextDouble()) {
                double valorParcela = scanner.nextDouble();

                if (quantidade < 0 || valorParcela < 0) {
                    System.out.println("Erro: Os valores não podem ser negativos.");
                } else {
                    double total = calcularTotalParcelas(quantidade, valorParcela);
                    System.out.printf("Total da compra: R$ %.2f \n", total);
                }
            } else {
                System.out.println("Erro: Valor da parcela inválido. Digite um número decimal.");
            }
        } else {
            System.out.println("Erro: Quantidade inválida. Digite um número inteiro.");
        }

        scanner.close();
    }

    public static double calcularTotalParcelas(int n, double valor) {

        if (n == 0) {
            return 0;
        }

        return valor + calcularTotalParcelas(n - 1, valor);
    }
}
