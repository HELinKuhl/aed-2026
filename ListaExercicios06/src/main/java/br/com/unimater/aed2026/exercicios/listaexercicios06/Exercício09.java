/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício09 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_PRODUTOS = 5;

        String[] nomes = new String[TOTAL_PRODUTOS];
        int[] quantidades = new int[TOTAL_PRODUTOS];
        double[] precos = new double[TOTAL_PRODUTOS];

        lerProdutos(scanner, nomes, quantidades, precos);

        double totalGeral = calcularTotalGeral(quantidades, precos);
        String maisVendido = identificarProdutoMaisVendido(nomes, quantidades);
        String situacao = gerarSituacaoVenda(totalGeral);

        exibirRelatorio(nomes, quantidades, precos, totalGeral, maisVendido, situacao);

        scanner.close();
    }

    public static void lerProdutos(Scanner sc, String[] nomes, int[] quantidades, double[] precos) {
        System.out.println("==== CADASTRO DE VENDAS DO DIA ====\n");

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Produto %d:%n", i + 1);

            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Quantidade vendida: ");
            quantidades[i] = sc.nextInt();

            System.out.print("Preço unitário: R$ ");
            precos[i] = sc.nextDouble();

            System.out.println();
        }
    }

    public static double calcularTotalProduto(int quantidade, double preco) {
        return quantidade * preco;
    }

    public static double calcularTotalGeral(int[] quantidades, double[] precos) {
        double total = 0;

        for (int i = 0; i < quantidades.length; i++) {
            // Chama o método que calcula o total de cada produto
            total += calcularTotalProduto(quantidades[i], precos[i]);
        }

        return total;
    }

    public static String identificarProdutoMaisVendido(String[] nomes, int[] quantidades) {
        int indiceMaior = 0;

        for (int i = 1; i < quantidades.length; i++) {
            if (quantidades[i] > quantidades[indiceMaior]) {
                indiceMaior = i;
            }
        }

        return nomes[indiceMaior];
    }

    public static String gerarSituacaoVenda(double totalGeral) {
        if (totalGeral >= 1000.00) {
            return "Meta atingida";
        } else {
            return "Abaixo da meta";
        }
    }

    public static void exibirRelatorio(String[] nomes, int[] quantidades, double[] precos,
                                       double totalGeral, String maisVendido, String situacao) {

        System.out.println("\n==== RELATÓRIO DE FECHAMENTO ====\n");

        System.out.println("Produtos vendidos:");
        System.out.println("-----------------------------------");

        for (int i = 0; i < nomes.length; i++) {
            double subtotal = calcularTotalProduto(quantidades[i], precos[i]);
            System.out.printf("%s: %d x R$ %.2f = R$ %.2f%n",
                             nomes[i], quantidades[i], precos[i], subtotal);
        }

        System.out.println("-----------------------------------");
        System.out.printf("TOTAL GERAL: R$ %.2f%n", totalGeral);
        System.out.printf("Produto mais vendido: %s%n", maisVendido);
        System.out.printf("Situação: %s%n", situacao);
        System.out.println("===================================");
    }
}


