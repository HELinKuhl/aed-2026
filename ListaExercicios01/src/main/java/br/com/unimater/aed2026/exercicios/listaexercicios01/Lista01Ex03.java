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
public class Lista01Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
        /*Exercício 3  - Média Aritmética
Descrição: Leia 4 notas bimestrais de um aluno e exiba a média aritmética simples.
Dica: Lembre-se da precedência: a soma das notas deve estar entre parênteses antes da divisão.
        */
        
          System.out.println("\n \n-> Exercícios 03 <-");
        
        System.out.println("Digite a nota do primeiro bimestre");
        double notaPrimeiroB = scanner.nextDouble();
        
        
        System.out.println("Digite a nota do segundo bimestre");
        double notaSegundoB = scanner.nextDouble();
        
        System.out.println("Digite a nota do terceiro bimestre");
        double notaTerceiroB = scanner.nextDouble();
        
        System.out.println("Digite a nota do quarto bimestre");
        double notaQuartoB = scanner.nextDouble();
        
        double notaFinal = (notaPrimeiroB + notaSegundoB + notaTerceiroB + notaQuartoB) / 4;
        
        System.out.println("A nota final é "+df.format (notaFinal));
        
        
    }
    
}
