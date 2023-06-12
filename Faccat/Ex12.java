package Faccat;
import java.util.Scanner;

public class Ex12 {
   public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Insira os graus em  Fahrenheit: ");
	   float fahrenheit = sc.nextFloat();
	   float celsius = ((fahrenheit - 32)*5)/9;
	   System.out.println("O valor em Celsius é de: " + celsius);
	   sc.close();
   }
}
