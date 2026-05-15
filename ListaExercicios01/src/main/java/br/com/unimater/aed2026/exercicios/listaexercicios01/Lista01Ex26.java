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
public class Lista01Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        /* Exercício 26 - Conversor de Medidas (Polegadas)
Descrição: Leia um valor em centímetros e converta para polegadas.
        */
        System.out.println("\n \n-> Exercícios 26 <-");
        System.out.println("Quantos centimentros tem?");
        double medidaCm = scanner.nextDouble();
        
        double polegadaConv = medidaCm / 2.54;
        
        System.out.println("Convertendo fica "+df.format(polegadaConv) +" polegadas.");
        
        
        
    }
}
