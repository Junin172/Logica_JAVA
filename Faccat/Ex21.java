package Faccat;
import java.util.Scanner;

public class Ex21{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a hora de início da partida de xadrex: ");
		int inicio= sc.nextInt();
		System.out.println("Agora digite a hora do fim da partida: ");
		int fim= sc.nextInt();
		
		
		if(fim<inicio) {
			int duracao = (fim + 24)- inicio ;
			System.out.println("A duração da partida foi de: " + duracao + " horas.");
		}
		else {
			int duracao= fim - inicio;
			System.out.println("A duração da partida foi de: " + duracao + " horas.");	
		}
	sc.close();
	}
				
	}