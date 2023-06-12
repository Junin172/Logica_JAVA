package Faccat;
import java.util.Scanner;

public class Ex26{public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a quantidade atual em estoque: ");
    int quantidadeAtual = scanner.nextInt();
    
    System.out.print("Digite a quantidade máxima em estoque: ");
    int quantidadeMaxima = scanner.nextInt();
    
    System.out.print("Digite a quantidade mínima em estoque: ");
    int quantidadeMinima = scanner.nextInt();
    
    double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2.0;
    
    System.out.println("Quantidade Média: " + quantidadeMedia);
    
    if (quantidadeAtual >= quantidadeMedia) {
        System.out.println("Não efetuar compra");
    } else {
        System.out.println("Efetuar compra");
    }
    
    scanner.close();
}
}
