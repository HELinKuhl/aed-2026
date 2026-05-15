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
public class Exercicio07 {
    
    public static void main(String[] args){
        
          Scanner scanner = new Scanner(System.in);
          
            int[] votos = new int[6];
            int votoLido = -1, votosValidos = 0;
            
            double[] percentual = new double[6];
            int maiorVotos = 0, vencedor = 0;

            while (votoLido != 0) {
                  
                System.out.println("Escolhe o candidato a melhor aluno entre 1 a 5:");
                  votoLido = scanner.nextInt();

                  if (votoLido > 0 && votoLido <= 5) {
                        votos[votoLido]++;
                        votosValidos++;
                  
                  }else if (votoLido > 5 || votoLido < 0) {
                        System.out.println("Voto inválido");
                 
                  } else {
                        System.out.println("Apuração concluída!");
                        
                  }
            }

            System.out.println("Votos válidos: " + votosValidos);

            for (int i = 1; i < votos.length; i++) {
                  percentual[i] = (double) votos[i] / votosValidos * 100;
                  
                    if (votos[i] > maiorVotos) {
                        maiorVotos = votos[i];
                        vencedor = i;
                  }
            }

            System.out.println("Quantidade de votos por candidato e seu percentual:");
            for (int j = 1; j < votos.length; j++) {
                  System.out.printf("Candidato %d: %d       %%: %.2f\n", j, votos[j], percentual[j]);
            }

           
            System.out.printf("Candidato número %d foi o vencedor!", vencedor);
        
        scanner.close();    
    }
}