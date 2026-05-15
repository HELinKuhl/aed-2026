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
public class Exercicio04 {
    
    public static void main(String[] args) {
        
            
     Scanner scanner = new Scanner(System.in);

        int[] codID = {100101, 100205, 100389, 100412, 100578, 100699, 100745, 100812, 100930, 101050};
        String[] statusCad = {"Aguardando pagamento", "Pago", "Em separação", "Enviado", "Entregue", "Cancelado", "Pago", "Em transporte", "Entregue", "Aguardando retirada"};

        System.out.println("Digite o código do pedido:");
        int busca = scanner.nextInt();

        int inicio = 0;
        int fim = codID.length - 1;
        int posicao = -1;
        int verificacoes = 0;

        while (inicio <= fim) {
            verificacoes++;
            int meio = (inicio + fim) / 2;

            if (codID[meio] == busca) {
                posicao = meio;
                break;
            } else if (codID[meio] < busca) {
                inicio = meio + 1; 
            } else {
                fim = meio - 1; 
            }
        }

        
        if (posicao!= -1) {
            System.out.println("Status do pedido: " + statusCad[posicao]);
            
        } else {
            System.out.println("\nPedido não foi encontrado");
            
        }
        
        System.out.println("\nVerificações realizadas: " + verificacoes);

        scanner.close();
    }
}
    

