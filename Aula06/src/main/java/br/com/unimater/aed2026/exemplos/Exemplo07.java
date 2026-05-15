/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exemplo07 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         
        System.out.println("Digite sua nota final");
        double notafinal = scanner.nextDouble();
        
        
        if (notafinal >= 7) {
            System.out.println("Aprovado");
        
        } else {
            System.out.println("Reprovado");
            
        }
        
        
        
        
        
        
        
        
    }
}
