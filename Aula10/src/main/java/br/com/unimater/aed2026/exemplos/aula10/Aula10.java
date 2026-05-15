/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula10;

/**
 *
 * @author helmuthkuhl
 * 
 * SOMA E MEDIA DOS ELEMENTOS
 */
public class Aula10 {

    public static void main(String[] args) {
        
        int [] numeroS = {10, 20, 30, 40, 50, 77};
        
        int soma = 0;
        double media = 0.00;
        
        for (int i = 0; i < numeroS.length; i++) {
            
            soma += numeroS[i];
            
            
        } 
        
        media = soma / (double) numeroS.length;
        
        System.out.println("soma "+soma);
        
        System.out.println("media "+media);
    
    }
}
