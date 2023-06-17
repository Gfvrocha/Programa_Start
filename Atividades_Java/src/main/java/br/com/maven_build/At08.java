import java.util.Scanner;

public class At08 {

    public static void main (String[] args)
    {
        /*
         * Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a 
         * variável A passe a possuir o valor da variável B 
         * e a variável B passe a possuir o valor da variável A.
         * Apresentar osvalores trocados;
         */

         Scanner leitorScanner = new Scanner(System.in);

         int a, b, c, d;

         System.out.println("Digite um valor para A: ");
         a = leitorScanner.nextInt();
         System.out.println("Digite um valor para B: ");
         b = leitorScanner.nextInt();

         c = b;
         d = a;

         System.out.println("Valor de A = " +c+ "\nValor de B = " +d);

    }
    
}
