package Faccat;
import java.util.Scanner;


public class Ex32 {   
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o nome do time 1: ");
    String time1 = scanner.nextLine();
    
    System.out.print("Digite o número de gols do time 1: ");
    int golsTime1 = scanner.nextInt();
    
    System.out.print("Digite o nome do time 2: ");
    scanner.nextLine(); // Limpar o buffer do scanner antes de ler a próxima linha
    String time2 = scanner.nextLine();
    
    System.out.print("Digite o número de gols do time 2: ");
    int golsTime2 = scanner.nextInt();
    
    if (golsTime1 > golsTime2) {
        System.out.println("O vencedor é: " + time1);
    } else if (golsTime2 > golsTime1) {
        System.out.println("O vencedor é: " + time2);
    } else {
        System.out.println("EMPATE");
    }
    
    scanner.close();
}
}