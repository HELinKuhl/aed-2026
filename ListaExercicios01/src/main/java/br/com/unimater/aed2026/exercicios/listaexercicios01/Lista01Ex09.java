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
public class Lista01Ex09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
        /* 
        Exercício 9  - Conversor de Temperatura
Descrição: Leia uma temperatura em graus Celsius e converta para Fahrenheit.
Fórmula: F=(C×1.8)+32.
        */
        
        System.out.println("\n \n-> Exercícios 09 <-");
        System.out.println("Digite quanto é a temperatura:");
        
        double temperaturaC = scanner.nextDouble();
        double tempF = (temperaturaC * 1.8) +32;
        System.out.println("temperatura em Fahrenheit é " +tempF+"f");
        
        
    }
    
}
