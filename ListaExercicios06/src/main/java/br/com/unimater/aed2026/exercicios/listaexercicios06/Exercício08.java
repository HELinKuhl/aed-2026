/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício08 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        int[] pedidos = new int[8];

        System.out.println("Digite a quantidade de doces dos 8 pedidos:");
        for (int i = 0; i < pedidos.length; i++) {
            System.out.printf("Pedido %d: ", i + 1);
            pedidos[i] = scanner.nextInt();
        }

        int totalDoces = calcularTotalDoces(pedidos);
        int pedidosGrandes = contarPedidosGrandes(pedidos);
        boolean reforco = precisaReforcoProducao(totalDoces, pedidosGrandes);
        String mensagem = gerarMensagemProducao(reforco);

        System.out.printf("\nTotal de doces: %d\n", totalDoces);
        System.out.printf("Pedidos grandes (mais de 50): %d\n", pedidosGrandes);
        System.out.println(mensagem);

        scanner.close();
    }

    public static int calcularTotalDoces(int[] pedidos) {
        int soma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            soma += pedidos[i];
        }
        return soma;
    }

    public static int contarPedidosGrandes(int[] pedidos) {
        int contador = 0;
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i] >= 50) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean precisaReforcoProducao(int totalDoces, int pedidosGrandes) {
        return totalDoces > 300 || pedidosGrandes >= 3;
    }

    public static String gerarMensagemProducao(boolean reforco) {
        if (reforco) {
            return "ATENÇÃO: Reforço de produção necessário!";
        } else {
            return "Produção dentro do planejado.";
        }
    }
}


