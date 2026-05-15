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
public class Exercicio01 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int [] numeros = new int [10];

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o "+ (i+1) + "o número:");
            
            numeros[i] = scanner.nextInt();
            
        }
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 ==0) {
                contPar++;
            
            } else {
                contImpar++;
            }
        
            
            
        
        }
        System.out.println("Quantidad de pares: "+contPar);
        System.out.println("Quantidad de impares: "+contImpar);
        
    scanner.close();
  }
}
