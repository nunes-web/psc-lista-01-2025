package Lista_04;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ZeroDez {
  public static void main(String[] args) {
    // Variáveis
    int nota;

    // Entrada do usuário, com verificação de valores digitados
    try (Scanner scanner = new Scanner(System.in)) {
      do {
        while (true)
          try {
            System.out.println("Digite uma nota de zero a dez [0 - 10]");
            nota = scanner.nextInt();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Nota inválida...\n");
            scanner.next();
          }
        if (nota < 0 || nota > 10) {
          System.out.println("Nota inválida...\n");
        }
      } while (nota < 0 || nota > 10);
      System.out.println("\nSua nota é:" + nota);
    }
  }
}
