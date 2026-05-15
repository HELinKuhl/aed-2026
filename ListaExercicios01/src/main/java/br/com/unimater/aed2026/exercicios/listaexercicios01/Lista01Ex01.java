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
public class Lista01Ex01 {
         /*Exercício 1  - Perímetro do Retângulo
    Descrição: Declare variáveis fixas para base e altura de um retângulo e calcule o perímetro.
    Fórmula: Perimetro=2×(base+altura).
    Dica: Use o tipo double para permitir valores decimais.
    */
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
   
        
        System.out.println("-> Bem vindo a Lista de Exercícios 01 <-");
        
        System.out.println("Digite o valor da base:");
        double valorBase = scanner.nextDouble();
        
        System.out.println("Digite o valor da altura:");
        double valorAltura = scanner.nextDouble();
        
        double valorPerimetro = 0;
        valorPerimetro = 2*(valorBase+valorAltura);
        
        System.out.println("O Perimetro é "+valorPerimetro);
    }
}
