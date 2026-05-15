/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios01;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Lista01Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        /* 
        Exercício 13  - Soma formatada
Descrição: Leia dois números inteiros e exiba uma frase completa: "A soma entre [A] e [B] resulta em [SOMA]".
        */
        
        System.out.println("\n \n-> Exercícios 13 <-");
        System.out.println("informe o primeiro número:");
        int nroA = scanner.nextInt();
        
        System.out.println("");
        int nroB = scanner.nextInt();
        
        int nroSoma = nroA + nroB;
        
        System.out.println("A soma entre "+nroA+ 
                " e " +nroB+ " resulta em "+nroSoma);
        
        
        
    }
    
}
