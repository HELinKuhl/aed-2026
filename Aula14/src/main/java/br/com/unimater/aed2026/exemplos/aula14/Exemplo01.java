/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula14;

/**
 *
 * @author helmuthkuhl
 */
public class Exemplo01 {

    
    public static double somar (double a, double b) {
            
        return a + b;
}
    
    public static double substrair (double a, double b) {
        return a - b;
    
    }
    
     public static double multiplicacao (double a, double b) {
        return a * b;
    
    }
     
      public static double dividir (double a, double b) {
        
          if (b == 0) {
            System.out.println("nao pode ser zero");
      
      } 
          return a /b;
    
    }
    
    
    public static void main(String[] args) {
            
        double valor1 = 4;
        double valor2 = 2;
            
            
        System.out.printf("Soma: %.1f \n", somar(valor1, valor2));    
        System.out.printf("Subtrair: %.1f \n", substrair(valor1, valor2));    
        System.out.printf("Multiplicação: %.1f \n", multiplicacao(valor1, valor2));    
        System.out.printf("Divisão: %.1f \n", dividir(valor1, valor1));   
        
        
        
            
    }
}
