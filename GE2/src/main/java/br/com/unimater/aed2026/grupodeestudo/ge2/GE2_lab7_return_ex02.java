/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.grupodeestudo.ge2;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class GE2_lab7_return_ex02 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            
            System.out.println("Qual é a quantidade de parcelas?");      
            int nroParcelas = scanner.nextInt();
            
            System.out.println("Qual valor da porra da parcela?");
            double vlrParcela = scanner.nextDouble();
            
            
            if (nroParcelas >= 0 && vlrParcela >=0){
                double total = calcParcelas(nroParcelas, vlrParcela);
            
                System.out.printf("\n Total Compra: R$ %.2f", total);
            }else {
                System.out.println("ERRO BURRO");
            }
                
            
        }
    }
    
    private static double calcParcelas (int nroP, double vlr){
        if (nroP == 0){
            return 0;
        }else {
            return vlr + calcParcelas(nroP -1, vlr);
        }
        
        
    }
    
    

    
}

