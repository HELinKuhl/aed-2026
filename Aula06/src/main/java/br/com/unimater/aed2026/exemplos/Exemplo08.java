/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exemplo08 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         boolean Restricao = false;
         
        System.out.println("Qual rendal");
        double renda = scanner.nextDouble();
        
        System.out.println("Qual score");
        int score = scanner.nextInt();
        
        
        
            if (score >= 700 && renda >= 2500 && !Restricao) {
                System.out.println("Aprovado");

            } else {
                System.out.println("Reprovado");

            }
        
        
            
    }
}
