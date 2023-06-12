package Faccat;
import java.util.Scanner;

public class Ex19{
	public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("Digite um numero");
	int numero1= sc.nextInt();
	System.out.println("Digite outro numero");
	int numero2= sc.nextInt();
	if (numero1>numero2) {
		System.out.println("O " + numero1 + " é o maior valor");	
	}
	else {
		System.out.println("O " + numero2 + " é o maior valor");
	}
	sc.close();
}
}