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
public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] pacientes = new String[8];

        System.out.println("Digite o nome dos 8 pacientes na ordem de chegada:");
        for (int i = 0; i < pacientes.length; i++) {
            System.out.print("Paciente " + (i + 1) + ": ");
            pacientes[i] = scanner.nextLine();
            
        }

        System.out.println("\n---> FILA <---");

        System.out.println("\na) Ordem original de atendimento:");
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println(pacientes[i]);
            
        }

        System.out.println("\nb) Primeiro paciente da fila: \n" + pacientes[0]);

        System.out.println("\nc) Último paciente da fila: \n" + pacientes[pacientes.length - 1]);

        System.out.println("\nd) Pacientes numerados:");
        
        for (int i = 0; i < pacientes.length; i++) {
            System.out.printf("%dº - %s%n", (i + 1), pacientes[i]);
            
        }

        scanner.close();
    }
}
        
    
    

