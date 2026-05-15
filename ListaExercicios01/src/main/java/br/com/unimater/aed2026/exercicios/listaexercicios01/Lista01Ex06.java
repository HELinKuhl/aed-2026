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
public class Lista01Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
        
    /* Exercício 6  - Dobro e Triplo
Descrição: Leia um número inteiro e exiba o seu dobro e o seu triplo no console.
        */
        
        
        System.out.println("\n \n-> Exercícios 06 <-");
        System.out.println("Insita um número:");
        
        int intEX6 = scanner.nextInt();
        
        int intDoro = intEX6 *2;
        int intTriplo = intEX6 *3;
        
        System.out.println("Seu número é: "+intEX6 +
                "\n Dobro dele é: "+intDoro +
                "\n Triplo dele é: "+intTriplo);
    
    
    
    
    }    
    
}
