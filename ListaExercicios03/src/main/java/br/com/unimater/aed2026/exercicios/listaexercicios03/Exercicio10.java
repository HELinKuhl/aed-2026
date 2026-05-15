/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios03;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int i = 0;
        int opcao = 0;
        
        
        do {
            System.out.println("--> MENU <--");
            System.out.println("\n 1. Mostrar números de 1 a 5\n" +
                                "2. Mostrar números pares de 0 a 20\n" +
                                "3. Exibir tabuada de um número informado pelo usuário\n" +
                                "4. Sair");
            
            opcao = scanner.nextInt();
            
            
            switch (opcao) {
                case 1: 
                    for (int n = 1; n<=5; n++){
                        System.out.println(n+"\n");
                    }
                    break;
                
               case 2: 
                    for (int n = 0; n<=20; n+=2){
                        System.out.println(n+"\n");
                    }     
                    break;
                    
               case 3: 
                    System.out.println("Informe um nro");
                    int nroInf = scanner.nextInt();
                    
                    int resultado = 0;
                    
                    for (int n = 1; n<=10; n++){
                        resultado = nroInf * n;
                        
                        System.out.print(nroInf+ " * " +n+ " = "+resultado + "\n"    );
                        
                    }     
                    break;     
                    
                    default:
                        System.out.println("Escolha uma opçao válida cabra");
                 
            }
            
        } while (opcao != 4); 
            System.out.println("programa encerrado");
        
        
        
        
    }      
}
    

