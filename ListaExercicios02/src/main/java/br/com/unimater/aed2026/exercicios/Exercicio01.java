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
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        int Nro = scanner.nextInt();
        
        double nroDiv = Nro % 2;
        
        if (nroDiv == 0) {
            System.out.println("Número informado é: \n"+Nro
                                +"\nÉ um Número PAR");
        }else 
        
        System.out.println("Número informado é: \n"+Nro
                            + "\nÉ um Número IMPAR");
        
        
        
    }
    
}
