package Faccat;
import java.util.Scanner;

public class Ex15{
	  public static void main (String[]args) {
		  Scanner sc=new Scanner (System.in);
		  System.out.print("Digite um valor: ");
		  int numero = sc.nextInt();
		  if (numero < 0 ) {
			  System.out.println("Número negativo");
		  }
		  else {
			  System.out.println("Número positvo ");
		  }
		  sc.close();
	  }
	}
