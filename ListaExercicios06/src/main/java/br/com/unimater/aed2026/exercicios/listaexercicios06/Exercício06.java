/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício06 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Possui sintomas fortes? (true/false): ");
        boolean sintomasFortes = scanner.nextBoolean();
        
        
        
        boolean prioritario = ehPrioritario(idade, sintomasFortes);
        String classificacao = gerarClassificacao(prioritario);
        
        exibirFicha(nome, idade, classificacao);
        
        
    }
    
    public static boolean ehPrioritario(int idade, boolean sintomasFortes) {
        return idade >= 60 || sintomasFortes;
        
    }
    
    
    public static String gerarClassificacao(boolean prioritario) {
        
        if (prioritario) {
            
            return "Atendimento prioritário";
            
        } else {
            
            return "Atendimento comum";
        }
    }
    
    public static void exibirFicha(String nome, int idade, String classificacao) {
        
        System.out.println("\n==== FICHA DE ATENDIMENTO ====\n");
        System.out.printf("Paciente: %s \n", nome);
        System.out.printf("Idade: %d anos \n", idade);
        System.out.printf("Classificação: %s", classificacao);

    }
}
        
    



