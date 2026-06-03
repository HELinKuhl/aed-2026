/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

/**
 *
 * @author helmuthkuhl
 */
public class ListadeCompra {
    
    public static int contarItensCompra(String[] lista, int indice){
        //1.Caso Base
        if (indice == lista.length){
            return 0;
        }
        
        
        //2.Caso Recursivo
        return 1 + contarItensCompra(lista, indice +1);
        
        
    }
    
    
    public static void main(String[] args) {
        
        String [] compras = {
            "Leite",
            "Pão", 
            "Arroz",
            "Feijão",
            "Macarão"
        };
        
        int total = contarItensCompra(compras, 0);
        System.out.println("Total de Itens: "+total);
        
    }
    
}
