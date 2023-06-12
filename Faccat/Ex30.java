package Faccat;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        
        double menor, meio, maior;
        
        // Encontrar o menor valor
        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
        } else {
            menor = valor3;
        }
        
        // Encontrar o maior valor
        if (valor1 > valor2 && valor1 > valor3) {
            maior = valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior = valor2;
        } else {
            maior = valor3;
        }
        
        // Encontrar o valor do meio
        meio = valor1 + valor2 + valor3 - menor - maior;
        
        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
        
        scanner.close();
    }
}
