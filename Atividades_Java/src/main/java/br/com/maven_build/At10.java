import java.util.Scanner;
import java.text.DecimalFormat;

public class At10 
{

    public static void main(String[] args)
    {
        /*
         * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) 
         * de um valor lido em dólar (US$). 
         * O algoritmo deverá solicitar o valor da cotação do dólar 
         * e também aquantidade de dólares disponíveis com o usuário;
         */

        Scanner leitorScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double dolarParaReal, dolar, real;

        System.out.println("Digite a cotação do Dólar de hoje:");
        dolar = leitorScanner.nextDouble();

        System.out.println("Quantos dolares(US$) você quer converter em reais(R$):");
        dolarParaReal = leitorScanner.nextDouble();

        real = dolar * dolarParaReal;
        
        System.out.println("Após a conversão de US$" + df.format(dolarParaReal) + " para reais, você terá a quantia de R$" + df.format(real));

    }
    
}
