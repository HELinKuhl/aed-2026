/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.unimater.aed2026.grupodeestudo.ge2;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class GE2_lab7_return_ex03 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Qual primeira senha?");
            int primeiraS = scanner.nextInt();

            System.out.println("Qual a ultima senha?");
            int ultimaS = scanner.nextInt();

            chamarS(primeiraS, ultimaS);

        }
    }

    
    private static void chamarS(int ps, int us) {

        System.out.println(ps);

        if (ps != us) {
            chamarS(ps + 1, us);
            
        } else {
            
            System.out.println("");
        }
        
        
    }
}    