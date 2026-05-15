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
public class Lista01Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat ("#.00");
        
        /* 
        Exercício 12  - Perímetro do Círculo
Descrição: Leia o raio de um círculo e calcule o seu perímetro.
Fórmula: P=2×π×raio (Use π=3.14159).
        */
        
        System.out.println("\n \n-> Exercícios 12 <-");
        System.out.println("Informe o raio da circunferência:");
        double raioCircunferencia = scanner.nextDouble();
        
        double perimetroC = 2 * 3.14159 * raioCircunferencia;
        System.out.println("o raio é " +df.format(perimetroC));
        
        
    }
    
}
