package br.com.maven_build;

import java.util.Scanner;

public class At03 {

    public static void main( String[] args )
    {

    //Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

    Scanner leitorScanner = new Scanner(System.in);

    int n1, n2, soma;

    System.out.println("Digite o primeiro número:");
    n1 = leitorScanner.nextInt();

    System.out.println("Digite o segundo número:");
    n2 = leitorScanner.nextInt();

    soma = n1 + n2;    
    System.out.println("A soma entre " + n1 + "+" + n2 + " = " + soma);

    }

    

    
}
