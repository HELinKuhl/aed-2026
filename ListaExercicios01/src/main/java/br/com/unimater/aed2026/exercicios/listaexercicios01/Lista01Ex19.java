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
public class Lista01Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        /* Exercício 19 - Volume de uma Esfera
Descrição: Leia o raio e calcule o volume de uma esfera.
Fórmula: V=(4.0/3.0)×π×raio3.
        */

        System.out.println("\n \n-> Exercícios 19 <-");
        System.out.println("Informe o raio da esfere:");
        double raioEsfera = scanner.nextDouble();
        
        double volumeEsfera = (4.0/3.0)*3.1415 * (raioEsfera *raioEsfera*raioEsfera);
        
        System.out.println("O Volume da esfera é de :"+df.format(volumeEsfera) );
        
        
                
    }
    
    
}
