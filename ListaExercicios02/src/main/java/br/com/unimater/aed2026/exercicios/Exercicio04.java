/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--> GOO GAME <--");
        System.out.println("\n--> 1 PEDRA <--");
        System.out.println("--> 2 PAPEL <--");
        System.out.println("--> 3 TESOURA <--");
        
        System.out.println("Digite a opção do Jogador 01:");
        int J1 = scanner.nextInt();
        
        System.out.println("Digite a opção do Jogador 01:");
        int J2 = scanner.nextInt();
        
        
        
        if (J1 <1 || J1 > 3) {
            System.out.println("\n --> Opção errada <--");
        } else System.out.println("\n Jogador 01 escolheu "+J1);
        
        
        
        if (J2 <1 || J2 > 3) {
            System.out.println("\n --> Opção errada <--");
            
        } else System.out.println("\n Jogador 02 escolheu "+J2);
        
            if (J1 == J2){
                System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> EMPATE <--");
        } else if (J1 == 1 && J2 == 3){
            System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> JOGADOR 01 GANHOU <--");
        
        } else if (J1 == 2 && J2 == 1){
            System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> JOGADOR 01 GANHOU <--");
            
        } else if (J1 == 3  && J2 == 2){
            System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> JOGADOR 01 GANHOU <--");
        }else   
            System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> JOGADOR 02 GANHOU <--");
        
        
        
    }    
        
    
    
}
