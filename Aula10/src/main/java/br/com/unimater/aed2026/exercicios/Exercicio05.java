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
public class Exercicio05 {
    
    public static void main(String[] args){
        
          Scanner scanner = new Scanner(System.in);
          
            double[] precos = new double[5];
            double[] precosAtualizados = new double[5];
            
            for (int i = 0; i < precos.length; i++) {
                  System.out.print("Digite o preço número "+ (i + 1) +": R$");
                  
                  precos[i] = scanner.nextDouble();
            }
            
            for (int i = 0; i < precos.length; i++) {
                  precosAtualizados[i] = precos[i] * 1.1;  
                  
            }
            
            for (int i = 0; i < precos.length; i++) {
                  System.out.printf("Original: R$%,.2f +10%%: R$%,.2f\n", precos[i], precosAtualizados[i]);
            
            }
            
            scanner.close();
      }
}
