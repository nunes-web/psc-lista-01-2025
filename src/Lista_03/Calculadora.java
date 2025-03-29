package Lista_03;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    // Variáveis
    boolean verificador;
    String entrada;
    String[] calculo;
    double num1, num2, resultado;
    char operador;

    // Entrada do usuario
    try (Scanner scanner = new Scanner(System.in)) {
      do {

        System.out.println("Digite a operação simples (ex: 2+2):");
        entrada = scanner.nextLine();
        calculo = entrada.split("");

        if (calculo.length != 3) {
          System.out.println("Formato inválido. Use apenas 2 números e um sinal operador.\n");
          verificador = false;
        } else {
          verificador = true;
        }

      } while (verificador == false);
    }

    // Atribução da equação
    num1 = Double.parseDouble(calculo[0]);
    operador = calculo[1].charAt(0);
    num2 = Double.parseDouble(calculo[2]);

    // Cálculo
    switch (operador) {
      case '+':
        resultado = num1 + num2;
        break;
      case '-':
        resultado = num1 - num2;
        break;
      case '*':
        resultado = num1 * num2;
        break;
      case '/':
        if (num2 != 0) {
          resultado = num1 / num2;
        } else {
          System.out.println("Valor inválido, divisão por zero tende ao infinito.");
          return;
        }
        break;
      case '^':
        resultado = Math.pow(num1, num2);
        break;
      default:
        System.out.println("Operador inválido. Use +, -, *, / ou ^.");
        return;
    }

    // Exibe o resultado
    System.out.printf("Resultado: %.2f\n", resultado);

  }
}
