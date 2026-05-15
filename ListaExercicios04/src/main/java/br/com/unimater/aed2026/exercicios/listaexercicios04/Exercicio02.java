/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio02 {

    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
            
        int[] estoque = new int[8]; 
        int produtosZerados = 0;

        
        for (int i = 0; i < estoque.length; i++) {
            System.out.print("Digite a quantidade em estoque do Produto " + (i + 1) + ": ");
            estoque[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] == 0) {
                produtosZerados++;
            }
        }

        if (produtosZerados == 0) {
            System.out.println("Não existe produtos com estoque zero.");
            
        } else {
            System.out.println("Produtos com estoque zero: " + produtosZerados);
        }
        

        scanner.close();
    }
}

