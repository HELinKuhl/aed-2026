/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula12;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exemplo01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String[] frutas = {"Abacaxi", "Banana", "Caqui", "Goiaba", "Laranja", "Maça"}; 
        
        System.out.println("Digite a fruta que deseja pesquisar:");
        String busca = scanner.nextLine();
        
        int posicao = -1;
        
        for (int i = 0; i < frutas.length; i++) {
            if (busca.equalsIgnoreCase(frutas[i])) {
                posicao = i;
                break;
                
            }
            String fruta = frutas[i];
            
            
        }
        
        if (posicao != -1) {
                System.out.println("Fruta encontrada na posição " + posicao);    
                
            }else {
            System.out.println("Fruta não está no estoque");
            
            }
        
        
        
        scanner.close();
    }
}
