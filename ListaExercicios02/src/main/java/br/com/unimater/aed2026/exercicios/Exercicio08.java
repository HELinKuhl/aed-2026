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
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("Informe a hora atual: (EX de 0 a 23)");
        int horaInf = scanner.nextInt();
     
        System.out.println("a Hora informada foi: \n"+horaInf+"Hrs");
        
        
        switch (horaInf){
                
                case 0:
                    System.out.println("Esse é o turno da Madrugada.");
                    break;
                case 1:
                    System.out.println("Esse é o turno da Madrugada.");
                    break;
                case 3:
                    System.out.println("Esse é o turno da Madrugada.");
                    break;
                case 4:
                    System.out.println("Esse é o turno da Madrugada.");
                    break;
                case 5:
                    System.out.println("Esse é o turno da Madrugada.");
                    break;    
                case 6:
                    System.out.println("Esse é o turno da Manhã.");
                    break;
                case 7:
                    System.out.println("Esse é o turno da Manhã.");
                    break;
                case 8:
                    System.out.println("Esse é o turno da Manhã.");
                    break;
                case 9:
                    System.out.println("Esse é o turno da Manhã.");
                    break;
                case 10:
                    System.out.println("Esse é o turno da Manhã.");
                    break;
                case 11:
                    System.out.println("Esse é o turno da Manhã.");
                    break;
                case 12:
                    System.out.println("Esse é o turno da Tarde.");
                    break;
                case 13:
                    System.out.println("Esse é o turno da Tarde.");
                    break;
                case 14:
                    System.out.println("Esse é o turno da Tarde.");
                    break;
                case 15:
                    System.out.println("Esse é o turno da Tarde.");
                    break;
                case 16:
                    System.out.println("Esse é o turno da Tarde.");
                    break;
                case 17:
                    System.out.println("Esse é o turno da Tarde.");
                    break;
                case 18:
                    System.out.println("Esse é o turno da Noite.");
                    break;
                case 19:
                    System.out.println("Esse é o turno da Noite.");
                    break;
                case 20:
                    System.out.println("Esse é o turno da Noite.");
                    break;
                case 21:
                    System.out.println("Esse é o turno da Noite.");
                    break;
                case 22:
                    System.out.println("Esse é o turno da Noite.");
                    break;
                case 23:
                    System.out.println("Esse é o turno da Noite.");
                    break;
                                    
    
                        
            default:
                System.out.println("Digite o horario correto.");
        
            }
    
        
        
    }
    
}

