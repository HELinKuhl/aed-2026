/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios07;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio01 {
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            
            System.out.print("Exemplo de saída: \n");
            
            contagemRegressiva(numero);
            
        } else {
            
            System.out.println("Número inválido. Digite um inteiro positivo.");
        }

        scanner.close();
    }

    public static void contagemRegressiva(int n) {
        if (n == 0) {
            System.out.println("\nCaixa aberto!");
            
            return; 
        }

        System.out.print(n);

        contagemRegressiva(n - 1);
    }
    
}

