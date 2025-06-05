package Lista_06;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class SomaTresArgumentosApp {
  public static int somaTres(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    int n1, n2, n3;
    while (true) {
      try {
        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        break;
      } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }

    int resultado = somaTres(n1, n2, n3);

    JOptionPane.showMessageDialog(null, "A soma dos três números é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
  }
}