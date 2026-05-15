/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o peso?");
        double valorPeso = scanner.nextDouble();
        
        System.out.println("Qual a altura");
        double valorAtura = scanner.nextDouble();
        
        double valorIMC = valorPeso/(valorAtura*valorAtura);
        
        System.out.printf("seu IMC é: %.2f \n\n", valorIMC);
       
        if (valorIMC < 18.5) { 
            System.out.println("Abaixo do peso");
        } else if (valorIMC < 25){ 
            System.out.println("Peso normal");
        }
        else if (valorIMC < 30){ 
            System.out.println("Sobrepeso");
        }
        else {
            System.out.println("Obeso");}
           
        
    }
    
    
}
