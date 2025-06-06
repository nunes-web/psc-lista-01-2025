package Calculadora;

import java.text.DecimalFormat;
import javax.swing.*;

public class CalculadoraApp {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.####");
    while (true) {
      String[] opcoes = {
          "Adição", "Subtração", "Multiplicação", "Divisão",
          "Potenciação", "Raiz Quadrada", "Raiz Cúbica", "Todas as operações"
      };
      int escolha = JOptionPane.showOptionDialog(
          null,
          "Escolha a operação:",
          "Calculadora",
          JOptionPane.DEFAULT_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,
          opcoes,
          opcoes[0]);

      if (escolha == JOptionPane.CLOSED_OPTION)
        break;

      String entrada1 = JOptionPane.showInputDialog(null, "Digite o primeiro número (ou Q para sair):");
      if (entrada1 == null || entrada1.equalsIgnoreCase("Q"))
        break;
      entrada1 = entrada1.replace(',', '.'); // Permite vírgula como separador decimal

      String entrada2 = null;
      if (escolha != 5) {
        entrada2 = JOptionPane.showInputDialog(null, "Digite o segundo número (ou Q para sair):");
        if (entrada2 == null || entrada2.equalsIgnoreCase("Q"))
          break;
        entrada2 = entrada2.replace(',', '.'); // Permite vírgula como separador decimal
      }

      double num1 = 0, num2 = 0;
      try {
        num1 = Double.parseDouble(entrada1);
        if (escolha != 5)
          num2 = Double.parseDouble(entrada2);
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.");
        continue;
      }

      String resultado = "";

      switch (escolha) {
        case 0: // Adição
          resultado = "Resultado: " + df.format(num1 + num2);
          break;
        case 1: // Subtração
          resultado = "Resultado: " + df.format(num1 - num2);
          break;
        case 2: // Multiplicação
          resultado = "Resultado: " + df.format(num1 * num2);
          break;
        case 3: // Divisão
          if (num2 == 0) {
            resultado = "Impossível realizar uma divisão por zero.";
          } else {
            resultado = "Resultado: " + df.format(num1 / num2);
          }
          break;
        case 4: // Potenciação
          if (num2 == 0) {
            resultado = "Resultado: 1";
          } else {
            resultado = "Resultado: " + df.format(Math.pow(num1, num2));
          }
          break;
        case 5: // Raiz Quadrada
          if (num1 < 0) {
            resultado = "Não existe raiz de número negativo para o primeiro número.";
          } else {
            resultado = "Raiz quadrada de " + df.format(num1) + ": " + df.format(Math.sqrt(num1));
          }
          break;
        case 6: // Raiz Cúbica
          resultado = "Raiz cúbica de " + df.format(num1) + ": " + df.format(Math.cbrt(num1)) + "\n" +
              "Raiz cúbica de " + df.format(num2) + ": " + df.format(Math.cbrt(num2));
          break;
        case 7: // Todas as operações
          resultado = "Adição: " + df.format(num1 + num2) + "\n" +
              "Subtração: " + df.format(num1 - num2) + "\n" +
              "Multiplicação: " + df.format(num1 * num2) + "\n";
          if (num2 == 0) {
            resultado += "Divisão: Impossível realizar uma divisão por zero.\n";
          } else {
            resultado += "Divisão: " + df.format(num1 / num2) + "\n";
          }
          if (num2 == 0) {
            resultado += "Potenciação: 1\n";
          } else {
            resultado += "Potenciação: " + df.format(Math.pow(num1, num2)) + "\n";
          }
          if (num1 < 0) {
            resultado += "Raiz quadrada de " + df.format(num1) + ": Não existe raiz de número negativo.\n";
          } else {
            resultado += "Raiz quadrada de " + df.format(num1) + ": " + df.format(Math.sqrt(num1)) + "\n";
          }
          if (num2 < 0) {
            resultado += "Raiz quadrada de " + df.format(num2) + ": Não existe raiz de número negativo.\n";
          } else {
            resultado += "Raiz quadrada de " + df.format(num2) + ": " + df.format(Math.sqrt(num2)) + "\n";
          }
          resultado += "Raiz cúbica de " + df.format(num1) + ": " + df.format(Math.cbrt(num1)) + "\n" +
              "Raiz cúbica de " + df.format(num2) + ": " + df.format(Math.cbrt(num2));
          break;
        default:
          resultado = "Opção inválida!";
          break;
      }

      JOptionPane.showMessageDialog(null, resultado);
    }
  }
}