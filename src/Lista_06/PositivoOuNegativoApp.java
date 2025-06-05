package Lista_06;


import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class PositivoOuNegativoApp {
  public static char verificaPositivo(int valor) {
    return (valor > 0) ? 'P' : 'N';
  }

  public static void main(String[] args) {
    int numero;
    while (true) {
      try {
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        break;
      } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }

    char resultado = verificaPositivo(numero);

    JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
  }
}