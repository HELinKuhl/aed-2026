/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Lista01Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat ("#.00");
        
        /* 
        Exercício 10  - Reajuste Salarial
Descrição: Leia o salário atual de um colaborador e aplique um aumento de 15%. Exiba o novo valor.
        */
        
        System.out.println("\n \n-> Exercícios 10 <-");
        System.out.println("Qual é o salário atual?:");
        double salarioAtual = scanner.nextDouble();
        
        double selarioNovo = salarioAtual * 1.15;
        
        System.out.println("Salario atual é: "+salarioAtual +
                "\nSalário com adicional de 15%: "+selarioNovo);
        
        
    }
    
}
