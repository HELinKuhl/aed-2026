/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios06;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercício05 {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        
        System.out.print("Digite o código do cupom: ");
        int codigo = scanner.nextInt();
        
        
        if (cupomValido(codigo)) {
            double percentual = obterPercentualDesconto(codigo);
            double valorFinal = calcularValorFinal(valorCompra, percentual);
            exibirResultadoCupom(true, valorFinal);
            
        } else {
            
            exibirResultadoCupom(false, valorCompra);
        }
       
    }
    
    public static boolean cupomValido(int codigo) {
        return codigo == 1001 || codigo == 1002 || codigo == 1003;
    }
    
    public static double obterPercentualDesconto(int codigo) {
        
        if (codigo == 1001) {
            return 5.0;
            
        } else if (codigo == 1002) {
            
            return 10.0;
            
        } else if (codigo == 1003) {
            
            return 15.0;
        }
        
        return 0.0;
    }
    
    public static double calcularValorFinal(double valorCompra, double percentual) {
        double desconto = valorCompra * (percentual / 100);
        return valorCompra - desconto;
    }
    
    
    public static void exibirResultadoCupom(boolean valido, double valorFinal) {
        System.out.println("\n===================================\n");
        
        if (valido) {
            System.out.println("CUPOM APLICADO!");
            System.out.printf("Valor final: R$ %.2f \n", valorFinal);
            
        } else {
            
            System.out.println("CUPOM INVÁLIDO!");
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor final: R$ %.2f", valorFinal);
            
            
        }
        
    }
    
}   
        
    



