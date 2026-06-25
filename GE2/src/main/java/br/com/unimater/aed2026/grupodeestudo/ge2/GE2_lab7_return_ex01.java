/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.grupodeestudo.ge2;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class GE2_lab7_return_ex01 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            
            System.out.println("Digite o número inteiro para a contagem regressiva:"); 
            int nroInt = scanner.nextInt();
            
            contagemRegressiva(nroInt);
            
            
        }
    }
    
    
    private static void contagemRegressiva (int nronro){
            System.out.println(nronro);
        if (nronro ==0){
            System.out.println("Caixa Aberto");
        
            
        } else {
            
            contagemRegressiva(nronro - 1);
        }
    }
                
        
    
    
}

