/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.aula12;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercici01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int [] voos = {1021, 1184, 1320, 1455, 1678, 1899, 2040, 2233};
        String [] destinos = {"Curitiba", "São Paulo", "Brasília", "Florianópolis", "Porto Alegre", "Recife", "Salvador", "Belo Horizonte"};
        
        
        System.out.println("Digite o número do voo:");
        int voo = scanner.nextInt();
        
        int posicao = -1;
        int execucao =0;
        
        
        for (int i = 0; i < voos.length; i++) {
            execucao ++;
            
            if (voo == voos[i]) {
                posicao = i;
                break;
            }
            
            
        }
        
        System.out.println("Execuções Sequencial: "+ execucao);
        
        
        
        System.out.println("O Voo "+ voos[posicao] + " vai para " +destinos[posicao]);
        
        
        scanner.close();
        
    }
    
    
}
