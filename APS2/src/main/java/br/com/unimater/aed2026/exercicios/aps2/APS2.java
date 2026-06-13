/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.aps2;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class APS2 {

    static final int FILEIRAS = 5;
    static final int COLUNAS = 6;
    static final char[] LETRAS_FILEIRAS = {'A', 'B', 'C', 'D', 'E'};
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        char[][] sala = inicializarSala();
        int opcao;
 
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
 
            switch (opcao) {
                case 1: exibirMapa(sala); 
                    break;
                    
                case 2: reservarAssento(sala, scanner); 
                    break;
                    
                case 3: consultarAssento(sala, scanner); 
                    break;
                    
                case 4: gerarRelatorio(sala); 
                    break;
                    
                case 5: contarRecursivo(sala); 
                    break;
                    
                case 6: cancelarReserva(sala, scanner); 
                    break;
                    
                case 7: System.out.println("\nSistema encerrado. Ate logo!"); 
                    break;
                    
                default: System.out.println("\nOpcao invalida! Tente novamente.");
            }
 
        } while (opcao != 7);
 
        scanner.close();
    }
 
    static char[][] inicializarSala() {
        char[][] sala = new char[FILEIRAS][COLUNAS];
        for (int i = 0; i < FILEIRAS; i++)
            for (int j = 0; j < COLUNAS; j++)
                sala[i][j] = 'L';
        
        return sala;
    }
 
    static void exibirMenu() {
        
        System.out.println("\n=== SISTEMA DE RESERVA DE ASSENTOS ===");
        System.out.println("1. Exibir mapa de assentos");
        System.out.println("2. Reservar assento");
        System.out.println("3. Consultar assento");
        System.out.println("4. Gerar relatorio");
        System.out.println("5. Contar assentos reservados com recursividade");
        System.out.println("6. Cancelar reserva");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opcao: ");
    }
 
    static void exibirMapa(char[][] sala) {
        
        System.out.println("\n=== MAPA DE ASSENTOS ===\n");
        System.out.println("L = Livre || R = Reservado\n");
 
        System.out.print("    ");
        for (int j = 1; j <= COLUNAS; j++)
            System.out.print(" " + j + "  ");
        System.out.println();
 
        for (int i = 0; i < FILEIRAS; i++) {
            System.out.print(" " + LETRAS_FILEIRAS[i] + "  ");
            for (int j = 0; j < COLUNAS; j++)
                System.out.print("|" + sala[i][j] + "| ");
            System.out.println();
        }
    }
 
    static int converterFileira(char letra) {
        
        letra = Character.toUpperCase(letra);
        for (int i = 0; i < LETRAS_FILEIRAS.length; i++)
            if (LETRAS_FILEIRAS[i] == letra)
                return i;
        
        return -1;
    }
 
    static boolean validarColuna(int coluna) {
        
        return coluna >= 1 && coluna <= COLUNAS;
        
    }
 
    static void reservarAssento(char[][] sala, Scanner scanner) {
        
        System.out.println("\n=== RESERVAR ASSENTO ===");
        System.out.print(" Digite a fileira desejada (A a E): ");
        
        char letraFileira = scanner.nextLine().charAt(0);
        System.out.print(" Digite a coluna desejada (1 a 6): ");
        int coluna = scanner.nextInt();
        scanner.nextLine();
 
        int indiceFileira = converterFileira(letraFileira);
 
        if (indiceFileira == -1) {
            System.out.println(" Fileira invalida! Informe uma letra de A a E.");
            return;
        }
        if (!validarColuna(coluna)) {
            System.out.println(" Coluna invalida! Informe um numero de 1 a 6.");
            return;
        }
 
        int indiceColuna = coluna - 1;
 
        if (sala[indiceFileira][indiceColuna] == 'R') {
            System.out.println(" Este assento ja esta reservado!");
            return;
            
        }
 
        sala[indiceFileira][indiceColuna] = 'R';
        System.out.println(" Assento reservado com sucesso.");
        System.out.println(" Assento: Fileira " + Character.toUpperCase(letraFileira) + ", Coluna " + coluna);
    
    }
 
    static void cancelarReserva(char[][] sala, Scanner scanner) {
        System.out.println("\n=== CANCELAR RESERVA ===");
        exibirMapa(sala);
 
        System.out.print("\n Digite a fileira do assento (A a E): ");
        char letraFileira = scanner.nextLine().charAt(0);
        System.out.print(" Digite a coluna do assento (1 a 6): ");
        int coluna = scanner.nextInt();
        scanner.nextLine();
 
        int indiceFileira = converterFileira(letraFileira);
 
        if (indiceFileira == -1) {
            System.out.println(" Fileira invalida! Voltando ao menu.");
            return;
        }
        if (!validarColuna(coluna)) {
            System.out.println(" Coluna invalida! Voltando ao menu.");
            return;
        }
 
        int indiceColuna = coluna - 1;
 
        if (sala[indiceFileira][indiceColuna] == 'L') {
            System.out.println(" Este assento ja esta livre, nao ha reserva para cancelar! Voltando ao menu.");
            return;
        }
 
        sala[indiceFileira][indiceColuna] = 'L';
        System.out.println(" Reserva cancelada com sucesso.");
        System.out.println(" Assento: Fileira " + Character.toUpperCase(letraFileira) + ", Coluna " + coluna);
    
    }
 
    static void consultarAssento(char[][] sala, Scanner scanner) {
        
        System.out.println("\n=== CONSULTAR ASSENTO ===");
        System.out.print("Digite a fileira desejada (A a E): ");
        char letraFileira = scanner.nextLine().charAt(0);
        
        System.out.print("Digite a coluna desejada (1 a 6): ");
        int coluna = scanner.nextInt();
        scanner.nextLine();
 
        int indiceFileira = converterFileira(letraFileira);
 
        if (indiceFileira == -1) {
            System.out.println("Fileira invalida! Informe uma letra de A a E.");
            return;
        }
        if (!validarColuna(coluna)) {
            System.out.println("Coluna invalida! Informe um numero de 1 a 6.");
            return;
        }
 
        if (sala[indiceFileira][coluna - 1] == 'L')
            System.out.println("O assento esta livre.");
        else
            System.out.println("O assento esta reservado.");
    }
 
    static int contarReservados(char[][] sala) {
        
        int total = 0;
        for (int i = 0; i < FILEIRAS; i++)
            for (int j = 0; j < COLUNAS; j++)
                if (sala[i][j] == 'R') total++;
        return total;
    
    }
 
    static double calcularPercentual(int reservados, int totalAssentos) {
        return (double) reservados / totalAssentos * 100;
        
    }
 
    static void gerarRelatorio(char[][] sala) {
        
        int totalAssentos = FILEIRAS * COLUNAS;
        int reservados = contarReservados(sala);
        int livres = totalAssentos - reservados;
        double percentual = calcularPercentual(reservados, totalAssentos);
 
        System.out.println("\n=== RELATORIO GERAL ===");
        System.out.println("Total de assentos: " + totalAssentos);
        System.out.println("Assentos reservados: " + reservados);
        System.out.println("Assentos livres: " + livres);
        System.out.printf("Percentual de ocupacao: %.2f%%\n", percentual);
        
    }
 
    static int contarRecursivoAux(char[][] sala, int i, int j) {
        
        if (i >= FILEIRAS) return 0;
        if (j >= COLUNAS) return contarRecursivoAux(sala, i + 1, 0);
        int soma = (sala[i][j] == 'R') ? 1 : 0;
        return soma + contarRecursivoAux(sala, i, j + 1);
    
    }
 
    static void contarRecursivo(char[][] sala) {
        int total = contarRecursivoAux(sala, 0, 0);
        System.out.println("\n=== CONTAGEM RECURSIVA ===");
        System.out.println("Assentos reservados (recursividade): " + total);
        
    }
}
