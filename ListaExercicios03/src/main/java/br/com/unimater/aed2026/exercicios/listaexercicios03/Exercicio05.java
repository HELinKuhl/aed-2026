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
public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Soma e média de valores\n");
        
        
        int soma = 0;
        int nrosLidos = 6;
        
        System.out.println("Digite 6 números inteiros:");
        
        
         for (int i = 1; i <= nrosLidos; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero; 
                 
            }
         

        int media = soma / nrosLidos;
        
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        
        
        
    }
    
}
