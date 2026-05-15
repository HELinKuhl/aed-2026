/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.unimater.aed2026.exercicios.listaexercicios01;


import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
* 
* 
 * @author helmuthkuhl
 */
public class ListaExercicios01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        DecimalFormat df = new DecimalFormat ("#.00");
        
    /*Exercício 1  - Perímetro do Retângulo
    Descrição: Declare variáveis fixas para base e altura de um retângulo e calcule o perímetro.
    Fórmula: Perimetro=2×(base+altura).
    Dica: Use o tipo double para permitir valores decimais.
    */
        
        System.out.println("-> Bem vindo a Lista de Exercícios 01 <-");
        
        System.out.println("Digite o valor da base:");
        double valorBase = scanner.nextDouble();
        
        System.out.println("Digite o valor da altura:");
        double valorAltura = scanner.nextDouble();
        
        double valorPerimetro = 0;
        valorPerimetro = 2*(valorBase+valorAltura);
        
        System.out.println("O Perimetro é "+valorPerimetro);
        
        
    /*Exercício 2  - Conversor de Moeda
    Descrição: Leia um valor em Reais (R$) e a cotação do Euro. Exiba o valor convertido para Euros.
    Dica: Utilize scanner.nextDouble() para ler os valores.
    */
    
        System.out.println("\n \n-> Exercícios 02 <-");
        
        System.out.println("Digite em Real R$:");
        double valorReal = scanner.nextDouble();
        
        System.out.println("Digite a cotação do Euro €$:");
        double valorEuro = scanner.nextDouble();
        
        
        double valorConvertido = valorReal / valorEuro;
        
        System.out.println("Na conversção você tem "+df.format(+valorConvertido));
        
        /*Exercício 3  - Média Aritmética
Descrição: Leia 4 notas bimestrais de um aluno e exiba a média aritmética simples.
Dica: Lembre-se da precedência: a soma das notas deve estar entre parênteses antes da divisão.
        */
        
          System.out.println("\n \n-> Exercícios 03 <-");
        
        System.out.println("Digite a nota do primeiro bimestre");
        double notaPrimeiroB = scanner.nextDouble();
        
        
        System.out.println("Digite a nota do segundo bimestre");
        double notaSegundoB = scanner.nextDouble();
        
        System.out.println("Digite a nota do terceiro bimestre");
        double notaTerceiroB = scanner.nextDouble();
        
        System.out.println("Digite a nota do quarto bimestre");
        double notaQuartoB = scanner.nextDouble();
        
        double notaFinal = (notaPrimeiroB + notaSegundoB + notaTerceiroB + notaQuartoB) / 4;
        
        System.out.println("A nota final é "+df.format (notaFinal));
        
        /*  
        Exercício 4  - Troca de Variáveis
Descrição: Declare duas variáveis A e B com valores fixos. Troque os valores entre elas utilizando uma variável auxiliar.
Dica: A lógica é usar  uma terceira variável para receber o valor, temporariamente.
        */ 
                
        System.out.println("\n \n-> Exercícios 04 <-");
        
        int A = 10;
        int B = 20;
        
        System.out.println("valores definidos são:");
        System.out.println("Valor A = "+A);
        System.out.println("Valor B = "+B);
        
        int TempC;
        
        TempC = A;
        A = B;
        B = TempC;
        
        System.out.println("\n Valores inversos são:");
        System.out.println("Valor A = "+A);
        System.out.println("Valor B = "+B);
        
        /*  
        Exercício 5  - Gasto de Viagem
Descrição: Leia a distância de uma viagem e o preço do combustível. Considere que o carro faz 12km por litro. Exiba o gasto total.
Dica: Primeiro calcule a quantidade de litros (Distância / 12).
        */
        
        System.out.println("\n \n-> Exercícios 05 <-");
        System.out.println("Digite qual é a distância da sua viabem em Km (ex: 170)");
        double distanciaViagem = scanner.nextDouble();
        
        System.out.println("Digite o valor do litro do combustivel (ex: 6,50)");
        double valorGas = scanner.nextDouble();
        
        double mediaCarro = 12;
        double gastoDist = distanciaViagem / mediaCarro;
        double gastoGas = gastoDist*valorGas;
        
        System.out.println("Seu carro vai gastar R$" +df.format(gastoGas));
        
        
        /* Exercício 6  - Dobro e Triplo
Descrição: Leia um número inteiro e exiba o seu dobro e o seu triplo no console.
        */
        
        
        System.out.println("\n \n-> Exercícios 06 <-");
        System.out.println("Insita um número:");
        
        int intEX6 = scanner.nextInt();
        
        int intDoro = intEX6 *2;
        int intTriplo = intEX6 *3;
        
        System.out.println("Seu número é: "+intEX6 +
                "\n Dobro dele é: "+intDoro +
                "\n Triplo dele é: "+intTriplo);
        
        
        /* 
        Exercício 7  - Sucessor e Antecessor
Descrição: Leia um número inteiro e apresente o seu antecessor (n-1) e o seu sucessor (n+1).
        */
        
        System.out.println("\n \n-> Exercícios 07 <-");
        System.out.println("Insita um número:");
        
        int nroEX7 = scanner.nextInt();
        
        int nroMenos = nroEX7 -1;
        int nroMais = nroEX7+1;
        
        System.out.println("Seu número é: "+nroEX7 +
                "\n Seu Antecessor é: "+nroMenos +
                "\n Seu sucessor é: "+nroMais);
        
        
        /* 
    Exercício 8  - Área de um Quadrado
Descrição: Leia o valor do lado de um quadrado e exiba sua área.
        */
        System.out.println("\n \n-> Exercícios 08 <-");
        System.out.println("Digite é o valor da lateral do quadrado:");
        
        double ladoQuadrado = scanner.nextDouble();
        
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A area do seu quadrado é de: "+areaQuadrado);
        
        
        /* 
        Exercício 9  - Conversor de Temperatura
Descrição: Leia uma temperatura em graus Celsius e converta para Fahrenheit.
Fórmula: F=(C×1.8)+32.
        */
        
        System.out.println("\n \n-> Exercícios 09 <-");
        System.out.println("Digite quanto é a temperatura:");
        
        double temperaturaC = scanner.nextDouble();
        double tempF = (temperaturaC * 1.8) +32;
        System.out.println("temperatura em Fahrenheit é " +tempF+"f");
        
        
        /* 
        Exercício 10  - Reajuste Salarial
Descrição: Leia o salário atual de um colaborador e aplique um aumento de 15%. Exiba o novo valor.
        */
        
        System.out.println("\n \n-> Exercícios 10 <-");
        System.out.println("Qual é o salário atual?:");
        double salarioAtual = scanner.nextDouble();
        
        double selarioNovo = salarioAtual * 1.15;
        
        System.out.println("Salario atual é: "+salarioAtual +
                "\nSalário com adicional de 15%: "+selarioNovo);
        
        
        /* 
        Exercício 11  - Idade em Dias
Descrição: Leia a idade de uma pessoa em anos e exiba o total aproximado de dias vividos (considere anos de 365 dias).
        */
        
        System.out.println("\n \n-> Exercícios 11 <-");
        System.out.println("Quantos anos você tem?");
        int idIdade = scanner.nextInt();
        int diasVividos = idIdade *365;
        
        System.out.println("Vocé já viveu "+diasVividos+ "dias.");
        
        
        /* 
        Exercício 12  - Perímetro do Círculo
Descrição: Leia o raio de um círculo e calcule o seu perímetro.
Fórmula: P=2×π×raio (Use π=3.14159).
        */
        
        System.out.println("\n \n-> Exercícios 12 <-");
        System.out.println("Informe o raio da circunferência:");
        double raioCircunferencia = scanner.nextDouble();
        
        double perimetroC = 2 * 3.14159 * raioCircunferencia;
        System.out.println("o raio é " + perimetroC);
        
        
        /* 
        Exercício 13  - Soma formatada
Descrição: Leia dois números inteiros e exiba uma frase completa: "A soma entre [A] e [B] resulta em [SOMA]".
        */
        
        System.out.println("\n \n-> Exercícios 13 <-");
        System.out.println("informe o primeiro número:");
        int nroA = scanner.nextInt();
        
        System.out.println("");
        int nroB = scanner.nextInt();
        
        int nroSoma = nroA + nroB;
        
        System.out.println("A soma entre "+nroA+ 
                " e " +nroB+ " resulta em "+nroSoma);
        
        
        
        /* 
        Exercício 14  - Desconto de Loja
Descrição: Leia o preço de um produto e aplique um desconto de 10%. Exiba o valor do desconto e o preço final.
        */
        
        System.out.println("\n \n-> Exercícios 14 <-");
        System.out.println("Qual o valor do produto?");
        double valorPreco = scanner.nextDouble();
        
        double valorDeconto = valorPreco * 0.90;
        
        System.out.println("O valor do produto com desconto aplicado é de: "+valorDeconto);
        
        
        
        /* 
        Exercício 15  - Divisão de Conta
Descrição: Leia o valor total de uma conta e em quantas pessoas será dividida. Exiba o valor individual.
        */
        
        System.out.println("\n \n-> Exercícios 15 <-");
        System.out.println("Qual o valor total da conta? Ex:52,55 ");
        double valorConta = scanner.nextDouble();
        
        System.out.println("será dividido em quantas pessoas? ");
        int nroPessoas = scanner.nextInt();
        
        double valorDivivido = valorConta / nroPessoas;
        
        System.out.println("A valor para cada pessoa pagar é de R$"+valorDivivido);
        
        
        
        /* 
        Exercício 16 - Consumo de Energia Elétrica
Descrição: Leia a potência de um aparelho (em Watts), as horas que ele fica ligado por dia e o preço do kWh. Calcule o custo mensal desse aparelho.
Fórmula: ConsumoMensal=(Potencia×Horas×30)/1000. Depois, multiplique o resultado pelo preço do kWh.
        */
        
        System.out.println("\n \n-> Exercícios 16 <-");
        System.out.println("Qual é a portência do aparelho? (Ex: 500)");
        int potenciaAparelho = scanner.nextInt();
        
        System.out.println("Quantas horas o aparelho fica ligado? (Ex: 10)");
        int horasAparelho = scanner.nextInt();
        
         System.out.println("qual preço do KWH? (Ex: 15,50)");
        double CustoEnergia = scanner.nextDouble();
        
        double consumoParelho = (potenciaAparelho * horasAparelho * 30)/1000;
        double custoMesAparelho = consumoParelho * CustoEnergia;
        
        System.out.println("Seu aparelho consome "+consumoParelho+ ", o que gera um custo de R$"+custoMesAparelho);
        
        
        
        
        /* 
        Exercício 17 - Cálculo de IMC
Descrição: Leia o peso (kg) e a altura (m) de uma pessoa e calcule o IMC.
Fórmula: IMC=Peso/Altura2.
        */
        
        
        System.out.println("\n \n-> Exercícios 17 <-");
        System.out.println("Informe o seu peso:");
        double pesoPessoa = scanner.nextDouble();
        
        System.out.println("Informe sua altura:");
        double alturaPessoa = scanner.nextDouble();
        
        double IMC = pesoPessoa / (alturaPessoa * alturaPessoa);
        
        System.out.println("Seu IMC é: " +IMC);
        
        
        
        /* 
        Exercício 18 - Conversor de Tempo
Descrição: Leia um valor total em segundos e converta para o formato: "X minutos e Y segundos".
Dica: Use os operadores / (divisão) e % (resto).
        */

        System.out.println("\n \n-> Exercícios 18 <-");
        System.out.println("");
        
        
        /* Exercício 19 - Volume de uma Esfera
Descrição: Leia o raio e calcule o volume de uma esfera.
Fórmula: V=(4.0/3.0)×π×raio3.
        */

        System.out.println("\n \n-> Exercícios 19 <-");
        System.out.println("");
        
        /* Exercício 20 - Área de um Trapézio
Descrição: Leia a base maior, a base menor e a altura de um trapézio e exiba a área.
Fórmula: A=2(B+b)×h​.
        */

        System.out.println("\n \n-> Exercícios20 <-");
        System.out.println("");
        
        
        /* 
        Exercício 21 - Lucro de Venda
Descrição: Leia preço de custo e % de lucro e exiba o preço final.
        */
        
        System.out.println("\n \n-> Exercícios 21 <-");
        System.out.println("");
        
        
        
        /* 
        Exercício 22 - Juros Simples
Descrição: Leia o Capital, a Taxa de Juros e o Tempo. Calcule o Montante Final.
Fórmula: M=C×(1+taxa×tempo).
        */
        
        System.out.println("\n \n-> Exercícios 22 <-");
        System.out.println("");
        
        
        
        /* Exercício 23 - Azulejos na Parede
Descrição: Leia a largura e altura de uma parede e a largura e altura de um azulejo. Calcule quantos azulejos cobrem a parede.
        */
        
        System.out.println("\n \n-> Exercícios 23 <-");
        System.out.println("");
        
        
        /* Exercício 24 - Média Ponderada
Descrição: Leia 3 notas. A primeira tem peso 2, a segunda peso 3 e a terceira peso 5. Calcule a média final.
        */
            
        System.out.println("\n \n-> Exercícios 24 <-");
        System.out.println("");
        
        
        
        /* Exercício 25 - Salário de Vendedor
Descrição: Um vendedor ganha R$ 1.200,00 fixos mais 4% de comissão sobre as vendas. Leia o valor vendido e exiba o salário total.
        */
        
        System.out.println("\n \n-> Exercícios 25 <-");
        System.out.println("");
        
        /* Exercício 26 - Conversor de Medidas (Polegadas)
Descrição: Leia um valor em centímetros e converta para polegadas.
        */
        System.out.println("\n \n-> Exercícios 26 <-");
        System.out.println("");
        
        
        
        /* Exercício 27 - Custo de Carro Novo
Descrição: O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor (28%) e dos impostos (45%). Leia o custo de fábrica e exiba o custo final.
        */
        System.out.println("\n \n-> Exercícios 27 <-");
        System.out.println("");
        
            
        /* Exercício 28 - Velocidade Média
Descrição: Leia a distância percorrida por um veículo (em km) e o tempo gasto (em horas). Exiba a velocidade média.
        */System.out.println("\n \n-> Exercícios 28 <-");
        System.out.println("");
        

        /* Exercício 29 - Salários Mínimos
Descrição: Leia o salário de um funcionário e o valor do salário mínimo atual. Exiba quantos salários mínimos esse funcionário ganha.
        */
        
        System.out.println("\n \n-> Exercícios 29 <-");
        System.out.println("");

        /* Exercício 30 - Regra de Três: Pontuação de Prova
Descrição: Uma prova vale 100 pontos no total. Um aluno tirou X pontos. Se a nota final do semestre vale 10 pontos, qual é a nota proporcional deste aluno?
Dica: Leia a pontuação do aluno (X) e descubra quanto ela vale na escala de 0 a 10.
        */
        System.out.println("\n \n-> Exercícios 30 <-");
        System.out.println("");
        
        
    }
}
