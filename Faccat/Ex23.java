package Faccat;
import java.util.Scanner;

public class Ex23{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o sexo (M ou F): ");
        String sexo = scanner.nextLine();
        
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        
        double pesoIdeal;
        
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        
        System.out.println("O peso ideal para " + nome + " é " + pesoIdeal + " kg.");
        
        scanner.close();
    }
}
