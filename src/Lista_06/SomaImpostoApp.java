package Lista_06;


import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class SomaImpostoApp {
  public static double somaImposto(double taxaImposto, double custo) {
    return custo + (custo * taxaImposto / 100);
  }

  public static void main(String[] args) {
    double taxaImposto, custo;
    while (true) {
      try {
        taxaImposto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa de imposto (%):", "Entrada", JOptionPane.QUESTION_MESSAGE).replace(',', '.'));
        custo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o custo do item:", "Entrada", JOptionPane.QUESTION_MESSAGE).replace(',', '.'));
        break;
      } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }

    double custoFinal = somaImposto(taxaImposto, custo);

    JOptionPane.showMessageDialog(null, String.format("O custo final com imposto é: %.2f", custoFinal), "Resultado", JOptionPane.INFORMATION_MESSAGE);
  }
}