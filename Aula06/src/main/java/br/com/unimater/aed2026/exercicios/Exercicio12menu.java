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
public class Exercicio12menu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CALCULARDORA MENU ");
        
        System.out.println("1 - Somar");
        
        System.out.println("2 - Subtrair");
        
        System.out.println("3 - Multiplicar");
        
        System.out.println("4 - Dividir");
        
        System.out.print("Escolha a opção: ");
        int OPCmenu = scanner.nextInt();
        
        System.out.println("\n Opção: "+OPCmenu+" selecionada\n");
        
        
        
        System.out.print("Digite o primeiro valor: ");
        double Vlr1 = scanner.nextDouble();
        
        
        System.out.print("Digite o segundo valor: ");
        double Vlr2 = scanner.nextDouble();
        
        
        System.out.println("\n Seus Valores informados foram \n Valor 01: " +Vlr1+ "\n Valor 02: "+Vlr2+"\n");
        
            switch (OPCmenu){
                
                case 1:
                    System.out.println("O resultado é: " + (Vlr1 + Vlr2));
                    break;
                
                case 2:
                    System.out.println("O resultado é: " + (Vlr1 - Vlr2));
                    break;
                
                case 3:
                    System.out.println("O resultado é: " + (Vlr1 * Vlr2));
                    break;
                
                case 4:
                        if (Vlr2 != 0) {
                            System.out.println("O resultado é: " + (Vlr1 / Vlr2));
                        } else {
                            System.out.println("Erro: Divisão por zero");
                        }
                    break;    
            default:
                System.out.println("Opção Inválida");
                
            }
        
    }
    
    
}
