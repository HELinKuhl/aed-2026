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
public class Lista01Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
        /* 
        Exercício 15  - Divisão de Conta
Descrição: Leia o valor total de uma conta e em quantas pessoas será dividida. Exiba o valor individual.
        */
        
        System.out.println("\n \n-> Exercícios 15 <-");
        System.out.println("Qual o valor total da conta?");
        double valorConta = scanner.nextDouble();
        
        System.out.println("será dividido em quantas pessoas? ");
        int nroPessoas = scanner.nextInt();
        
        double valorDivivido = valorConta / nroPessoas;
        
        System.out.println("A valor para cada pessoa pagar é de R$"+df.format(valorDivivido));
        
               
    }
    
}
