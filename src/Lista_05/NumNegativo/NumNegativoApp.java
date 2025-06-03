package Lista_05.NumNegativo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class NumNegativoApp {
  public static void main(String[] args) {
    List<Double> valores = new ArrayList<>();
    double soma = 0;
    int acimaMedia = 0, abaixoSete = 0;
    double media;
    String resultado, ordem, inversa;

    // Entrada de valores
    while (true) {
      String entrada = JOptionPane.showInputDialog(null, "Digite um valor (ou -1 para encerrar):", "Entrada de Valores", JOptionPane.QUESTION_MESSAGE);
      if (entrada == null) break;
      try {
        double nota = Double.parseDouble(entrada.replace(',', '.'));
        if (nota == -1) break;
        valores.add(nota);
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.", "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }

    // Soma e média, com verificação de divisão por zero
    for (double nota : valores) soma += nota;
    media = valores.isEmpty() ? 0 : soma / valores.size();

    // Adiciona os valores acima da média e abaixo de sete
    for (double nota : valores) {
      if (nota > media) acimaMedia++;
      if (nota < 7) abaixoSete++;
    }

    // String para exibir os valores de saída formatados
    ordem = "";
    for (double nota : valores) {
      ordem += String.format("%.2f ", nota);
    }

    inversa = "";
    for (int i = valores.size() - 1; i >= 0; i--) {
      inversa += String.format("%.2f\n", valores.get(i));
    }

    resultado =
      "Quantidade de valores lidas: " + valores.size() + "\n" +
      "Notas na ordem informada: " + ordem + "\n" +
      "Notas na ordem inversa:\n" + inversa +
      "Soma dos valores: " + String.format("%.2f", soma) + "\n" +
      "Média dos valores: " + String.format("%.2f", media) + "\n" +
      "Quantidade de valores acima da média: " + acimaMedia + "\n" +
      "Quantidade de valores abaixo de sete: " + abaixoSete + "\n\n" +
      "Programa encerrado. Obrigado!";

    JOptionPane.showMessageDialog(null, resultado, "Resultados", JOptionPane.INFORMATION_MESSAGE);
  }
}