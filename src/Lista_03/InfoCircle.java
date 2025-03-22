package Lista_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InfoCircle {
  public static void main(String[] args) {
    // Variaveis
    Double r, d;
    int operacao, verificar;

    // Entrada do usuario
    try (Scanner scanner = new Scanner(System.in)) {
      do {
        System.out.println("\nSelecione o tipo de operação: \n" +
            "[1] Perímetro de um Círculo\n" +
            "[2] Área de um Círculo\n" +
            "[3] Volume de uma Esfera\n");
        while (true) {
          try {
            operacao = scanner.nextInt();

            break;
          } catch (InputMismatchException e) {
            System.out.println("Opção inválida. Selecione entre 1 - 3");
            scanner.next();
          }
        }
        if (operacao > 0 || operacao < 3) {
          System.out.println("Opção inválida...");
        }

      } while (operacao > 0 || operacao < 3);
    }

    /*
     * 
     * do {
     * System.out.println("Digite os coeficientes da sua equação de 2º grau:\n");
     * while (true) {
     * try {
     * System.out.println("Coeficiente (a): ");
     * a = scanner.nextDouble();
     * System.out.println("Coeficiente (b): ");
     * b = scanner.nextDouble();
     * System.out.println("Coeficiente (c): ");
     * c = scanner.nextDouble();
     * break;
     * 
     * } catch (InputMismatchException notDouble) {
     * System.out.println("Entrada inválida, tente novamente...");
     * scanner.next();
     * 
     * }
     * }
     * 
     * // Verificacao dos coeficientes
     * if (a == 0 && b == 0) {
     * System.err.println("Coeficientes informados incorretamente.\n" +
     * "\n==============================\n");
     * verificar = 1;
     * } else {
     * verificar = 0;
     * }
     * } while (verificar == 1);
     * 
     * // Calculo Discriminate Delta
     * delta = ((b * b) - 4 * a * c);
     * 
     * // Verificacao da equacao
     * if (a == 0 && b != 0) {
     * System.err.println("Esta é uma equação de primeiro grau." +
     * "\nPorém, seu discriminante Delta é igual a: " + delta);
     * } else if (delta < 0) {
     * System.err.println("Esta equação não possui raízes reais." +
     * "\nPorém, seu discriminante Delta é igual a: " + delta);
     * } else if (delta == 0) {
     * raiz1 = ((-b + (Math.sqrt(delta))) / (2 * a));
     * raiz2 = ((-b - (Math.sqrt(delta))) / (2 * a));
     * System.out.println("Esta equação possui duas raizes iguais." +
     * "\nDiscriminante Delta é igual a: " + delta);
     * System.out.printf("A primeira raiz é: %.2f\nA segunda raiz é: %.2f\n", raiz1,
     * raiz2);
     * } else {
     * raiz1 = ((-b + (Math.sqrt(delta))) / (2 * a));
     * raiz2 = ((-b - (Math.sqrt(delta))) / (2 * a));
     * System.out.println("Esta equação possui duas raízes diferentes." +
     * "\nDiscriminante Delta é igual a: " + delta);
     * System.out.printf("A primeira raiz é: %.2f\nA segunda raiz é: %.2f\n", raiz1,
     * raiz2);
     * }
     */
  }
}
