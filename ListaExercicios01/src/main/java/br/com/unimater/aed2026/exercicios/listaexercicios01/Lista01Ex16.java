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
public class Lista01Ex16 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        /* 
        Exercício 16 - Consumo de Energia Elétrica
Descrição: Leia a potência de um aparelho (em Watts), as horas que ele fica ligado por dia e o preço do kWh. Calcule o custo mensal desse aparelho.
Fórmula: ConsumoMensal=(Potencia×Horas×30)/1000. Depois, multiplique o resultado pelo preço do kWh.
        */
        
        System.out.println("\n \n-> Exercícios 16 <-");
        System.out.println("Qual é a portência do aparelho? (Ex: 500)");
        int potenciaAparelho = scanner.nextInt();
        
        System.out.println("Quantas horas o aparelho fica ligado? (Ex: 10)");
        int horasAparelho = scanner.nextInt();
        
         System.out.println("qual preço do KWH? (Ex: 15,50)");
        double CustoEnergia = scanner.nextDouble();
        
        double consumoParelho = (potenciaAparelho * horasAparelho * 30)/1000;
        double custoMesAparelho = consumoParelho * CustoEnergia;
        
        System.out.println("Seu aparelho consome "+consumoParelho+ "KW/h, o que gera um custo de R$"+df.format(custoMesAparelho));
    }
    
}
