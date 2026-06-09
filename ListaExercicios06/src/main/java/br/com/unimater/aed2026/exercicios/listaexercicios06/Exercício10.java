/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício10 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_BICICLETAS = 10;
        double[] distancias = new double[TOTAL_BICICLETAS];

        System.out.println("==== DISTÂNCIAS ATUAIS DAS BICICLETAS ====");
        lerDistancias(scanner, distancias);

        System.out.print("\nNúmero da bicicleta que fez a corrida (1-10): ");
        int numeroBicicleta = scanner.nextInt();

        System.out.print("Distância percorrida na corrida (km): ");
        double kmCorrida = scanner.nextDouble();

        // Atualiza o vetor original - índice - 1 porque usuário digita 1-10
        registrarCorrida(distancias, numeroBicicleta - 1, kmCorrida);

        int qtdManutencao = contarBicicletasParaManutencao(distancias);

        exibirResumoFrota(distancias);
        System.out.printf("\nBicicletas para manutenção: %d\n", qtdManutencao);

        scanner.close();
    }

    public static void lerDistancias(Scanner sc, double[] distancias) {
        for (int i = 0; i < distancias.length; i++) {
            System.out.printf("Bicicleta %d (km acumulado): ", i + 1);
            distancias[i] = sc.nextDouble();
        }
    }

    public static void registrarCorrida(double[] distancias, int indiceBicicleta, double kmCorrida) {
        if (indiceBicicleta >= 0 && indiceBicicleta < distancias.length) {
            distancias[indiceBicicleta] += kmCorrida;
        }
    }

    public static boolean precisaManutencao(double kmAcumulado) {
        return kmAcumulado > 500;
    }

    public static int contarBicicletasParaManutencao(double[] distancias) {
        int contador = 0;

        for (int i = 0; i < distancias.length; i++) {
            if (precisaManutencao(distancias[i])) {
                contador++;
            }
        }

        return contador;
    }

    public static void exibirResumoFrota(double[] distancias) {
        System.out.println("\n==== RESUMO DA FROTA ====\n");

        for (int i = 0; i < distancias.length; i++) {
            System.out.printf("Bicicleta %02d: %.2f km", i + 1, distancias[i]);

            if (precisaManutencao(distancias[i])) {
                System.out.print(" - NECESSITA MANUTENÇÃO");
            }

            System.out.println();
        }
        
    }
}


