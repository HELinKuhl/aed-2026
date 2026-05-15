/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula12;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exemplo02 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double[] precos = {8.90, 15.50, 23.00, 37.90, 42.00, 55.75, 68.00, 89.90};
        
        System.out.println("Digite o preço da pesquisa: ");
        double busca = scanner.nextDouble();
        
        int ini = 0;
        int fim = precos.length -1;
        int posicao = -1;
        
       
        while (ini <= fim) {
            int meio = (ini + fim) /2;
            
            if (precos[meio] == busca){
                posicao = meio;
                break;
                
            }else if (precos[meio] < busca) {
                ini = meio +1;
                
            
                }else {
                    fim = meio -1;
                    
                    
            }
            
        }
        
        
        if (posicao != -1) {
            System.out.printf("Preço R$ %.2f encotnrado na posição %d", precos[posicao], posicao);
            
            }else {
                System.out.println("Preço não encontrado");    
            }
        
        
        
        
        scanner.close();
    }
}
