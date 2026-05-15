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
public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int jogadas = 0;
        int placarJ1 = 0;
        int placarJ2 = 0;
        int empate = 0;
        
        
        for (jogadas = 0; jogadas <=3; jogadas++){ 
        
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
                empate ++;
                
        } else if (J1 == 1 && J2 == 3){
            System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> JOGADOR 01 GANHOU <--");
            placarJ1 ++;
        
        } else if (J1 == 2 && J2 == 1){
            System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> JOGADOR 01 GANHOU <--");
            placarJ1 ++;
            
        } else if (J1 == 3  && J2 == 2){
            System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> JOGADOR 01 GANHOU <--");
            placarJ1 ++;
        }else   
            System.out.println("\n--> Jogada Feita <--" + 
                                "\nJogador    - Opção" +
                                "\nJogador 01 - "+J1+
                                "\nJogador 02 - "+J2+
                                "\n\n --> RESULTADO <--" +
                                "\n\n --> JOGADOR 02 GANHOU <--");
            placarJ2 ++;
        
        }
            System.out.println("\n\n --> Placar <--");
            System.out.println("Total jogadas "+jogadas);
            System.out.println("EMPATES = "+empate);
            System.out.println("Jogador 01   |   Jogador 02");
            System.out.println(placarJ1 +"          |          " + placarJ2);
            
    }    
        
        
        
        
       
}
    

