package Faccat;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        int litros = scanner.nextInt();

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        double precoGasolina = 3.30;
        double precoAlcool = 2.90;
        double valorAPagar = 0;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                valorAPagar = litros * precoAlcool * 0.97; // 3% de desconto
            } else {
                valorAPagar = litros * precoAlcool * 0.95; // 5% de desconto
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                valorAPagar = litros * precoGasolina * 0.96; // 4% de desconto
            } else {
                valorAPagar = litros * precoGasolina * 0.94; // 6% de desconto
            }
        }

        System.out.println("Valor a ser pago: R$ " + valorAPagar);
    }
}