/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio05 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         double[][] agenda = new double[5][2];

        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        String[] periodos = {"Manhã", "Noite"};

        
        System.out.println("Digite as horas estudadas:");
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print(dias[i] + " - " + periodos[j] + ": ");
                agenda[i][j] = scanner.nextDouble();
                
            }
        }

        
        System.out.println("\nAgenda de Estudos");
        System.out.printf("%-10s", "Dia");
        
        for (int j = 0; j < 2; j++) {
            System.out.printf("%-10s", periodos[j]);
        }
        
        System.out.println();
        //System.out.println("--------------------------------");

        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s", dias[i]); 
            
            for (int j = 0; j < 2; j++) {
                System.out.printf("%-10.1f", agenda[i][j]); 
            
            }
            
            System.out.println(); 
        }

        scanner.close();
    }
}