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
public class Lista01Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        
        /* Exercício 29 - Salários Mínimos
Descrição: Leia o salário de um funcionário e o valor do salário mínimo atual. Exiba quantos salários mínimos esse funcionário ganha.
        */
        
        System.out.println("\n \n-> Exercícios 29 <-");
        System.out.println("Informe o valor do salário:");
        double valorSalario = scanner.nextDouble();
        
        System.out.println("Qual o valor do salário mínimo atual?:");
        double salrioMinimo = scanner.nextDouble();
        
        double valorGanha = valorSalario / salrioMinimo;
        //double valorGanhaResta = valorSalario % salrioMinimo;
        
        //double qtdSalarioMin = valorGanha + valorGanhaResta;
        
        //System.out.println("Esse funcionário ganha "+qtdSalarioMin +" salarios mínimos.");
    
        System.out.println("Esse funcionário ganha "+df.format(valorGanha) +" salarios mínimos.");
    
    
    }
    
    
    
}
