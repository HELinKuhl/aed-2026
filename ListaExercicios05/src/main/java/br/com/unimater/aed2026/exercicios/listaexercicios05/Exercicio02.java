/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios05;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio02 {
    
        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
            int[] codID = {110201, 110305, 120410, 130115, 140220, 150999};
            String[] produtosCad = {"Cabo HDMI", "Adaptador USB", "Mouse Sem Fio", "Teclado ABNT2", "Fonte 12V", "Suporte de Monitor"}; 

            
            System.out.println("Digite o código de material a ser verificado:");
            int busca = scanner.nextInt();
            
            
            int posicao = -1;
            
            
            for (int i = 0; i < codID.length; i++) {
            if (busca == codID[i]) {
                posicao = i;
                break;
                
            }
            
            
        }
            System.out.println("\n---> RESULTADO <--_");
            
            if (posicao!= -1) {
            System.out.println("\nMaterial encontrado: \n" + produtosCad[posicao]);
            
        } else {
                
            System.out.println("\nCódigo não encontrado, produto inexistente.");
        }
            
            
        scanner.close();
    }
}
        
    
    

