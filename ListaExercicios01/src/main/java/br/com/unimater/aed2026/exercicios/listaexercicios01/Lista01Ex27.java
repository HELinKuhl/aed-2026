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
public class Lista01Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
               
        
        /* Exercício 27 - Custo de Carro Novo
Descrição: O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor (28%) e dos impostos (45%). Leia o custo de fábrica e exiba o custo final.
        */
        System.out.println("\n \n-> Exercícios 27 <-");
        System.out.println("Informe o custo do fabricante:");
        double valorCusto = scanner.nextDouble();
        
        double porcetDistribuicao = 0.28;
        double impostdoLulis = 0.45;
        
        
        double valorConsumidor = valorCusto + ((valorCusto*porcetDistribuicao) + (valorCusto*impostdoLulis));
        
        System.out.println("O Valor final para o consumidor é de R$"+df.format(valorConsumidor));
        
        
        
    }
}
