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
public class Exercicio10triangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe lado A:");
        double VLladoA = scanner.nextDouble();
        
        System.out.println("Informe lado B:");
        double VLladoB = scanner.nextDouble();
        
        System.out.println("Informe lado C:");
        double VLladoC = scanner.nextDouble();
        
        // System.out.println("ISSO NÃO É UM QUADRADO! \n");
        
        
        
        if (VLladoA <(VLladoB+VLladoC) && VLladoB <(VLladoA+VLladoC) && VLladoC <(VLladoA+VLladoB)){
            System.out.println("Essas medidas são de um Triângulo.\n\n");
            
            
            if ((VLladoA == VLladoB) && (VLladoB == VLladoC)) {
                System.out.println("Seu triângulo é um Equilátero");
            
            } else {
                if ((VLladoA == VLladoB) || (VLladoB == VLladoC) || (VLladoC == VLladoA)) {
                    System.out.println("Seu triangulo é um ISÓCELES ");

                } else {
                    System.out.println("Seu triangulo é Escaleno");
                }
            }
        } else {
            System.out.println("Essas medidas NÃO formam um Triângulo");

        }
    }
    
    
}
