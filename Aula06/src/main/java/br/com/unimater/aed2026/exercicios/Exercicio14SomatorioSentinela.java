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
public class Exercicio14SomatorioSentinela {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("informe um número para somar:");
        int num = scanner.nextInt();
        
        
        System.out.println("\nQuando quiser parar, digite um número negativo\n");
        
        System.out.println("O número informado é: \n"+num);
        
        
        int soma = 0;
        while (num >= 0) {
            soma = soma + num;
            num = scanner.nextInt();
            
            
        }
        
        System.out.println("Total acumulado: " + soma);
    }
    
    
}
