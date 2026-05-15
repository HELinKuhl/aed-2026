/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos Kg de Morango você deseja? ");
        double kgMorango = scanner.nextDouble();

        System.out.print("Quantos Kg de Maçã você deseja? ");
        double kgMaca = scanner.nextDouble();

            double precoMorangoKg;
            if (kgMorango <= 5) {
                precoMorangoKg = 2.50;
            } else {
                precoMorangoKg = 2.20;
            }
            double valorTotalMorango = kgMorango * precoMorangoKg;

        
            double precoMacaKg;
            if (kgMaca <= 5) {
                precoMacaKg = 1.80;
            } else {
                precoMacaKg = 1.50;
            }
      
        double valorTotalMaca = kgMaca * precoMacaKg;

        double valorTotalCompra = valorTotalMorango + valorTotalMaca;
        
        double totalKgComprado = kgMorango + kgMaca;

        
        double valorComDesconto = valorTotalCompra; // Começa com o valor sem desconto
        
            if (totalKgComprado > 8 || valorTotalCompra > 25.00) {
                double desconto = valorTotalCompra * 0.10; // 10% de desconto
                valorComDesconto = valorTotalCompra - desconto;
            }

        System.out.println("\nDetalhes da Compra");
        
        System.out.println("Morango: " + kgMorango + " Kg a R$ " + precoMorangoKg + "/Kg = R$ " + valorTotalMorango);
        System.out.println("Maçã:    " + kgMaca + " Kg a R$ " + precoMacaKg + "/Kg = R$ " + valorTotalMaca);
        System.out.println("Total de Kg comprados: " + totalKgComprado + " Kg");
        
        System.out.println("\nValor Original da Compra: R$ " + valorTotalCompra);

            if (totalKgComprado > 8 || valorTotalCompra > 25.00) {
                System.out.println("\nValor Final a Pagar: R$ " + valorComDesconto + " \nVocê ganhou 10% de desconto");
            } else {
                System.out.println("\n\nValor Final a Pagar: R$ " + valorComDesconto);
            }

        System.out.println("\nVolte Sempre!");
        
    }
    
}

