/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios03;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valida nota\n");
        
       double nota = -1;
        
        while (nota < 0 || nota > 10) { 
            System.out.print("Digite a nota: ");
            nota = scanner.nextDouble(); 

            
            if (nota < 0 || nota > 10) {
                System.out.println("Ops! Nota inválida. A nota deve ser entre 0 e 10. Tente novamente.");
            }
        }
            
        System.out.println("\nNota registrada com sucesso: " + nota);
        
    }
    
}
