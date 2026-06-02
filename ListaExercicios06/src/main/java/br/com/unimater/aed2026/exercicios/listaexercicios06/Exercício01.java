/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Nome do cliente: ");
        String cliente = scanner.nextLine();
        
        System.out.print("Nome do produto: ");
        String produto = scanner.nextLine();
        
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        
        System.out.print("Valor unitário: R$ ");
        double valorUnitario = scanner.nextDouble();
        
        System.out.println("\n---------------------------------");
         
        
        exibirCabecalho();
        exibirItem (produto, quantidade, valorUnitario);
        exibirRodape(cliente);
        
        scanner.close();
    }
    
    public static void exibirCabecalho() {
        
        System.out.println("===== LANCHONETE PATO ASSADO =====");
        System.out.println("Pedido pronto para retirada!");
        System.out.println();
    }
    
    
    public static void exibirItem(String produto, int quantidade, double valUnitario) {
        double valTotal = quantidade * valUnitario;
        System.out.println("Item: " + produto);
        System.out.printf("Qtd: %d x R$ %.2f%n", quantidade, valUnitario);
        System.out.printf("Total: R$ %.2f%n", valTotal);
        System.out.println();
    }
    
    public static void exibirRodape(String cliente) {
        System.out.println("---------------------------------");
        System.out.println("Obrigado, " + cliente + "!");
        System.out.println("Volte sempre :)");
        
    }
}


