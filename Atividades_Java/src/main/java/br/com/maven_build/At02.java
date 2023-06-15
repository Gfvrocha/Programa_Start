package br.com.maven_build;

import java.util.Scanner;

public class At02 
{


    public static void main( String[] args )
    {
        Scanner leitorScanner = new Scanner(System.in);

        String nomeProduto;
        float precoCompra = 0.0f;
        float precoVenda = 0.0f;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
       
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Digite o nome do produto");
            nomeProduto = leitorScanner.next();

            System.out.println("Digite o preço de custo do produto");
            precoCompra = leitorScanner.nextFloat();

            System.out.println("Digite o preço de venda do produto");
            precoVenda = leitorScanner.nextFloat();

            totalCusto = totalCusto + precoCompra;
            totalVenda = totalVenda + precoVenda;

            if(precoCompra == precoVenda) {
                System.out.println("Houve um empate entre os preços de compra e venda.");
            } else {
                if(precoCompra > precoVenda) {
                    System.out.println("Prejuizo");
                } else {
                    System.out.println("Lucro");

                }
            }

            System.out.println(nomeProduto + ", preço de compra = " + precoCompra + ", preço de venda = " + precoVenda);
                
        }

        System.out.println("A média do preço de custo é de: " + (precoCompra / i));
        System.out.println("A média do preço de venda é de: " + (precoVenda / i));
 
    }


    
}


