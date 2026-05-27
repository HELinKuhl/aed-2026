/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula13;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Relatorio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        impCabecalho();
        impAluno("Cleverson", 7.8);
        linha(15);
        impAluno("Hélmuth", 9.0);
        
        
       
        
    }
    public static void linha (int tracos) {
        for (int i = 0; i < tracos; i++){
            System.out.print("-");
        
        }
        
    }
    
    public static void impCabecalho () {
        System.out.println("  Aluno | Média ");
        linha(15);
        
    }
    
    
    
    public static void impAluno (String nome, double media) {
        System.out.printf(" %s  |  %.2f \n", nome, media);
        
        
    }
    
    
}
