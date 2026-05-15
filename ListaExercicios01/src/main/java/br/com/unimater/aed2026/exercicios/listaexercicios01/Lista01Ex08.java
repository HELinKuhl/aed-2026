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
public class Lista01Ex08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
         /* 
    Exercício 8  - Área de um Quadrado
Descrição: Leia o valor do lado de um quadrado e exiba sua área.
        */
        System.out.println("\n \n-> Exercícios 08 <-");
        System.out.println("Digite é o valor da lateral do quadrado:");
        
        double ladoQuadrado = scanner.nextDouble();
        
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A area do seu quadrado é de: "+areaQuadrado);
        
        
        
    }
    
}
