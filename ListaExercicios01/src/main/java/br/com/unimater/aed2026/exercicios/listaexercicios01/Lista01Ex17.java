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
public class Lista01Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        /* 
        Exercício 17 - Cálculo de IMC
Descrição: Leia o peso (kg) e a altura (m) de uma pessoa e calcule o IMC.
Fórmula: IMC=Peso/Altura2.
        */
        
        
        System.out.println("\n \n-> Exercícios 17 <-");
        System.out.println("Informe o seu peso:");
        double pesoPessoa = scanner.nextDouble();
        
        System.out.println("Informe sua altura:");
        double alturaPessoa = scanner.nextDouble();
        
        double IMC = pesoPessoa / (alturaPessoa * alturaPessoa);
        
        System.out.println("Seu IMC é: " +df.format(IMC));
        
    }
}
