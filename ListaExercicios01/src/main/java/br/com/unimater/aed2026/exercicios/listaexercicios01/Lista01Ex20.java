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
public class Lista01Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        /* Exercício 20 - Área de um Trapézio
Descrição: Leia a base maior, a base menor e a altura de um trapézio e exiba a área.
Fórmula: A=[(B+b)×h​]/2.
        */

        System.out.println("\n \n-> Exercícios20 <-");
        System.out.println("Qual é a base maior do trapézio:");
        double baseMaior = scanner.nextDouble();
        
        System.out.println("Qual é a base menor do trapézio:");
        double baseMenor = scanner.nextDouble();
        
        System.out.println("Qual é a aluta:");
        double baseAltura = scanner.nextDouble();
        
        
        double areaTrapz = ((baseMaior + baseMenor) * baseAltura) / 2.0;
        System.out.println("A área do trapézio é: " + areaTrapz);
        
        
        
    }
    
}
