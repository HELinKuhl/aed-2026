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
public class Exercicio03 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
            
        int[] numeros = new int [5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número: " + (i +1)+ ":");
            numeros[i] = scanner.nextInt();
            
        }
        //loop (i) Externo: 1: 3, 7, 1, 2, 4.
            //loop (j) [0]: 1: 3, 7, 1, 4.
            //loop (j) [1]: 2: 3, 7, 7, 4.
            //loop (j) [2]: 3: 1, 7, 1, 4.
            //loop (j) [3]: 3: 1, 2, 7, 4.
            //loop (j) [4]: 3: 1, 2, 4, 7, 
            //loop (j) [5]: não executa
            
        
        //booble Sort
        for (int i = 0; i < numeros.length; i++) { //loop 1
            System.out.println("LOG for 1 -> " +numeros[i]);
            
            //loop j Externo (i): 1: 3, 7, 1, 2, 4.
            for (int j = 0; j < numeros.length -1; j++) {
                System.out.println("LOG for 2 -> " +numeros[j]);
                
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros [j+1];
                    numeros[j+1] = aux;
                    
                
                }
            
            }
            
        }
        
        
        System.out.printf("Números em ordem crescente: ");
            for (int i = 0; i < numeros.length; i++) {
                  System.out.print(numeros[i]+" ");
        //System.out.printf("");
        //System.out.printf("");
       
            }
    scanner.close();
  }
    
}

