package Faccat;
import java.util.Scanner;

public class Ex31{ 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o valor do lado A: ");
    double ladoA = scanner.nextDouble();
    
    System.out.print("Digite o valor do lado B: ");
    double ladoB = scanner.nextDouble();
    
    System.out.print("Digite o valor do lado C: ");
    double ladoC = scanner.nextDouble();
    
    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
        System.out.println("Os valores informados formam um triângulo.");
    } else {
        System.out.println("Os valores informados não formam um triângulo.");
    }
    
    scanner.close();
}
}