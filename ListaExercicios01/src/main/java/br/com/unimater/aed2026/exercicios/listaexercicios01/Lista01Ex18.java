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
public class Lista01Ex18 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        /* 
        Exercício 18 - Conversor de Tempo
Descrição: Leia um valor total em segundos e converta para o formato: "X minutos e Y segundos".
Dica: Use os operadores / (divisão) e % (resto).
        */

        System.out.println("\n \n-> Exercícios 18 <-");
        System.out.println("Informe qual o total de segundos:");
        int totalSeg = scanner.nextInt();
        
        int minutos = totalSeg / 60;
        int segSeg = totalSeg % 60; 
        System.out.println(totalSeg + " segundos equivalem a:");
        System.out.println(minutos + " minutos e " + segSeg + " segundos.");
    }
        
        
}        
        
        
        

  
