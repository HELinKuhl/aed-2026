/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios.listaexercicios07;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio06 {
   
    
public static void main(String[] args) {
        boolean[] agenda = {true, false, true, true, false, true};

        int ocupados = contarOcupados(agenda, 0);
        int livres = contarLivres(agenda, 0);
        boolean temDisponivel = existeHorarioLivre(agenda, 0);

        System.out.println("Horários ocupados: " + ocupados);
        System.out.println("Horários livres: " + livres);
        System.out.println(temDisponivel ? "Ainda existem horários disponíveis." : "Não há horários disponíveis.");
        System.out.println("Situação: " + gerarMensagemSituacao(ocupados, livres));
    }

    public static int contarOcupados(boolean[] agenda, int i) {
        if (i == agenda.length) return 0;
        int valor = (agenda[i] == true) ? 1 : 0;
        return valor + contarOcupados(agenda, i + 1);
    }

    public static int contarLivres(boolean[] agenda, int i) {
        if (i == agenda.length) return 0;
        int valor = (agenda[i] == false) ? 1 : 0;
        return valor + contarLivres(agenda, i + 1);
    }

    public static boolean existeHorarioLivre(boolean[] agenda, int i) {
        if (i == agenda.length) return false;
        if (agenda[i] == false) return true; // Achou! Curto-circuito
        return existeHorarioLivre(agenda, i + 1);
    }

    public static String gerarMensagemSituacao(int ocupados, int livres) {
        if (livres == 0) return "agenda lotada.";
        if (ocupados == 0) return "agenda vazia.";
        return "agenda parcialmente ocupada.";
    }
}