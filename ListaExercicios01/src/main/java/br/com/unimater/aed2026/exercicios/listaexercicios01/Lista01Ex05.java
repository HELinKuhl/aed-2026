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
public class Lista01Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
     
        /*  
        Exercício 5  - Gasto de Viagem
Descrição: Leia a distância de uma viagem e o preço do combustível. Considere que o carro faz 12km por litro. Exiba o gasto total.
Dica: Primeiro calcule a quantidade de litros (Distância / 12).
        */
        
        System.out.println("\n \n-> Exercícios 05 <-");
        System.out.println("Digite qual é a distância da sua viabem em Km (ex: 170)");
        double distanciaViagem = scanner.nextDouble();
        
        System.out.println("Digite o valor do litro do combustivel (ex: 6,50)");
        double valorGas = scanner.nextDouble();
        
        double mediaCarro = 12;
        double gastoDist = distanciaViagem / mediaCarro;
        double gastoGas = gastoDist*valorGas;
        
        System.out.println("Seu carro vai gastar R$" +df.format(gastoGas));
        
    }    
    
}
