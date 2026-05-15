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
public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o numero:");
        double Nro = scanner.nextDouble();
        
        
        
        if (Nro > 0) {
            System.out.println("Número informad é "+Nro
                                +"\nEle positivo.");
        }else if (Nro == 0) {
            System.out.println("Número informad é "+Nro
                                +"\nEle é 0 Zero.");
        
        } else
        
        System.out.println("Número informad é "+Nro
                                +"\nEle é negativo.");
        
        
        
    }
    
}
