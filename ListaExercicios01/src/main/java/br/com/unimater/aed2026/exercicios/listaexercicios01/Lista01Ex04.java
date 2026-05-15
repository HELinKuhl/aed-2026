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
public class Lista01Ex04 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
      
        /*  
        Exercício 4  - Troca de Variáveis
Descrição: Declare duas variáveis A e B com valores fixos. Troque os valores entre elas utilizando uma variável auxiliar.
Dica: A lógica é usar  uma terceira variável para receber o valor, temporariamente.
        */ 
                
        System.out.println("\n \n-> Exercícios 04 <-");
        
        int A = 10;
        int B = 20;
        
        System.out.println("\nvalores definidos são:");
        System.out.println("Valor A = "+A);
        System.out.println("Valor B = "+B);
        
        int TempC;
        
        TempC = A;
        A = B;
        B = TempC;
        
        System.out.println("\n Valores inversos são:");
        System.out.println("Valor A = "+A);
        System.out.println("Valor B = "+B);
        
        
     }
}
