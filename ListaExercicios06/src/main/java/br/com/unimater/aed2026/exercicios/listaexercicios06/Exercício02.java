/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício02 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Nome do Aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Nome do responsável: ");
        String responsavel = scanner.nextLine();
        
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        
        System.out.print("Parentesco: ");
        String parentesco = scanner.nextLine();
        
        
        exibirContatoEmergencia (nomeAluno, responsavel, telefone, parentesco);
        exibirAvisoPadrao();
        
        
    }

    private static void exibirContatoEmergencia(String nomeAluno, String responsavel, String telefone, String parentesco) {
        
        System.out.println("\n====== CONTATO DE EMERGÊNCIA ======\n");
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Responsável: " + responsavel);
        System.out.printf("Telefone: %s%n", telefone);
        System.out.println("Parentesco: " + parentesco);
        

    }
    
    

    private static void exibirAvisoPadrao() {
        
        System.out.println("\n====== CONFIRME OS DADOS ======\n");
        System.out.println("Confira todos os dados antes de salvar");
       
    }




}


