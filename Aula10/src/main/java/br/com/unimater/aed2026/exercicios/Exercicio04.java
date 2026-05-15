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
public class Exercicio04 {
    
    public static void main(String[] args){
        
          Scanner scanner = new Scanner(System.in);
          
            int[] numeros = new int[7];
            
            for (int i = 0; i < 7; i++) {
                  System.out.println("Digite o número inteiro "+ (i + 1) +":");
                  
                  numeros[i] = scanner.nextInt();
            }
            
            System.out.printf("Números decresebtes: ");
            
            for (int i = 6; i >= 0; i--) {
                
                  System.out.print(numeros[i]+" ");
            }           
            scanner.close();
      }
}

