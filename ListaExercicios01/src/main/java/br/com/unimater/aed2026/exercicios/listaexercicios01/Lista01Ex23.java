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
public class Lista01Ex23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
                /* Exercício 23 - Azulejos na Parede
Descrição: Leia a largura e altura de uma parede e a largura e altura de um azulejo. Calcule quantos azulejos cobrem a parede.
        */
        
        System.out.println("\n \n-> Exercícios 23 <-");
        System.out.println("qual á a largura da parede em metros?");
        double largParede = scanner.nextDouble();
        
        System.out.println("qual á a altura da parede em metros?");
        double altParede = scanner.nextDouble();
        
        System.out.println("qual á a largura da Azulejo em metros?(ex: 0,30)");
        double largAzulejo = scanner.nextDouble();
        
        System.out.println("qual á a altura da Azulejo em metros?(ex: 0,30)");
        double altgAzulejo = scanner.nextDouble();
        
        double areaParede = largParede * altParede;
        double areaAzulejo = largAzulejo * altgAzulejo;
        
        double divArea = areaParede / areaAzulejo;
        double divArearest = areaParede % areaAzulejo;
        
        double qtdAzulejos = divArea+divArearest;
        
        System.out.println("\nSerão necessários aproximadamente " + qtdAzulejos + " azulejos para cobrir a parede.");
      
        
        
    }
    
}
