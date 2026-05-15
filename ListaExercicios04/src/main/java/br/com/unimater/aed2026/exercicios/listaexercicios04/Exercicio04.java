/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios04;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio04 {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         int[] mesasOcupadas = new int[10];

        
        System.out.println("Digite os números das 10 mesas ocupadas:");
        
        for (int i = 0; i < mesasOcupadas.length; i++) {
            System.out.print("Mesa: ");
            mesasOcupadas[i] = scanner.nextInt();
            
        }

        
        System.out.print("\nDigite o número da mesa para consulta: ");
        int mesaConsulta = scanner.nextInt();

        
        boolean encontrada = false;
        
        for (int i = 0; i < mesasOcupadas.length; i++) {
            if (mesasOcupadas[i] == mesaConsulta) {
                encontrada = true;
                break; 
            }
        }

        
        
        if (encontrada) {
            System.out.println("A mesa " + mesaConsulta + " está ocupada.");
            
        } else {
            System.out.println("A mesa " + mesaConsulta + " não está ocupada.");
        }

        scanner.close();
    }
}
