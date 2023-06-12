package Faccat;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        int codigoUsuario, senha;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código de usuário: ");
        codigoUsuario = input.nextInt();

        if (codigoUsuario != 1234) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.print("Digite a senha: ");
            senha = input.nextInt();

            if (senha != 9999) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido");
            }
        }

        input.close();
    }
}
