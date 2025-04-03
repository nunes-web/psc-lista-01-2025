package Lista_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Maiorde5 {
  public static void main(String[] args) {
    // Variáveis
    int maior = Integer.MIN_VALUE, num;

    System.out.println("Digite 5 números:");

    // Entrada dos numeros
    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 1; i <= 5; i++) {
        try {
          System.out.printf("Número %d: ", i);
          num = scanner.nextInt();

          // Identificação do maior numero
          maior = Math.max(maior, num);
        } catch (InputMismatchException e) {
          System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
          scanner.next();
          i--;
        }
      }
    } catch (Exception e) {
      System.out.println("Ocorreu um erro inesperado. Tente novamente.");
      return;
    }
    // Resultado
    System.out.println("O maior número é: " + maior);
  }
}
