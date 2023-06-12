package Faccat;
import java.util.Scanner;

public class Ex22{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite quantas horas o funcionários trabalhou este mês: ");
		int horastrabalhadas = sc.nextInt();
		System.out.println("Agora digite o salário hora dele: ");
		float salariohora= sc.nextFloat();
		
		if (horastrabalhadas > 160) {
			int horasextras = horastrabalhadas - 160;
			float salariototal = horastrabalhadas * salariohora + ((float)(horasextras * 1.5));
			System.out.println("O salário final deste funcionário será de: R$ "+ salariototal);
		}
		else {
			float salariototal = horastrabalhadas * salariohora;
			System.out.println("O salário final deste funcionário será de: R$ "+ salariototal);	
		}
		sc.close();
		}
	}