/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exemplos.aula11;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exemplo03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        
        double [][] notas = new double[4][3];
            
        for (int lin = 0; lin < notas.length; lin++) {
            System.out.println("\n=== Aluno "+ (lin+1) +" ===");
            
            for (int col = 0; col < notas[0].length; col++) {
                System.out.println("Informe notas diciplina "+(col+1)+" : ");
                
                notas[lin][col] = scanner.nextDouble();
                
            }
            
        }
                             
        for (int lin = 0; lin < notas.length; lin++) {
            
            double soma = 0;
            
            for (int col = 0; col < notas[0].length; col++) {
                soma += notas[lin][col];
                
            }
            
            double media = soma / notas[lin].length;
            
            System.out.printf("\nA média do Aluno %d foi %.2f ", lin, media);
            
        }
            
        
        scanner.close();
    }
    
}
