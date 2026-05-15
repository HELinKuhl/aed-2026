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
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        
        int [] [] numeros = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        
        };
        
        int soma = 0;
        
        //linhas
        for (int lin = 0; lin < numeros.length; lin++) {
            //colunas
            for (int col = 0; col < numeros[0].length; col++) {
                
                soma += numeros[lin][col];
            }
            
        }
        
        double media = soma / (numeros.length * numeros[0].length);
                
        System.out.println("soma: "+soma);
        System.out.println("Media: "+media);
        
    }
    
}
