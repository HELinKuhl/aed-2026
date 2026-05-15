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
public class Lista01Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        /* 
        Exercício 22 - Juros Simples
Descrição: Leia o Capital, a Taxa de Juros e o Tempo. Calcule o Montante Final.
Fórmula: M=C×(1+taxa×tempo).
        */
        
        System.out.println("\n \n-> Exercícios 22 <-");
        System.out.println("Qual o capital");
        double capitalInicial = scanner.nextDouble();
        
        System.out.println("Qual a taxa de juros");
        double taxJuros = scanner.nextDouble();
        
        
        System.out.println("quanto tempo");
        double tempoJuros = scanner.nextDouble();
        
        double montante = capitalInicial * (1+(taxJuros/100)*tempoJuros);
        
        System.out.println("O montante final é de R$"+df.format(montante));
        
    }
    
}
