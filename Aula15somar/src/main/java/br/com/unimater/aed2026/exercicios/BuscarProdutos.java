/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

/**
 *
 * @author helmuthkuhl
 */
public class BuscarProdutos {
    
    public static boolean buscaProduto(String[] lista, String produto, int indice){
        //1.Caso Base
        if (indice == lista.length){
            return false;
        }
        
        if (lista[indice].equals(produto)) {
            return true;
        }
        
        
        //2.Caso Recursivo
        return buscaProduto (lista, produto, indice +1);
    }
    
    
    public static void main(String[] args) {
        
        String [] produtos = {
            "Leite",
            "Pão", 
            "Arroz",
            "Feijão",
            "Macarão"
        };
        
        boolean encontrou = buscaProduto(produtos, "Leite", 0);
        
        if (encontrou) {
            System.out.println("Produto encontrado!");
        } else {
            System.out.println("Produto não encontrado!");
        }
        
    }
    
}
