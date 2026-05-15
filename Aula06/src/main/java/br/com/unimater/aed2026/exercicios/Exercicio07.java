/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor mensal?");
        double valorMensal = scanner.nextDouble();
        
        System.out.println("Informe o valor da parcela?");
        double valorParela = scanner.nextDouble();
        
        System.out.println("Informe a idade?");
        double idade = scanner.nextDouble();
        
        double valorDiv = valorMensal /100;
        double limiteParcela = valorDiv *30;
         //(valorParcela < limite) E (idade < 30).
        
        boolean creditoAprovado = (valorParela < limiteParcela) && !(idade > 30);
        
        if (creditoAprovado) { 
            System.out.println("Aprovado");
        } else { 
            System.out.println("Negado");
        }
        
        
        
        
        
    }
    
    
}
