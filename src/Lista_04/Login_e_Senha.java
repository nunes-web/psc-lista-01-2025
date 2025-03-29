package Lista_04;

import java.util.Scanner;

public class Login_e_Senha {
  public static void main(String[] args) {
    // Variáveis
    String usuario, senha;

    // Entrada do usuário
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Faça o seu registro no sistema");
      do {
        System.out.printf("Digite seu usuário: ");
        usuario = scanner.nextLine();

        System.out.printf("Digite sua senha: ");
        senha = scanner.nextLine();
        // Verificação de Strings, caso iguais retorne
        if (usuario.equals(senha)) {
          System.out.println("\nNão é permitido a senha ser igual ao seu usuário, tente novamente...\n");
        }
      } while (usuario.equals(senha));
    }
  }
}
