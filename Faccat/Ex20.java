
package Faccat;
import java.util.Scanner;

public class Ex20{
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero1= sc.nextInt();
	System.out.println("Digite outro numero: ");
	int numero2= sc.nextInt();
	
	if (numero1<numero2) {
		System.out.println("A ordem crescente dos números é: "+ numero1 + "; " + numero2);
	}
    else{
        System.out.println("A ordem crescente dos números é: "+ numero2 + "; " +numero1);
    }
}}