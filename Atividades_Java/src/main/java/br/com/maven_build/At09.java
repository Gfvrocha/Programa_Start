import java.util.Scanner;

public class At09 {

    public static void main (String[] args)
    {
        /*
         * Leia uma temperatura em graus Celsius e apresentá-la 
         * convertida em graus Fahrenheit. 
         * A fórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C 
         * a temperatura em Celsius;
         */

         Scanner leitorScanner = new Scanner(System.in);

         int f, c;

         System.out.println("Temperatura em graus Celsius:");
         c = leitorScanner.nextInt();

         f = (9 * c + 160) / 5;

         System.out.println("A temperatura " + c +"ºC em graus celsius \nconvertida para fahrenheit é de: " + f +"ºF");

    }
    
}
