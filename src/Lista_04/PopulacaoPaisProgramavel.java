package Lista_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PopulacaoPaisProgramavel {

  public static void main(String[] args) {
    // Variáveis
    double popA = 0, popB = 0, popAp, popBp, popAd, popBd;
    int anos = 0;

    try (Scanner scanner = new Scanner(System.in)) {
      // Entrada da população e taxa de crescimento A
      while (true) {
        try {
          System.out.printf("Digite a população A: ");
          popA = scanner.nextDouble();
          System.out.printf("Digite a taxa de crescimento da população A em porcentagem: ");
          popAp = scanner.nextDouble();

          // Entrada da população e taxa de crescimento B
          System.out.printf("Digite a população B: ");
          popB = scanner.nextDouble();
          System.out.printf("Digite a taxa de crescimento da população B em porcentagem: ");
          popBp = scanner.nextDouble();

          // Validações
          if (popA <= 0 || popB <= 0) {
            System.out.println("As populações devem ser maiores que zero. Tente novamente.\n");
            continue;
          } else if (popAp < 0 || popBp < 0) {
            System.out.println("As taxas de crescimento devem ser maiores ou iguais a zero. Tente novamente.\n");
            continue;
          } else if (popA == popB && popAp == popBp) {
            System.out.println("As populações e taxas de crescimento não podem ser iguais. Tente novamente.\n");
            continue;
          } else if (popA < popB && popAp <= popBp) {
            System.out.println(
                "A população A não será ultrapassada pela população B com as taxas fornecidas. Tente novamente.\n");
            continue;
          } else if (popA < popB) {
            System.out.println("A população B já é maior que a população A. Não há necessidade de ultrapassagem.\n");
            continue;
          }
          break;
        } catch (InputMismatchException e) {
          System.out.println("Valor inválido. Tente novamente...\n");
          scanner.next();
        }
      }
      // Cálculo da porcentagem
      popAd = popAp / 100;
      popBd = popBp / 100;

      // Cálculo da população
      while (popB <= popA) {
        popA += popA * popAd;
        popB += popB * popBd;
        anos++;
      }

      System.out.println("Com a taxa de crescimento de " + popAp +
          "% para país A, e " + popBp + "% para país B, serão necessários " +
          anos + " anos para que a população do país B ultrapasse ou iguale a do país A.");
    }
  }
}
