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
public class Lista01Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /* Exercício 24 - Média Ponderada
Descrição: Leia 3 notas. A primeira tem peso 2, a segunda peso 3 e a terceira peso 5. Calcule a média final.
        */
            
        System.out.println("\n \n-> Exercícios 24 <-");
        System.out.println("Nota 01");
        double nota1 = scanner.nextByte();
        
        System.out.println("Nota 02");
        double nota2 = scanner.nextByte();
        
        System.out.println("Nota 03");
        double nota3 = scanner.nextByte();
        
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;
        
        double somaNota = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        
        double somaPeso = peso1 + peso2 + peso3; 
        
        double mediaFinal = somaNota / somaPeso;
        
        
        System.out.println("A média final ponderada é: " + mediaFinal); 
    }
    
}
