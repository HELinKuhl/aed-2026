/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios03;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int pares = 0;
        int impares = 0;
        
        System.out.println("Digite 5 números inteiros:");
        
        
         for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) { 
                System.out.println("PAR");
                pares++; 
            } else { 
                System.out.println("ÍMPAR");
                impares++; 
            }
        } 

        
        
        System.out.println("Total de PARES: " + pares);
        System.out.println("Total de ÍMPARES: " + impares);
        
    }
    
}
