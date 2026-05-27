/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula13;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Cardapio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        exibeMenu();
        exibeItem("Café", 4.5);
        exibeItem("Sanduiche", 12.0);
        
    }
    
    
    public static void exibeMenu () {
        System.out.println("----> MENU <----");
        
    }
    
    
    
    public static void exibeItem (String nome, double preco) {
        System.out.printf("-> %s R$ %.2f \n", nome, preco);
        
    }
    
    
    
    
    
    
    
    
    
    
}
