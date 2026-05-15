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
public class Lista01Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /* Exercício 30 - Regra de Três: Pontuação de Prova
Descrição: Uma prova vale 100 pontos no total. Um aluno tirou X pontos. Se a nota final do semestre vale 10 pontos, qual é a nota proporcional deste aluno?
Dica: Leia a pontuação do aluno (X) e descubra quanto ela vale na escala de 0 a 10.
        */
        System.out.println("\n \n-> Exercícios 30 <-");
        System.out.print("Quantos o aluno tirou na prova? ");
        double pontosAluno = scanner.nextDouble();
        
        double notaProporcional = pontosAluno / 10.0;
        
        System.out.println("a nota proporcional é: " + notaProporcional);
        
        
    }
    
}
