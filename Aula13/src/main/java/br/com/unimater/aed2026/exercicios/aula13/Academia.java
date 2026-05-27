/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.aula13;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Academia {
    
    Scanner scanner = new Scanner(System.in);
    
    
    public static void exPlanos() {
        System.out.println("---> PLANOS DISPONÍVEIS <---");
        exPlano ("Smart", 99.90);
        exPlano ("Smart+", 139.90);
        exPlano ("Premium", 199.90);
        System.out.println("\n---------------------------");
        
    }
    
    
    public static void exPlano (String plano, double preco) {
        System.out.println("---> PLANOS DISPONÍVEIS <---");
        System.out.printf("%s: R$ %.2f \n", plano, preco);
        
    }
    
    public static void calcIMC (double peso, double altura) {
        double imc = peso /(altura * altura);
        String classificacao ="\n";
        
        if (imc < 18.5){
            classificacao = "Magro (Abaixo do preso).";
            
        } else if (imc >= 18.5 && imc < 25.0){
            classificacao = "Normal (Peso ideial).";
        
        } else  {
            classificacao = "Gordo (Sobrepeso)";
        }
        
        System.out.printf("IMC: %.2f | Classificado como %s \n", imc, classificacao);
    }
    
    public static void main(String[] args) {
        //TO-DO: Exibir Planos
        exPlanos();
        

        //TO-DO: Calcular IMC
        System.out.println("Resultado da avaliacao física:");
        calcIMC(78, 1.78);
        
    }
    
    
    
    
    
    
    
    
}
