/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios01;


import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Lista01Ex11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        
        /* 
        Exercício 11  - Idade em Dias
Descrição: Leia a idade de uma pessoa em anos e exiba o total aproximado de dias vividos (considere anos de 365 dias).
        */
        
        System.out.println("\n \n-> Exercícios 11 <-");
        System.out.println("Quantos anos você tem?");
        int idIdade = scanner.nextInt();
        int diasVividos = idIdade *365;
        
        System.out.println("Vocé já viveu "+diasVividos+ " dias.");
        
    }
    
}
