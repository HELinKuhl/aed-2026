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
public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a idade?");
        int idade = scanner.nextInt();
        
        System.out.println("Possui Assinatura Ativa: (true/false)");
        boolean temAssinatura = scanner.nextBoolean();
        
           if (idade >= 18) {
            
                if (temAssinatura) {

                    System.out.println("Acesso Premium Liberado");
                } else { 

                    System.out.println("Acesso Básico Liberado");
                }
        } else { 
            System.out.println("Acesso Bloqueado: Usuário menor de idade");
        }
        
    }
    
    
}
