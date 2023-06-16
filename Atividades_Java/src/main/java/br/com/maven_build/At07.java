package br.com.maven_build;

import java.util.Scanner;
import java.text.DecimalFormat;

public class At07 {

    public static void main (String[] args)
    {

        /*
         * Escreva um algoritmo que leia o nome de um aluno e as notas 
         * das três provas que ele obteve no semestre.
         * No final informar o nome do aluno 
         * e a sua média (aritmética);
         */

        Scanner leitorScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        

        String nomeAluno;
        double nota1, nota2, nota3, media;

        System.out.println("Nome do aluno:");
        nomeAluno = leitorScanner.nextLine();

        System.out.println("Nota da primeira prova");
        nota1 = leitorScanner.nextDouble();

        System.out.println("Nota da segunda prova");
        nota2 = leitorScanner.nextDouble();

        System.out.println("Nota da terceira prova");
        nota3 = leitorScanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Médio final de " + nomeAluno + ": " + df.format(media));









    }

}    