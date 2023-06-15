package br.com.maven_build;

import java.util.Scanner;

public class At01 
{
    /*
     * Faça um algoritimo que leia um número digitado pelo usuario e 
     * diga se é maior, menor ou igual a 0(zero).
     */
    
    public static void main( String[] args )
    {
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.println("Digite um número");
            int numero = leitorScanner.nextInt();
            
            if(numero == 0) {
                System.out.println("O número é zero");
            } else {
                if(numero > 0) {
                    System.out.println("O número é maior que zero");
                } else {
                    System.out.println("O número é menor que zero");
                }
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = leitorScanner.next().charAt(0);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
        
    }
}
