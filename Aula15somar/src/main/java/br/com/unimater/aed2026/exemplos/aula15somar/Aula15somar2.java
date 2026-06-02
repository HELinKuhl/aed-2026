/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula15somar;

/**
 *
 * @author helmuthkuhl
 */
public class Aula15somar2 {
    
    //
    public static int somar (int n){
        if (n <= 1) {
            System.out.println("Soma ("+ n);
            return 1;
            
            
        }
        
        System.out.println("Soma ("+ n);
        
        return n + somar (n -1);
    }
    

    public static void main(String[] args) {
        
        System.out.println("Resultado: "+ somar(5));
        somar(5);
    }
}
