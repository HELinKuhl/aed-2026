/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício04 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Distância em km: ");
        double distanciaKm = scanner.nextDouble();
        
        System.out.print("Tempo estimado em minutos: ");
        int minutos = scanner.nextInt();
        
        System.out.print("Horário de pico? (true/false): ");
        boolean horarioPico = scanner.nextBoolean();
        
        System.out.println();
        
        if (distanciaKm <= 0 || minutos <= 0) {
            System.out.println("ERRO: Distância e tempo devem ser maiores que zero!");
        } else {
            double valorBase = calcularValorBase(distanciaKm, minutos);
            
            double valorFinal = aplicarHorarioPico(valorBase, horarioPico);
            
            exibirResumoCorrida(distanciaKm, minutos, valorFinal);
        }
        
        
    }
    
    public static double calcularValorBase (double distanciaKm, int minutos) {
        double valorBase = 5.00; 
        valorBase += distanciaKm * 2.20; 
        valorBase += minutos * 0.35; 
        return valorBase;
    }
    
    public static double aplicarHorarioPico (double valor, boolean horarioPico) {
        if (horarioPico) {
            double acrescimo = valor * 0.18;
            return valor + acrescimo;
            
        } else {
            
            return valor; 
        }
    }
    
    
    public static void exibirResumoCorrida(double distanciaKm, int minutos, double valorFinal) {
        
        System.out.println("==== RESUMO DA SUA CORRIDA ====\n");
        ;
        System.out.printf("Distância: %.2f km%n", distanciaKm);
        System.out.printf("Tempo estimado: %d min \n", minutos);
        
        System.out.println("\n-----------------------------------\n");
        System.out.printf("Valor estimado: R$ %.2f \n", valorFinal);
        
        System.out.println("\n-----------------------------------\n");
        System.out.println("\nObrigado por simular sua viagem!");
    }
}
        
        
    



