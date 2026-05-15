/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.exemplos.aula05;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Aula05 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
    System.out.println("Informe o primeiro nro iteiro:");
    int nro1 = scanner.nextInt();
    
    System.out.println("Informe o segundo nro iteiro:");
    int nro2 = scanner.nextInt();
    
    // Adição - SOMAR 
    
    int soma = nro1 + nro2;
    
        //System.out.println("\n Soma é: "+soma);
    // Subtração
        
    int sub = nro1 - nro2;
    
    // Multiplicação
    int multi = nro1 * nro2;
    
    // Divição 
    int divi = nro1 / nro2;
    
    // resto da divisão
    
    int resta = nro1 % nro2;
    
        System.out.println("Resultados das operações:"
                + "\n Adição: "+soma+
                "\n Subtração: " +sub+
                "\n Multiplicação: "+multi+
                "\n Divisão: "+divi+
                "\n Restou: "+resta
                );
    
    }
}
