/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício03 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua meta diária em litros: ");
        double metaLitros = scanner.nextDouble();
        
        System.out.print("Capacidade do copo em ml: ");
        double mlPorCopo = scanner.nextDouble();
        
        if (metaLitros <= 0 || mlPorCopo <= 0) {
            System.out.println("ERRO: Os valores devem ser maiores que zero!");
            
        } else {
            
            double quantidadeCopos = calcularQuantidadeCopos(metaLitros, mlPorCopo);
            exibirPlanoHidratacao(metaLitros, mlPorCopo, quantidadeCopos);
        }
        
        scanner.close();
    }

    private static void exibirPlanoHidratacao(double metaLitros, double mlPorCopo, double quantidadeCopos) {
        
        System.out.println("\n==== PLANO DE HIDRATAÇÃO ===\n");
        System.out.printf("Meta diária: %.2f L \n", metaLitros); 
        System.out.printf("Capacidade do copo: %.0f ml \n", mlPorCopo);
        
        System.out.println("\n-----------------------------------\n");
        
        System.out.printf("Você precisa beber: %.2f copos \n", quantidadeCopos); 
        
        int coposArredondado = (int) Math.ceil(quantidadeCopos); 
        System.out.printf("Na prática: %d copos por dia %n \n", coposArredondado);
        
        System.out.println("Beba água e mantenha-se hidratado!");
        
    }

    private static double calcularQuantidadeCopos(double metaLitros, double mlPorCopo) {
        double litrosEmMl = metaLitros * 1000;
        return litrosEmMl / mlPorCopo;
    }
}


