import java.util.Scanner;
import java.text.DecimalFormat;

public class At12 {

    public static void main (String[] args)
    {
        /*
         * A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. 
         * Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
         * 
         */
        Scanner leitorScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String produto;
        double valorProduto, parcelamento;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\tMAMÃO COM AÇUCAR");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Qual produto deseja comprar?");
        produto = leitorScanner.nextLine();
        System.out.println("Quanto custa o produto: " + produto);
        valorProduto = leitorScanner.nextDouble();

        parcelamento = valorProduto / 5;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\tORÇAMENTO");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Produto: "+produto);
        System.out.println("Valor: R$"+df.format(valorProduto));
        System.out.println("Parcelamento em 5x iguais de R$"+df.format(parcelamento));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
    
}
