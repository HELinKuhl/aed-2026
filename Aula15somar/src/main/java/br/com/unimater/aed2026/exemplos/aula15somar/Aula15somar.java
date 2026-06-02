/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula15somar;

/**
 *
 * @author helmuthkuhl
 */
public class Aula15somar {
    
    //
    public static int somar (int n){
        int soma = 0;
        
        for (int i = 1; i <= n; i++) {
            soma += i; 
            System.out.println("Soma ("+ i + " ) = "+soma);
        }
        
        
        return soma;
    }
    

    public static void main(String[] args) {
        
        System.out.println("Resultado: "+ somar(5));
        somar(5);
    }
}
