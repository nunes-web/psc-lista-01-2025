package Lista_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Intervalo {
  public static void main(String[] args) {
    // Variáveis
    int num1, num2, maior, menor;

    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        try {

          // Entrada do Usuário
          System.out.print("Digite o primeiro número: ");
          num1 = scanner.nextInt();

          System.out.print("Digite o segundo número: ");
          num2 = scanner.nextInt();

          // Cálculo do maior e menor
          menor = Math.min(num1, num2);
          maior = Math.max(num1, num2);

          System.out.println("Números no intervalo entre " + menor + " e " + maior + ":");
          break;
        } catch (InputMismatchException e) {
          System.out.println("Entrada inválida, tente novamente...");
          scanner.next();
        }
      } // Cálculo do intervalo

      for (int i = menor; i <= maior; i++) {
        System.out.print(i + ", ");
      }
    }
  }
}
