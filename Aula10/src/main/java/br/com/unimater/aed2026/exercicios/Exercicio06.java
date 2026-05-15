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
public class Exercicio06 {
    
    public static void main(String[] args){
        
          Scanner scanner = new Scanner(System.in);
          
            double[] temperaturas = new double[12];
            String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
            
            double soma = 0, mediaAnual;
            
            for (int i = 0; i < temperaturas.length; i++) {
                  System.out.print("Digite a temperatura média do mês de "+ meses[i] +": ");
                  temperaturas[i] = scanner.nextDouble();    
                  
            }
            
            for (int i = 0; i < temperaturas.length; i++) {
                  soma += temperaturas[i];      
                  
            }
            mediaAnual = soma / temperaturas.length;
                 System.out.printf("Média anual de temperaturas: %.2fº\n", mediaAnual);
            
            System.out.println("Meses ACIMA da média anual:");
            
                for (int i = 0; i < temperaturas.length; i++) {
                    
                    if (temperaturas[i] > mediaAnual) {
                        System.out.println(meses[i]+" = "+temperaturas[i]+"º");
                        
                  }
            
            }
                
            System.out.print("Classificação do clima anual: ");
                if (mediaAnual < 15) {
                      System.out.printf("Frio.");
                }   else if (mediaAnual < 25) {
                      System.out.printf("Ameno.");
                }        else {
                            System.out.printf("Quente.");
                }
                
            scanner.close();
      }
}