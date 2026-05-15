/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio11escolar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe Media FINAL do aluno");
        double VLmediaFinal = scanner.nextDouble();
        
        System.out.println("Informe a presença do aluno");
        int VLfrequencia = scanner.nextInt();
        
        
        
        
        if (VLfrequencia >= 75 ){
            //System.out.println("Essas medidas são de um Triângulo.\n\n");
            
            
            if (VLmediaFinal >= 7.0 ) {
                System.out.println("Aluno APROVADO");
            
            } else {
                if ((VLmediaFinal >= 5.0 )) {
                    System.out.println("Aluno em RECUPERAÇÃO");

                } else {
                    System.out.println("Aluno REPROVADO por NOTA");
                }
            }
        } else {
            System.out.println("Aluno REPROVADO por FALTA");

        }
    }
    
    
}
