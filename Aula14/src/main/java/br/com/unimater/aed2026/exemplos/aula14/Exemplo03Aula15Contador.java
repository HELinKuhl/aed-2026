/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula14;

/**
 *
 * @author helmuthkuhl
 */
public class Exemplo03Aula15Contador {
    
    static int contador =0;

    
    public static void mains (String[] args){
        soma(3, 5);
        soma(10, 20);
        soma(2, 8);
        
        multiplicar(4, 5);
        multiplicar(3, 6);
                
       exibirContador();        
    }

    private static void soma(int n1, int n2) {
            contador++;
            System.out.println(n1 + n2);


    }

    private static void multiplicar(int n1, int n2) {
            contador++;
           System.out.println(n1 * n2);
    }

    private static void exibirContador() {
        System.out.println("Executado: "+contador+" vezes(es)");
    }
            
    
   
}
