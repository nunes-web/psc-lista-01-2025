package Lista_05.TempMed;

import java.util.ArrayList;

public class AppTempMed {
  public static void main(String[] args) {
    // Variáveis
    ArrayList<Double> temperaturas = new ArrayList<>();
    String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };
    double media;
    double soma = 0;
    String acimaDaMedia;

    // Interface
    while (temperaturas.size() < meses.length) {
      javax.swing.JOptionPane.showMessageDialog(null, "Digite as temperaturas para cada mês do ano.");

      for (int i = 0; i < meses.length; i++) {
        String tempMes = javax.swing.JOptionPane
            .showInputDialog("Digite a temperatura (em ºC) do mês de " + meses[i] + ":");

        try {
          double temperatura = Double.parseDouble(tempMes);
          temperaturas.add(temperatura);
        } catch (NumberFormatException e) {
          javax.swing.JOptionPane.showMessageDialog(null, "Entrada inválida, tente novamente...");
          i--;
        }
      }
    }

    // Cálculo da média
    for (int t = 0; t < temperaturas.size(); t++) {
      soma += temperaturas.get(t);
    }
    media = soma / temperaturas.size();
    String mediaFormatada = String.format("%.2f ºC", media);

    // Monta uma string com temperaturas acima da média e seus meses
    acimaDaMedia = "";
    for (int i = 0; i < temperaturas.size(); i++) {
      if (temperaturas.get(i) > media) {
        acimaDaMedia += meses[i] + ": " + temperaturas.get(i) + " ºC\n";
      }
    }

    // Exibição do resultado
    javax.swing.JOptionPane.showMessageDialog(null, "A temperatura média dos meses do ano foi: " + mediaFormatada +
        "\n\n" +
        "Temperaturas acima da média registradas:\n" + acimaDaMedia);

  }
}
