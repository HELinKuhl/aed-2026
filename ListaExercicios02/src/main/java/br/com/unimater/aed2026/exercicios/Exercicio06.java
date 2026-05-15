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
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos pontos seu time fez? (ex: 0 a 100)");
        int PontosTime = scanner.nextInt();
        
        
        if (PontosTime >= 60) {
            System.out.println("Campeão ou vice-campeão — Zona de acesso ao próximo nível");
            
        }else if (PontosTime >= 45) {
            System.out.println("Zona de meio de tabela — temporada regula");
        
        } else if (PontosTime >= 30) {
            System.out.println("Zona de rebaixamento — temporada ruim");
        
        } else 
            System.out.println("Rebaixado — desempenho crítico");
        
       
        
        
    }
    
}

