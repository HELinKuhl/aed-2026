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
public class Exercicio13taboadaprog {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.print("informe um número");
        int num = scanner.nextInt();
        
        System.out.println("O número informado é: "+num);
        
        
        for (int i = 1 ; i <= 10; i ++) {
            System.out.println("\n" + num*i) ;
        
        }
        
        
    }
    
    
}
