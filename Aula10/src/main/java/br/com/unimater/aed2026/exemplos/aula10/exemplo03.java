/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exemplos.aula10;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 * 
 * NOTAS APROVADAS
 */
public class exemplo03 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String [] cidadeS = {"Curitiba", "Pato Branco", "Francisco Beltrão", "Sao Lourenço", "Coronel", "Itu"};
        
        System.out.println("Digite a cidade:");
        String cidade = scanner.nextLine().toLowerCase();
        
        //variavel de controle
        boolean encontrou = false;
        
        for (int i = 0; i < cidadeS.length; i++){
            
            if (cidade.equals(cidadeS[i].toLowerCase())) {
                encontrou = true;
                break;
            }
        
        } 
        
        if (encontrou == true){
            System.out.println("Cidade Encontrada");
            
        }else {
            System.out.println("Cidade Não Encontrada");
        }
   
    
    }
}
