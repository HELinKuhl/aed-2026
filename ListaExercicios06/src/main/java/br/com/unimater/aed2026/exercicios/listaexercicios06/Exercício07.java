/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício07 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        double[] consumos = new double[7];

        System.out.println("Informe o consumo de energia dos 7 dias (kWh):");
        lerConsumos(scanner, consumos);

        System.out.print("\nInforme o limite diário para comparação (kWh): ");
        double limite = scanner.nextDouble();

        double total = calcularTotal(consumos);
        int diasAcima = contarDiasAcima(consumos, limite);
        String classificacao = classificarConsumo(total);

        System.out.println("\n==== RELATÓRIO DE CONSUMO ====\n");
        System.out.printf("Total consumido na semana: %.2f kWh\n", total);
        System.out.printf("Classificação: %s\n", classificacao);
        System.out.printf("Dias acima de %.2f kWh: %d\n", limite, diasAcima);

        scanner.close();
    }

    public static void lerConsumos(Scanner sc, double[] consumos) {

        for (int i = 0; i < consumos.length; i++) {
            System.out.printf("Dia %d: ", i + 1);
            consumos[i] = sc.nextDouble();
        }
    }

    public static double calcularTotal(double[] consumos) {

        double total = 0;

        for (int i = 0; i < consumos.length; i++) {
            total += consumos[i];
        }

        return total;
    }

    public static int contarDiasAcima(double[] consumos, double limite) {

        int contador = 0;

        for (int i = 0; i < consumos.length; i++) {

            if (consumos[i] > limite) {
                contador++;
            }
        }

        return contador;
    }

    public static String classificarConsumo(double total) {

        if (total <= 80) {

            return "Consumo controlado";

        } else {

            return "Consumo elevado";
        }
    }
}



