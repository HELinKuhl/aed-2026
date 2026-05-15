/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Lista01Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("#.00");
        
         /* 
        Exercício 14  - Desconto de Loja
Descrição: Leia o preço de um produto e aplique um desconto de 10%. Exiba o valor do desconto e o preço final.
        */
        
        System.out.println("\n \n-> Exercícios 14 <-");
        System.out.println("Qual o valor do produto?");
        double valorPreco = scanner.nextDouble();
        
        double valorDeconto = valorPreco * 0.90;
        
        System.out.println("O valor do produto com desconto aplicado é de: R$"+df.format(valorDeconto));
        
        
    }
    
}
