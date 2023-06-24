import java.util.Scanner;
import java.text.DecimalFormat;

public class At13 {

    public static void main (String[] args)
    {
        /*
         * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. 
         * Sabe-se que o preço de custo receberá um acréscimo de acordo com 
         * um percentual informado pelo usuário;
         */

        Scanner leitorScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double precoCusto, acrescimo, valorVenda;

        System.out.println("Digite o preço de custo");
        precoCusto = leitorScanner.nextDouble();

        System.out.println("Qual a (%) porcentagem que deseja acréscentar?");
        acrescimo = leitorScanner.nextDouble();

        valorVenda = precoCusto * acrescimo / 100;
        System.out.println("Valor do acréscimo R$ " +df.format(valorVenda));

        valorVenda = precoCusto + valorVenda;
        System.out.println("Valor total para venda R$ "+df.format(valorVenda));

    }
    
}
