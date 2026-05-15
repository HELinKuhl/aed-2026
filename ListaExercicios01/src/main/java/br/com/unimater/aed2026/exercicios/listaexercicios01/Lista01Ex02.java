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
public class Lista01Ex02 {
    public static void main(String[] args) {
        
        /*Exercício 2  - Conversor de Moeda
    Descrição: Leia um valor em Reais (R$) e a cotação do Euro. Exiba o valor convertido para Euros.
    Dica: Utilize scanner.nextDouble() para ler os valores.
    */
        
    Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
        System.out.println("\n \n-> Exercícios 02 <-");
        
        System.out.println("Digite em Real R$:");
        double valorReal = scanner.nextDouble();
        
        System.out.println("Digite a cotação do Euro €$:");
        double valorEuro = scanner.nextDouble();
        
        
        double valorConvertido = valorReal / valorEuro;
        
        System.out.println("Na conversção você tem "+df.format(+valorConvertido));
        
    }
}
