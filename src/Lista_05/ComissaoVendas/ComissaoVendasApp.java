package Lista_05.ComissaoVendas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ComissaoVendasApp {
  public static void main(String[] args) {
    // Array de contadores para as faixas salariais
    int[] faixas = new int[9];
    ArrayList<Double> salarios = new ArrayList<>();

    // Entrada de dados
    while (true) {
      String entrada = JOptionPane.showInputDialog(null,
          "Digite o valor das vendas brutas semanais (ou Cancelar para sair):");
      if (entrada == null)
        break;
      try {
        // Substitui vírgula por ponto para aceitar ambos os formatos
        entrada = entrada.replace(',', '.');
        double valor = Double.parseDouble(entrada);
        if (valor < 0) {
          JOptionPane.showMessageDialog(null, "Valores negativos não são válidos. Tente novamente.",
              "Erro!", JOptionPane.WARNING_MESSAGE);
          continue;
        }
        // Soma 200 reais ao salário de cada semana
        salarios.add(200 + (0.09 * valor));
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.",
            "Erro!", JOptionPane.WARNING_MESSAGE);
      }
    }

    // Processamento dos salários e contagem das faixas
    for (double salario : salarios) {
      int indice;
      if (salario >= 1000) {
        indice = 8;
      } else {
        indice = (int) ((salario - 200) / 100);
        if (indice < 0)
          indice = 0;
      }
      faixas[indice]++;
    }

    // Exibição dos resultados
    String[] labels = {
        "R$200 - R$299", "R$300 - R$399", "R$400 - R$499", "R$500 - R$599",
        "R$600 - R$699", "R$700 - R$799", "R$800 - R$899", "R$900 - R$999", "R$1000 ou mais"
    };
    StringBuilder resultado = new StringBuilder("Distribuição dos salários:\n");
    for (int i = 0; i < faixas.length; i++) {
      resultado.append(labels[i]).append(": ").append(faixas[i]).append("\n");
    }
    JOptionPane.showMessageDialog(null, resultado.toString(),
        "Resultado das Comissões", JOptionPane.WARNING_MESSAGE);
  }
}