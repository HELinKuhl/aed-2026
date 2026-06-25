/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.unimater.aed2026.grupodeestudo.ge2;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class GE2_lab7_return_ex04 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] produtos = {3, 5, 2, 8, 4};
            System.out.println("Total caralho : " + somaProdutos(produtos, 0));
                
            

        }
    }

    
    private static int somaProdutos (int [] lista, int indice) {

        if (indice == lista.length){
            return 0;
            
        }else {
            
            return lista[indice] + somaProdutos(lista, indice +1);
        }
        
        
    }
}    