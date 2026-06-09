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
public class Exercicio03 {
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeira senha: ");
        if (scanner.hasNextInt()) {
            int primeira = scanner.nextInt();

            
            System.out.print("Última senha: ");
            if (scanner.hasNextInt()) {
                int ultima = scanner.nextInt();

                
                if (primeira > ultima) {
                    System.out.println("Erro: A primeira senha deve ser menor ou igual à última.");
                } else {
                    chamarSenhas(primeira, ultima);
                }
            } else {
                System.out.println("Erro: Entrada inválida para a última senha.");
            }
        } else {
            System.out.println("Erro: Entrada inválida para a primeira senha.");
        }

        scanner.close();
        
    }
    
    public static void chamarSenhas(int atual, int limite) {

        if (atual > limite) {
            
            return;
        }

        System.out.print("Senha " + atual+"\n");

        chamarSenhas(atual + 1, limite);
    }
}

