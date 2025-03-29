package Lista_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InfoCircle {
  public static void main(String[] args) {
    // Variaveis
    Double r, resultado;
    int operacao;

    // Entrada do usuario
    try (Scanner scanner = new Scanner(System.in)) {
      // Menu principal
      do {
        while (true) {
          try {
            System.out.println("\nSelecione o tipo de operação [1 - 3]: \n" +
                "[1] Perímetro de um Círculo\n" +
                "[2] Área de um Círculo\n" +
                "[3] Volume de uma Esfera\n");
            operacao = scanner.nextInt();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Opção inválida. Selecione entre [1 - 3]:");
            scanner.next();
          }
        }
        if (operacao < 0 || operacao > 3) {
          System.out.println("Opção inválida. Selecione entre [1 - 3] ZZZ");
        }

      } while (operacao < 0 || operacao > 3);

      // Entrada das variáveis

      while (true) {
        try {
          System.out.println("\nDigite o raio (r) da circunferência");
          r = scanner.nextDouble();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Opção inválida. Selecione entre [1 - 3]:");
          scanner.next();
        }
      }

      switch (operacao) {
        case 1:
          System.out.println("Você escolheu calcular o perímetro de um círculo.");
          resultado = (Math.PI * 2 * r);
          System.out.printf("O perímetro do círculo é: %.2f", resultado);
          break;
        case 2:
          System.out.println("Você escolheu calcular a área de um círculo.");
          resultado = (Math.PI * r * r);
          System.out.printf("A área do círculo é:%.2f", resultado);
          break;
        case 3:
          System.out.println("Você escolheu calcular o volume de uma esfera.");
          resultado = (4 / 3 * Math.PI * r * r * r);
          System.out.printf("O volume da esfera é:%.2f", resultado);
          break;
        default:
          System.out.println("Opção inválida. Selecione entre [1 - 3]");
          break;
      }
    }
  }
}
