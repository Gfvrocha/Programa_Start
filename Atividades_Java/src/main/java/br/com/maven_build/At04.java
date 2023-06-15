package br.com.maven_build;

import java.util.Scanner;

public class At04 {

    public static void main (String[] args)
    {
        /*
        Faça um algoritmo que receba dois números e ao final mostre a soma, subtração,
        multiplicação e a divisão dos dois números lidos;        
        */

        Scanner leitorScanner = new Scanner(System.in);

        int n1, n2, soma, sub, mult, div;

        System.out.println("Digite o primeiro número:");
        n1 = leitorScanner.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = leitorScanner.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div =  n1 / n2;

        System.out.println("A soma entre " + n1 + " + " + n2 + " = " + soma );
        System.out.println("A subtração entre " + n1 + " - " + n2 + " = " + sub );
        System.out.println("A multiplicação entre " + n1 + " x " + n2 + " = " + mult );
        System.out.println("A divisão entre " + n1 + " / " + n2 + " = " + div );
    }
    
}
