/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.aps1;

import java.util.Scanner;
import java.lang.Thread;

/**
 *
 * @author helmuthkuhl
 */
public class APS1CaixaEletronicoJava {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int numeroConta;
        double saldo = 1000.00;
        
        final double taxa_cc = 12.50;
        final double rend_pp = 0.005;
        
        
        System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |   ===========    JAVA  BANK    ===========    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |         PRECIONE ENTER PARA COMEÇAR           | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]   Opcao invalida! Digite 1 ou 2.           [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+"); 
        System.out.println("\n");
        
                    scanner.nextLine();
        
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |   ===========     BEM VINDO    ===========    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  ┌───────┐                                    | | |");
        System.out.println("| | |  │       │  Digite seu Nome                   | | |");
        System.out.println("| | |  └───────┘                                    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");  
        
        String nomeTitular = scanner.nextLine();
        
        System.out.println("\n\n");
        
        int tipoConta;
        
        do {
        System.out.println("\n");    
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |    ===========   Criar Conta   ===========    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  "+nomeTitular+"                                   ");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  ┌───────┐                                    | | |");
        System.out.println("| | |  │   01  │  Conta Corrente                    | | |");
        System.out.println("| | |  └───────┘                                    | | |");
        System.out.println("| | |  ┌───────┐                                    | | |");
        System.out.println("| | |  │   02  │  Conta Pupança                     | | |");
        System.out.println("| | |  └───────┘                                    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");  
        
            tipoConta = scanner.nextInt();
            
            if (tipoConta != 1 && tipoConta != 2) {
                
         
            
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |   =============   ERRO MENU  =============    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  "+nomeTitular+"                                   ");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |        Opcao invalida! Digite 1 ou 2.         | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");
                try{
                    Thread.sleep(3000);   

                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            
            }
        } while (tipoConta != 1 && tipoConta != 2);
        
        
        
        
        int min = 1000;
        int max = 4000;
        int numeroSorteado = (int) (Math.random() * (max - min + 1) + min);
        numeroConta = numeroSorteado;
        
        int minPIN = 9000;
        int maxPIN = 9999;
        int PIN = (int) (Math.random() * (max - min + 1) + min);
        
        //TELA PRINCIPAL 
        
        System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |   ===========    SEU   P I N   ===========    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  "+nomeTitular+"                                   ");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |               SEU PIN É  "+PIN+"                   ");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]   Opcao invalida! Digite 1 ou 2.           [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+"); 
        System.out.println("\n");
            try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        
        
        
        int opcaoMenuP;
        
        
        do {
        System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  ===========  Menu Principal  ===========     | | |");
        System.out.println("| | |  "+nomeTitular+"                                   ");
        System.out.println("| | |  "+numeroConta+"                                         | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Saldo atual: R$ "+saldo+"                         ");
        System.out.println("| | |  ┌───────┐                                    | | |");
        System.out.println("| | |  │   01  │  Depositar                         | | |");
        System.out.println("| | |  └───────┘                                    | | |");
        System.out.println("| | |  ┌───────┐                                    | | |");
        System.out.println("| | |  │   02  │  Sacar                             | | |");
        System.out.println("| | |  └───────┘                                    | | |");
        System.out.println("| | |  ┌───────┐                                    | | |");
        System.out.println("| | |  │   03  │  Ver Extrato                       | | |");
        System.out.println("| | |  └───────┘                                    | | |");
        System.out.println("| | |  ┌───────┐                                    | | |");
        System.out.println("| | |  │   04  │  Simular Rendimento Mensal         | | |");
        System.out.println("| | |  └───────┘                                    | | |");
        System.out.println("| | |  ┌───────┐                                    | | |");
        System.out.println("| | |  │   05  │  Sair                              | | |");
        System.out.println("| | |  └───────┘                                    | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");  
        System.out.println("\n");
        
        opcaoMenuP = scanner.nextInt();
            
            switch (opcaoMenuP){
            
            case 1:
                System.out.print("Valor do deposito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    
                    
                    if (valorDeposito > 0) {
                        saldo = saldo + valorDeposito;
                        System.out.print("Deposito de R$ "+ valorDeposito+ " realizado. "
                                        + "Novo saldo: R$ "+saldo);
                        
                    } else {
                        
                        System.out.println("Valor invalido. \nO deposito deve ser maior que zero.");
                    }
                    try{
            Thread.sleep(4000);
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
            break;
            
            case 2:
                System.out.print("Valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    
                    
                    if (valorSaque <= 0) {
                        System.out.println("Valor invalido.");
                    } else {
                        if (valorSaque > saldo) {
                            System.out.println("Saldo insuficiente!");
                        } else {
                            
                            saldo = saldo - valorSaque;
                            System.out.printf("Saque de R$ "+valorSaque+" realizado. Novo saldo: R$ "+saldo);
                        }
                    }
            break;
            
            case 3:
               // System.out.println("\n Extrato ");
                 //   System.out.println("Titular: " + nomeTitular);
                   // System.out.println("Numero da conta: " + numeroConta);
                   // System.out.println("Tipo de conta: " + tipoConta);
                   // System.out.printf("Saldo atual: R$ "+ saldo);
                    
                    if (tipoConta == 1) {
                       // System.out.println("Taxa de manutencao mensal: R$ 12,50");
            System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  ==============     EXTRATO    =============  | | |");
        System.out.println("| | |  TITULAR: "+nomeTitular+".                                    ");
        System.out.println("| | |                                               | | |");   
        System.out.println("| | |  Número da conta: "+numeroConta+".                       | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Tipo da Conta: "+tipoConta+".                            | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  SALDO ATUAL: "+saldo+".                                      ");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  TAXA De MANUtanÇÃO: R$ 12,50                 | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");                    
                try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
           
           
                    } else {
                        //System.out.println("Rendimento mensal: 0,5% ao mes");
            System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  ==============     EXTRATO    =============  | | |");
        System.out.println("| | |  TITULAR: "+nomeTitular+".                                    ");
        System.out.println("| | |                                               | | |");   
        System.out.println("| | |  Número da conta: "+numeroConta+".                       | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Tipo da Conta: "+tipoConta+".                            | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  SALDO ATUAL: "+saldo+".                      | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Rendimento mensal: 0,5% ao mês.              | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");                    
                try{
                Thread.sleep(5000);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
                        
                    }
            break;
            
            case 4:
                //System.out.print("Quantos meses deseja simular? ");
                System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  ==============   SUMULAÇÃO    =============  | | |");
        System.out.println("| | |  TITULAR: "+nomeTitular+".                                    ");
        System.out.println("| | |                                               | | |");   
        System.out.println("| | |  Quqnatos meses deseja simular?               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+"); 
                    int meses = scanner.nextInt();
                    
                    if (meses <= 0) {
                        //System.out.println("Quantidade de meses invalida!");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |   =============   ERRO MENU  =============    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  "+nomeTitular+"                                   ");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |         Quantidade de meses invalido!         | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                Tente novamente                | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");
                try{
                    Thread.sleep(3000);   

                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                        
         } else {
                 //System.out.println("=== Simulação ===");
                        
                        double saldoSim = saldo; 
                        
                        
                        for (int i = 1; i <= meses; i++) {
                            if (tipoConta == 1) {
                                
                                saldoSim -= 12.50;
                            } else {
                                
                                saldoSim = saldoSim * 1.005;
                            }
                            System.out.printf("Mes "+i+": R$ "+saldoSim+"\n");
        System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  ==============   SUMULAÇÃO    =============  | | |");
        System.out.println("| | |  TITULAR: "+nomeTitular+".                                    ");
        System.out.println("| | |                                               | | |");   
        System.out.printf("| | |  Mes %d: R$ %.2f %n", i, saldoSim);
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+"); 
                try{
                    Thread.sleep(5000);   

                } catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }            
                        }
                    }
            break;
            
            case 5:
                
                    //System.out.println("\nObrigado por usar o Java Bank\n" +nomeTitular + "!");
                    //System.out.println("\nEncerrando o sistema...");
         System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                   JAVA BANK                   | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  ===========  Menu Principal  ===========     | | |");
        System.out.println("| | |  "+nomeTitular+"                                   ");
        System.out.println("| | |  "+numeroConta+"                                         | | |");    
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |     +++ Obrigado por usar o Java Bank +++     | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |  Opcao: _                                     | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");                    
                try{
                Thread.sleep(3000);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
                System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |   ===========    JAVA  BANK    ===========    | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |         ENCERRANDO ACESSO DO SISTEMA          | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |                                               | | |");
        System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
        System.out.println("|  ---------------------------------------------------  |");
        System.out.println("|  [ ]                                            [ ]   |");
        System.out.println("|  [ ]   Opcao invalida! Digite 1 ou 2.           [ ]   |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|   |  7   8   9                                  |     |");
        System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
        System.out.println("|   |  1   2   3                [LIMPA]           |     |");
        System.out.println("|   |      0   .                        [CANCEL]  |     |");
        System.out.println("|   +---------------------------------------------+     |");
        System.out.println("|                                                       |");
        System.out.println("|      [=========================]                      |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+"); 
        System.out.println("\n");
            
            break;
            
            
            default:
                    
                        //System.out.println("Opcao invalida! Escolha entre 1 e 5.");
                System.out.println("+-------------------------------------------------------+");
                System.out.println("|  ---------------------------------------------------  |");
                System.out.println("| |  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                   JAVA BANK                   | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |   ===========     ERRO MENU    ===========    | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |  "+nomeTitular+"                                   ");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |      Opcao invalida! Digite Entre 1 e 5.      | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |                                               | | |");
                System.out.println("| | |  Opcao: _                                     | | |");
                System.out.println("| | |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| | |");
                System.out.println("|  ---------------------------------------------------  |");
                System.out.println("|  [ ]                                            [ ]   |");
                System.out.println("|  [ ]                                            [ ]   |");
                System.out.println("|   +---------------------------------------------+     |");
                System.out.println("|   |  7   8   9                                  |     |");
                System.out.println("|   |  4   5   6        [ENTRA]                   |     |");
                System.out.println("|   |  1   2   3                [LIMPA]           |     |");
                System.out.println("|   |      0   .                        [CANCEL]  |     |");
                System.out.println("|   +---------------------------------------------+     |");
                System.out.println("|                                                       |");
                System.out.println("|      [=========================]                      |");
                System.out.println("|                                                       |");
                System.out.println("+-------------------------------------------------------+");
                        try{
                            Thread.sleep(3000);   

                        } catch(InterruptedException e){
                            Thread.currentThread().interrupt();
                        }    
                break;
            
            }
        
        
        } while (opcaoMenuP != 5);
    
        
        
    }
}
