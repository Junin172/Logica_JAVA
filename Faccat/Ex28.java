package Faccat;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        
        double maiorValor = valor1;
        
        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }
        
        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }
        
        System.out.println("O maior valor é: " + maiorValor);
        
        scanner.close();
    }
}
