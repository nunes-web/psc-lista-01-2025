package Lista_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MedSumde5 {
  public static void main(String[] args) {
    // Variáveis
    double soma = 0, media, num;

    // Entrada dos numeros
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite 5 números:");
      for (double i = 1; i <= 5; i++) {
        try {
          System.out.printf("Número %.0f: ", i);
          num = scanner.nextDouble();

          soma += num;
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

    // Calculo da média
    media = soma / 5.0;

    // Resultados
    System.out.printf("\nA soma dos números é: %.2f", soma);
    System.out.printf("\nA média dos números é: %.2f", media);
  }
}