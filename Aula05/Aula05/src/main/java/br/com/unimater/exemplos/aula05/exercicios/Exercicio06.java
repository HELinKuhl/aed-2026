/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.exemplos.aula05.exercicios;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio06 {
    
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Cálculo de Salário de Docente.");
            
                double horasTrabalhadas; 
                System.out.print("Digite as horas trabalhadas no mês: ");
                horasTrabalhadas = scanner.nextDouble();
                
                double valorHoraAula;
                System.out.print("Digite o valor da hora-aula: R$ ");
                valorHoraAula = scanner.nextDouble();
                
                double DescontoINSS;
                System.out.print("Digite o percentual de desconto do INSS (ex: 11 para 11%): ");
                DescontoINSS = scanner.nextDouble();
                
                double salarioBruto;
                salarioBruto = horasTrabalhadas * valorHoraAula;
                
                double totalDesconto;
                totalDesconto = salarioBruto * (DescontoINSS / 100.0);
                
                double salarioLiquido;
                salarioLiquido = salarioBruto - totalDesconto;
                
                System.out.println("-> Folha de Pagamento  <-");
                System.out.printf("\n Salário Bruto: R$ %.2f", salarioBruto);
                System.out.printf("\n Desconto INSS (%.2f%%): R$ %.2f", DescontoINSS, totalDesconto);
                System.out.printf("\nSalário Líquido: R$ %.2f", salarioLiquido);
                
    }   
    
}
