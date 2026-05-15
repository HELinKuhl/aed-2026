/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.exemplos.aula05.exercicios;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println(" -> Apuração Eleitoral <-");
            
            int votosCandidatoA;
            System.out.print("Digite a quantidade de votos do Candidato A: ");
        votosCandidatoA = scanner.nextInt();
            
        
            int votosCandidatoB;
            System.out.print("Digite a quantidade de votos do Candidato B: ");
        votosCandidatoB = scanner.nextInt();
           
            int votosCandidatoC;
            System.out.print("Digite a quantidade de votos do Candidato C: ");
        votosCandidatoC = scanner.nextInt();
            
            
            
         int votosNulos;
         System.out.print("Digite a quantidade de votos NULOS: ");
        votosNulos = scanner.nextInt();
        
            int votosBrancos;
            System.out.print("Digite a quantidade de votos em BRANCO: ");
        votosBrancos = scanner.nextInt();
        
        int totalValidos = votosCandidatoA + votosCandidatoB + votosCandidatoC;
        int totalEleitores = totalValidos + votosNulos + votosBrancos;
        
        System.out.println("Contagem: \n Total Votos Válidos" +totalValidos+
                "\n Total de eleitores: "+totalEleitores);
        
        double percentualVotosValidos = (totalValidos / (double) totalEleitores) * 100.0;
        double percentualCandidatoA = (votosCandidatoA / (double) totalEleitores) * 100.0;
        double percentualCandidatoB = (votosCandidatoB / (double) totalEleitores) * 100.0;
        double percentualCandidatoC = (votosCandidatoC / (double) totalEleitores) * 100.0;
        double percentualVotosNulos = (votosNulos / (double) totalEleitores) * 100.0;
        double percentualVotosBrancos = (votosBrancos / (double) totalEleitores) * 100.0;    
        
            System.out.println("\n -> Apuração <-");
        System.out.println("Total Geral de Eleitores: " + totalEleitores);
        System.out.println("Total de Votos Válidos: " + totalValidos);
        System.out.printf("Percentual de Votos Válidos: %.2f%%\n", percentualVotosValidos);
        //System.out.printf("Percentual do Candidato A: %.2f%%\n", percentualCandidatoA);
        System.out.printf("Percentual do Candidato B: %.2f%%\n", percentualCandidatoB);
        System.out.printf("Percentual do Candidato C: %.2f%%\n", percentualCandidatoC);
        System.out.printf("Percentual de Votos Nulos: %.2f%%\n", percentualVotosNulos);
        System.out.printf("Percentual de Votos em Branco: %.2f%%\n", percentualVotosBrancos);
        
        
    }
    
    
}
