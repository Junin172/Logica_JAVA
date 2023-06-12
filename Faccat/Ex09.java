package Faccat;
import java.util.Scanner;

//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 
public class Ex09{
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu salário total?: ");
		float salariototal = sc.nextFloat();
		System.out.println("Percentual de reajuste: ");
		float porcentagemreajuste = sc.nextFloat();
		float reajuste = (porcentagemreajuste*salariototal)/100;
		float valorfinal = salariototal + reajuste;
		System.out.println("O salário total é de: " + salariototal +
				"\n O reajuste ficará: " + reajuste +
				"\n O salário total será: " + valorfinal);
		sc.close();
	}
}
