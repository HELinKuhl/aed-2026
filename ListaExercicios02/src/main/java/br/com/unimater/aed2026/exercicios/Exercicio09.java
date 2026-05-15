/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int loginCorreto = 1001;
        int senhaCorreta = 4892;
        
     
        System.out.print("Informa o Login: ");
        int loginTentativa1 = scanner.nextInt();
        
        System.out.print("Informa a Senha: ");
        int senhaTentativa1 = scanner.nextInt();

        if (loginTentativa1 == loginCorreto && senhaTentativa1 == senhaCorreta) {
            System.out.println("Acesso liberado na 1ª tentativa. \nBem-vindo!");
        } else {
            
                if (loginTentativa1 == loginCorreto) {
                    System.out.println("Login correto.\nSenha inválida. \nTente novamente.");
                } else {
                    System.out.println("Login não encontrado. \nTente novamente.");
                }

            
            System.out.println("\n\nSegunda Tentativa.");
            
            System.out.println("Informa o Login: ");
            int loginTentativa2 = scanner.nextInt();
            
            System.out.print("Informa a Senha: ");
            int senhaTentativa2 = scanner.nextInt();

            if (loginTentativa2 == loginCorreto && senhaTentativa2 == senhaCorreta) {
                System.out.println("Acesso liberado na 2ª tentativa. \nBem-vindo!");
            } else { 
                
                    if (loginTentativa2 == loginCorreto) {
                        System.out.println("Atenção: 1 tentativa restante!");
                    } else {
                        System.out.println("Login não encontrado. \nTente novamente.");
                    }

                
                    System.out.println("\nÚltima Tentativa");
                    
                    System.out.println("Informa o Login: ");
                    int loginTentativa3 = scanner.nextInt();
                    
                    System.out.print("Informa a Senha: ");
                    int senhaTentativa3 = scanner.nextInt();

                        if (loginTentativa3 == loginCorreto && senhaTentativa3 == senhaCorreta) {
                            System.out.println("Acesso liberado na 3ª tentativa. \nSeja bem-vindo!");
                        } else { 
                            System.out.println("Conta bloqueada! \nNúmero máximo de tentativas atingido.");
                        }
            }
        }
         
         
    
        
        
    }
    
}

