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
public class Exemplo02 {
    public static void main(String[] args) {
        
        
        int [] [] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Diagonal principal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat [i][i]);         //1, 5, 9.
        
        
        }
        
        
        
    }
    
}
