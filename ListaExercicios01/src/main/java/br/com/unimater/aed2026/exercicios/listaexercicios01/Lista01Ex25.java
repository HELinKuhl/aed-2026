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
public class Lista01Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        /* Exercício 25 - Salário de Vendedor
Descrição: Um vendedor ganha R$ 1.200,00 fixos mais 4% de comissão sobre as vendas. Leia o valor vendido e exiba o salário total.
        */
        
        System.out.println("\n \n-> Exercícios 25 <-");
        System.out.println("Informe o valor vendido");
        double valorVendido = scanner.nextDouble();
        
        double salarioMes = 1200;
        double porcent = 0.04;
        
        double valorSomar = valorVendido * porcent;
        double valorTotalPagar = salarioMes + valorSomar;
        
        System.out.println("Valor total a pagar: "+df.format(valorTotalPagar));
        
        
    }
    
}
