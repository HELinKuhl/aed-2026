/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiraaula.algoritmos;

import static java.lang.IO.print;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



/**
 *
 * @author comunicacaofotos
 */
public class PrimeiraAulaAlgoritmos {

    public static void main(String[] args) {
        
        LocalDateTime agora = LocalDateTime.now();
        
        // Definir o formato desejado (ex: dd/MM/yyyy HH:mm:ss)
        DateTimeFormatter dataok = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Formatar e exibir
        String dataFormatada = agora.format(dataok);
        
        DateTimeFormatter horaok = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = agora.format(horaok);
        
       System.out.println ("Informe a Temperatura!");
       Scanner sc = new Scanner (System.in);
       //String temp = sc.next();
        Double temp = sc.nextDouble(); 
            
        
                                for (int i = 0; i < 50; i++) {
                             System.out.println();
                         }
            
            
            String status;
                        if (temp < 20) {
                status = "BAIXA";
            } else if (temp >26 ) {
                status = "ALTA ";
            } else {
                status = "IDEAL";
            }
       
        
        System.out.println("+----------------+");
        System.out.println("Hel Digital System");
        System.out.println("+----------------+");
        System.out.println("|" +dataFormatada+ "      |");
        System.out.println("|                |");
        System.out.println("|    " +temp+ "°C      |");
        System.out.println("|    " +status+"       |");
        System.out.println("|                |");
        System.out.println("|        "+horaFormatada+"|");
        System.out.println("+----------------+");
        
                            for (int i = 0; i < 3; i++) {
                System.out.println();
            }
        
    }
}
        
    

