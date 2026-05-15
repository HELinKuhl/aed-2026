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
public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("Qual valor R$ deseja sacar?");
        double ValorSaque = scanner.nextDouble();
        
        DecimalFormat moeda = new DecimalFormat("0.00");
        
        double SaldoConta = 1500.00;
        
        
        
        if (ValorSaque == 0) {
            System.out.println("Valor digitado é invalido.");
            
        }else if (ValorSaque < SaldoConta) {
            
                if (ValorSaque > 600.00) {
                    System.out.println("\nO valor informado é de R$"+ moeda.format(ValorSaque) + 
                                        ", mas o limite de saque diário é de R$600,00");

                } else 
                    System.out.println("O valor informadoé de R$"+ moeda.format(ValorSaque) + 
                                        "\n\nSeu Saldo é de R$"+ moeda.format(SaldoConta) + "\n\nSeu saque será processado");


        } else 
            System.out.println("Saldo indisponível");
       
        
        
    }
    
}

