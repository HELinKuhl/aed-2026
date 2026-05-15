/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.exemplos.aula05.exercicios;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio04 {
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            
        
        System.out.println("Informe o ano:");
        int y = scanner.nextInt();
        
        int a = y % 19;
        
        int b = y / 100;
        
        int c = y % 100;
        
        int d = b / 4;
        
        int z = b % 4;
        
        int g = (8 * b + 13) / 25;
        
        int h = (19 * a + b - d - g + 15) % 30;
        
        int j = c / 4 ;
        
        int k = c % 4;
        
        int m = (a + 11 * h) / 319;
        
        int r = (2 * z + 2 * j - k - h + m + 32) % 7;
        
        int n = (h - m + r + 90) / 25;
        
        int p = (h - m + r + n + 19) % 32;
        
       System.out.println("No ano "+y+", o domingo de Páscoa será no dia "+p +" do mês "+n+".");
       

            
            
        }
    
    
}
