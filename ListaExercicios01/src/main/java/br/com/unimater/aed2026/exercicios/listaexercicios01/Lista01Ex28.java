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
public class Lista01Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        /* Exercício 28 - Velocidade Média
Descrição: Leia a distância percorrida por um veículo (em km) e o tempo gasto (em horas). Exiba a velocidade média.
        */
        
        System.out.println("\n \n-> Exercícios 28 <-");
        System.out.println("Qual foi a distância percorrida em km?");
        double kmPercorrido = scanner.nextDouble();
        
        System.out.println("Qual o tempo do percurso em horas?");
        double hrsPercorrido = scanner.nextDouble();
        
        double velMedia = kmPercorrido / hrsPercorrido;
        
        System.out.println("A Velocidade média é de "+velMedia +"Km/h");
    }
    
}
