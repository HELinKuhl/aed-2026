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
public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número para fazer o cálculo da tabuada de 1 a 10: \n");
        int nroInf = scanner.nextInt();
        
        
        for (int i = 1; i <= 10; i++) {
            
            int resultado = nroInf * i;
            
            System.out.print(nroInf+ " * " +i+ " = "+resultado + "\n"    );
                
            
        }
        
       
    }
    
}
