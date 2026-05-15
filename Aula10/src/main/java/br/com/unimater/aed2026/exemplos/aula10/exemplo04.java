/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula10;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 * 
 * NOTAS APROVADAS
 */
public class exemplo04 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int [] idades = {18, 25, 19, 48, 12, 10};
        
        int maior = idades[0];
        
        for (int i = 0; i <idades.length; i++) {
            if (maior < idades[i]){
                maior = idades[i];
            
            }
        
        }
        System.out.println("Maior: "+maior );
        
    }
}
