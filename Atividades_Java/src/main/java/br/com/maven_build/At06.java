package br.com.maven_build;

import java.util.Scanner;
import java.text.DecimalFormat;

public class At06 {

    public static void main (String[] args)
    {
        /*
         * Escreva um algoritmo que leia o nome de um vendedor, 
         * o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
         * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
         * informar o seu nome, o salário fixo e salário no final do mês;
         */

         Scanner leitorScanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");
         df.format(1234.36);

         String nome;
         float salarioFixo, vendasMes, valorComissao, salarioTotal;

         System.out.println("Qual o nome do vendedor:");
         nome = leitorScanner.nextLine();

         System.out.println("Qual o salário de " + nome);
         salarioFixo = leitorScanner.nextFloat();

         System.out.println("Quanto " + nome + " vendeu nesse mês?");
         vendasMes = leitorScanner.nextFloat();

         valorComissao = vendasMes * 15 / 100;
         salarioTotal = salarioFixo + valorComissao;

         System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
         System.out.println("Vendedor: " + nome + "\nSalário Fixo: R$ " + df.format(salarioFixo) + "\nTotal de Vendas: R$ " 
         + df.format(vendasMes) + "\nComissão: R$ " + df.format(valorComissao) + "\nSálario Total: R$ " + df.format(salarioTotal) );
         System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}