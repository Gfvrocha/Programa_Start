package br.com.maven_build;

import java.util.Scanner;

public class At05 {

    public static void main (String[] args)
    {
        /*
         * Escreva um algoritmo para determinar o consumo médio de um automóvel 
         * sendo fornecida a distância total percorrida pelo automóvel e o total 
         * de combustível gasto;
         */

        Scanner leitorScanner = new Scanner(System.in);

        float distancia, combustivel, consumoMedio;

        System.out.println("Qual a distância percorrida?");
        distancia = leitorScanner.nextFloat();

        System.out.println("Quantos litros de combustível foram consumidos?");
        combustivel = leitorScanner.nextFloat();

        consumoMedio = distancia / combustivel;

        System.out.println("Seu carro rodou " + distancia + "Km");
        System.out.println("Seu carro gastou " + combustivel + " litros de combustível");
        System.out.println("A média de consumo de seu carro foi de " + consumoMedio + "Km/L");

    }
    
}
