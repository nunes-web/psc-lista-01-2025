package Lista_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc2Grau {
  public static void main(String[] args) {
    // Variaveis
    Double a, b, c, delta, raiz1, raiz2;
    int verificar;

    // Entrada do usuario
    try (Scanner scanner = new Scanner(System.in)) {
      do {
        System.out.println("Digite os coeficientes da sua equação de 2º grau:\n");
        while (true) {
          try {
            System.out.println("Coeficiente (a): ");
            a = scanner.nextDouble();
            System.out.println("Coeficiente (b): ");
            b = scanner.nextDouble();
            System.out.println("Coeficiente (c): ");
            c = scanner.nextDouble();
            break;

          } catch (InputMismatchException notDouble) {
            System.out.println("Entrada inválida, tente novamente...");
            scanner.next();

          }
        }

        // Verificacao dos coeficientes
        if (a == 0 && b == 0) {
          System.err.println("Coeficientes informados incorretamente.\n" +
              "\n==============================\n");
          verificar = 1;
        } else {
          verificar = 0;
        }
      } while (verificar == 1);

      // Calculo Discriminate Delta
      delta = ((b * b) - 4 * a * c);
      // Verificacao da equacao
      if (a == 0 && b != 0) {
        System.err.println("Esta é uma equação de primeiro grau." +
            "\nPorém, seu discriminante Delta é igual a: " + delta);
      } else if (delta < 0) {
        System.err.println("Esta equação não possui raízes reais." +
            "\nPorém, seu discriminante Delta é igual a: " + delta);
      } else if (delta == 0) {
        raiz1 = ((-b + (Math.sqrt(delta))) / (2 * a));
        raiz2 = ((-b - (Math.sqrt(delta))) / (2 * a));
        System.out.println("Esta equação possui duas raizes iguais." +
            "\nDiscriminante Delta é igual a: " + delta);
        System.out.printf("A primeira raiz é: %.2f\nA segunda raiz é: %.2f\n", raiz1, raiz2);
      } else {
        raiz1 = ((-b + (Math.sqrt(delta))) / (2 * a));
        raiz2 = ((-b - (Math.sqrt(delta))) / (2 * a));
        System.out.println("Esta equação possui duas raízes diferentes." +
            "\nDiscriminante Delta é igual a: " + delta);
        System.out.printf("A primeira raiz é: %.2f\nA segunda raiz é: %.2f\n", raiz1, raiz2);
      }
    }
  }
}
