package Faccat;
import java.util.Scanner;

public class Ex06{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a base do retangulo");
		int numero01=sc.nextInt();
		System.out.println("Digite a altura");
		int numero02=sc.nextInt();
		int resultado=numero01*numero02;
		System.out.println("A área do retângulo é: " + resultado);
	
	}
}