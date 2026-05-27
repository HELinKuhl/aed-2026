/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula14;

/**
 *
 * @author helmuthkuhl
 */
public class Exemplo03Aula15BYreference {

    
    public static void main (String[] args){
        double[] notas = {7.5, 8.2, 6.4, 3.5};
        
        
        System.out.println("---> NOTAS <---");
        impNotas(notas);
    
        ajustarNotasBaixa(notas);
        
        System.out.println("---> NOTAS <---");
        impNotas(notas);
    
    }

    private static void impNotas(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f \n", i+ 1, notas[i]);
            
        }
    }
    //ajustar notas abaixo de 7 para 7
    private static void ajustarNotasBaixa(double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] <7){
                notas[i] = 7;
            }
            
        }
        
        
    }
            
   
}
