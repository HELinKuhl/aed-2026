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
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe sua idade:");
        int Idade = scanner.nextInt();
        
        int IdadeFalta = 18 - Idade;
        
        if (Idade >= 18) {
            System.out.println("Idade informada é "+Idade
                                +"\nPode votar e tirar CNH.");
        }else 
        
        System.out.println("Idade informada é "+Idade
                                +"\nFalta "+IdadeFalta+ " ano(s) para poder votar e tirar a CNH.");
        
        
        
    }
    
}
