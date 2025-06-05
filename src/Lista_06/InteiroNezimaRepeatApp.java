package Lista_06;

import javax.swing.*;

public class InteiroNezimaRepeatApp {
  public static void main(String[] args) {
    int numero;
    while (true) {
      String entrada = JOptionPane.showInputDialog(null, "Digite um número inteiro:", "Entrada",
          JOptionPane.QUESTION_MESSAGE);
      if (entrada == null)
        return;
      try {
        numero = Integer.parseInt(entrada.trim());
        if (numero < 0) {
          JOptionPane.showMessageDialog(null, "Não são permitidos números negativos!", "Erro",
              JOptionPane.ERROR_MESSAGE);
        } else {
          break;
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }

    String resultado = "";
    for (int i = 1; i <= numero; i++) {
      for (int j = 1; j <= i; j++) {
        resultado += i + " ";
      }
      resultado += "\n";
    }
    resultado += "Fim";

    JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
  }
}