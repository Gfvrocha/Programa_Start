import java.util.Scanner;
import java.text.DecimalFormat;

public class At11 {

    public static void main (String[] args)
    {
        /*
         * Faça um algoritmo que receba um valor que foi depositado e exiba o valor 
         * com rendimento após um mês.
         * Considere fixo o juro da poupança em 0,07% a. m;
         */
        Scanner leitorScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valor, juros = 0.07, valorTotal;

        System.out.println("Qual valor deseja aplicar na poupança?");
        valor = leitorScanner.nextDouble();

        juros = valor * juros / 100;
        valorTotal = valor + juros;

        System.out.println("Rendimento ao mês de 0,07%: R$" + df.format(juros));
        System.out.println("Valor total na poupança: R$" + df.format(valorTotal));

    }
    
}
