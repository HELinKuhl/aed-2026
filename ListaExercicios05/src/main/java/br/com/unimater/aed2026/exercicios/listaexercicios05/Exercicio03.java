/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios05;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio03 {
    
        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
            
            double[][] notas = new double[4][3];
            String[] disciplinas = {"Matemática", "Português", "História"};

            
            System.out.println("Digite as notas dos 4 alunos:");
                for (int i = 0; i < 4; i++) { 
                    System.out.println("\nAluno " + (i + 1) + ":");
                    
                for (int j = 0; j < 3; j++) { 
                System.out.print(" " + disciplinas[j] + ": ");
                notas[i][j] = scanner.nextDouble();
                
            }
        }
            
            System.out.println("\n---> RELATÓRIO <---");
            
                
            double[] mediaAluno = new double[4];
                for (int i = 0; i < 4; i++) {
                double soma = 0;
                
                for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
                }
                mediaAluno[i] = soma / 3;
                System.out.printf("Média do Aluno %d: %.2f%n", (i + 1), mediaAluno[i]);
                
        }
            System.out.println("\n"); 
            double[] mediaDisciplina = new double[3];
                for (int j = 0; j < 3; j++) { 
                double soma = 0;
                    
                    for (int i = 0; i < 4; i++) { 
                    soma += notas[i][j];
                
            }
                           
            mediaDisciplina[j] = soma / 4;
            System.out.printf("Média de %s: %.2f%n", disciplinas[j], mediaDisciplina[j]);
        }
                        
            double maiorMediaAluno = mediaAluno[0];
                int alunoMaior = 1;
                for (int i = 1; i < 4; i++) {
                     if (mediaAluno[i] > maiorMediaAluno) {
                    maiorMediaAluno = mediaAluno[i];
                    alunoMaior = i + 1;
                    
                    
            }
        }
        
            double menorMediaDisciplina = mediaDisciplina[0];
                int indiceMenor = 0;
                for (int j = 1; j < 3; j++) {
                     if (mediaDisciplina[j] < menorMediaDisciplina) {
                     menorMediaDisciplina = mediaDisciplina[j];
                     indiceMenor = j;
                     
            }
        }       
        System.out.printf("\nAluno com maior média: \nAluno %d com %.2f%n", alunoMaior, maiorMediaAluno);
        System.out.printf("\nDisciplina com menor média: \n%s com %.2f%n", disciplinas[indiceMenor], menorMediaDisciplina);

          
            
        scanner.close();
    }
}
        
    
    

