/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unimater.aed2026.exercicios;

import java.util.Scanner;

/**
 *
 * @author helmuthkuhl
 */
public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual mës vocë nasceu?");
        int MesSigno = scanner.nextInt();
        
        switch (MesSigno){
                
                case 1:
                    System.out.println("Você nasceu no mês "+MesSigno+", Janiero, então seu signo é Capricórnio se nasceu até dia 20, se for dia 21 ou mais, é Aquario.");
                    break;
                case 2:
                    System.out.println("Você nasceu no mês "+MesSigno+", Fevereiro então seu signo é Aquario se nasceu até dia 20, se for dia 21 ou mais, é Peixe.");
                    break;
                case 3:
                    System.out.println("Você nasceu no mês "+MesSigno+", Março, então seu signo é Peixes se nasceu até dia 20, se for dia 21 ou mais, é Áries.");
                    break;
                case 4:
                    System.out.println("Você nasceu no mês "+MesSigno+", Abril, então seu signo é Áries se nasceu até dia 20, se for dia 21 ou mais, é Touro.");
                    break;
                case 5:
                    System.out.println("Você nasceu no mês "+MesSigno+", Maio, então seu signo é Touro se nasceu até dia 20, se for dia 21 ou mais, é Gêmeos.");
                    break;    
                case 6:
                    System.out.println("Você nasceu no mês "+MesSigno+", Junho, então seu signo é Gêmeos se nasceu até dia 20, se for dia 21 ou mais, é Câncer.");
                    break;
                case 7:
                    System.out.println("Você nasceu no mês "+MesSigno+", Julho, então seu signo é Câncer se nasceu até dia 20, se for dia 21 ou mais, é Leão.");
                    break;
                case 8:
                    System.out.println("Você nasceu no mês "+MesSigno+", Agosto, então seu signo é Leão se nasceu até dia 20, se for dia 21 ou mais, é Virgem.");
                    break;
                case 9:
                    System.out.println("Você nasceu no mês "+MesSigno+", Setembro, então seu signo é Virgem se nasceu até dia 20, se for dia 21 ou mais, é Libra.");
                    break;
                case 10:
                    System.out.println("Você nasceu no mês "+MesSigno+", Outrubro, então seu signo é Libra se nasceu até dia 20, se for dia 21 ou mais, é Escorpião.");
                    break;
                case 11:
                    System.out.println("Você nasceu no mês "+MesSigno+", Novembro, então seu signo é Escorpião se nasceu até dia 20, se for dia 21 ou mais, é Sagitário.");
                    break;
                case 12:
                    System.out.println("Você nasceu no mês "+MesSigno+", Dezembro, então seu signo é Sagitário se nasceu até dia 20, se for dia 21 ou mais, é Capricôrnio.");
                    break;
                        
            default:
                System.out.println("Esse mês "+MesSigno+" não existe, você é desse planeta?");
        
            }
    
}

}
