package Faccat;
import java.util.Scanner;

public class Ex25{  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o número da conta do cliente: ");
    int numeroConta = scanner.nextInt();
    
    System.out.print("Digite o saldo da conta: ");
    double saldo = scanner.nextDouble();
    
    System.out.print("Digite o valor do débito: ");
    double debito = scanner.nextDouble();
    
    System.out.print("Digite o valor do crédito: ");
    double credito = scanner.nextDouble();
    
    double saldoAtual = saldo - debito + credito;
    
    System.out.println("Saldo Atual: " + saldoAtual);
    
    if (saldoAtual >= 0) {
        System.out.println("Saldo Positivo");
    } else {
        System.out.println("Saldo Negativo");
    }
    
    scanner.close();
}
}