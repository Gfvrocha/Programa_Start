import java.util.Scanner;

public class At15 {

    public static void main (String[] args)
    {
        /*
         * Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
         * 
         */

        Scanner leitorScanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = leitorScanner.nextInt();
        if (numero == 10) {
            System.out.println("Número igual a 10");
        } else {
            if(numero > 10) {
                System.out.println("Número maior que 10");
                
        } else {
            System.out.println("Número menor que 10");
        }

        }
    }
}
