/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.grupodeestudo.prativage2;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class PrativaGE2 {

    public static void main(String[] args) {
             
        try (Scanner scanner = new Scanner(System.in)){
        
        int valor1 = 2;
                     System.out.println(valor1);
        
        valor1 = retornaInteiro(valor1);
                    System.out.println(valor1);
                    
                    
                    
        
        double valor2 = 11.1;
                    System.out.println(valor2);

        valor2 = retornaDouble(valor2);
                    System.out.println(valor2);
                    
                    
                    
        
        String texto = "Olá";
            System.out.println(texto);
            
       texto = retornaString(valor1);
            System.out.println(texto);
        
            
            
            
        boolean TaCerto = false;
        
            System.out.println(TaCerto);
            
        TaCerto = retornaBool(texto);
            System.out.println(TaCerto);
        
            
            
            
        int numero = 1;
        
        int [] ValoresContas = new int[5];
        
        ValoresContas = retornaVetor(numero);
        
        
            retornaVetorn2(numero, ValoresContas);
                    for (int i = 0; i < ValoresContas.length; i++) {
                        System.out.println(ValoresContas[i]);
                
            }
        
        String [][] textosVariados = new String [2][3];
        
        }
    }
    
    private static int retornaInteiro (int abc){
        
        return abc * 4;
    
    }
    
    private static double retornaDouble (double cde){
        
        return cde * 2;
    }
    
    private static String retornaString (int EFG){
        if (EFG == 4){
            return "Bom Dia";
        }
            return "Boa Noite";
    
    }
    
    private static boolean retornaBool (String frase){
        if (frase.equals("Bom dia")) {
            return true;
        }
            return false;
    }
    
    
    private static int [] retornaVetor (int fgh){
        int [] novoVetor = new int[5];
        
        for (int i = 0; i < novoVetor.length; i++) {
            novoVetor[i] = fgh;
            
        }
        
        return novoVetor;
    }
    
    private static void retornaVetorn2(int fgh, int[] vetor){
        for (int i = 0; i < 5; i++) {
            vetor[i] = fgh;
            
        }
        
    }
    

}
