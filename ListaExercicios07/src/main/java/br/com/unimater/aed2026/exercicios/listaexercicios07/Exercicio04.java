/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios07;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio04 {
   
    
    public static void main(String[] args) {

        int[] produtos = {3, 5, 2, 8, 4};


        int total = somarProdutos(produtos, 0);

        System.out.println("Total de produtos separados: " + total);
    }

    
    public static int somarProdutos(int[] vetor, int indice) {

        if (indice == vetor.length) {
            return 0;
        }

        return vetor[indice] + somarProdutos(vetor, indice + 1);
        
    }
}
