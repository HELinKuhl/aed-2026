/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula15somar;

/**
 *
 * @author helmuthkuhl
 */
public class Aula15fatorial {
    
    
    public static void main(String[] args) {
        
        System.out.println("Resultado: "+ fatorial(5));
    }
    private static int fatorial (int n){
        //1. caso base
        if (n <= 1){
            return 1;
        }
        
        //2. caso Recursivo
        return n * fatorial( n - 1);
        
        
    }
    
    
    
}
