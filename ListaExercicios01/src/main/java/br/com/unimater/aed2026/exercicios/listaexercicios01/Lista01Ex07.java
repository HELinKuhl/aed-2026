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
public class Lista01Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
        
        /* 
        Exercício 7  - Sucessor e Antecessor
Descrição: Leia um número inteiro e apresente o seu antecessor (n-1) e o seu sucessor (n+1).
        */
        
        System.out.println("\n \n-> Exercícios 07 <-");
        System.out.println("Insita um número:");
        
        int nroEX7 = scanner.nextInt();
        
        int nroMenos = nroEX7 -1;
        int nroMais = nroEX7+1;
        
        System.out.println("Seu número é: "+nroEX7 +
                "\n Seu Antecessor é: "+nroMenos +
                "\n Seu sucessor é: "+nroMais);
    }
    
}
