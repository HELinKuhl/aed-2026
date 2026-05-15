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
public class Lista01Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
                 
        /* 
        Exercício 21 - Lucro de Venda
Descrição: Leia preço de custo e % de lucro e exiba o preço final.
        */
        
        System.out.println("\n \n-> Exercícios 21 <-");
        System.out.println("Qual é o preço de custo do produto:");
        double valorCusto = scanner.nextDouble();
        
        System.out.println("Qual a % de licro do produto:");
        double porcLucro = scanner.nextDouble();
        
        double valorLucro = valorCusto * (porcLucro / 100.0);
        double precoFinal = valorCusto + valorLucro;
        
        System.out.println("O preço final do produto é de R$"+df.format(precoFinal));
        
        
        
        
    }
}
