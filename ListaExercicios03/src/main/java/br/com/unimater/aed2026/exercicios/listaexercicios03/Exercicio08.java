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
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int loginCorreto = 1001;
        int senhaCorreta = 4892;
        
        int tentativa = 1;
        boolean loginOK = false;
        
        while (tentativa <= 3 && loginOK == false){
            
            
             
            System.out.print("Informa o Login: ");
            int loginTentativa = scanner.nextInt();

            System.out.print("Informa a Senha: ");
            int senhaTentativa = scanner.nextInt();
            
            

        if (loginTentativa == loginCorreto && senhaTentativa == senhaCorreta) {
            loginOK = true;
            System.out.println("Acesso liberado na " + tentativa + " tentativa. \nBem-vindo!");
        } else {
            
                if (loginTentativa == loginCorreto) {
                    System.out.println("Senha inválida.");
                } else {
                    System.out.println("Login não encontrado.");
                }
                
                if (tentativa ==3) {
                System.out.println("Conta bloqueada.");
                }
                        

            tentativa++;
            
            
            
            
        }
        
        
        } 
        
        
        
        
        
       
    }
    
}
