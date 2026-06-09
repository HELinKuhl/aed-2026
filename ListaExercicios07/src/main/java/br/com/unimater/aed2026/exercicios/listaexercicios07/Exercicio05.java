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
public class Exercicio05 {
   
    
public static void main(String[] args) {
    
        
        Scanner scanner = new Scanner(System.in);
        
        int[] estoques = {12, 8, 25, 4, 16};
        
        System.out.print("Estoque mínimo: ");
        
        if (scanner.hasNextInt()) {
            int min = scanner.nextInt();


            if (existeEstoqueBaixo(estoques, 0, min)) {
                System.out.println("Existe produto abaixo do estoque mínimo.");
            } else {
                System.out.println("Todos os produtos estão acima do estoque mínimo.");
            }
        } else {
            System.out.println("Entrada inválida.");
        }

        scanner.close();
    }

    public static boolean existeEstoqueBaixo(int[] vetor, int indice, int minimo) {

        if (indice == vetor.length) {
            return false;
        }


        if (vetor[indice] < minimo) {
            return true;
        }


        return existeEstoqueBaixo(vetor, indice + 1, minimo);
    }
}