package Lista_06;


import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ConversaoHoraApp {

  // Função para converter hora 24h para 12h e retornar AM/PM
  public static int[] converterHora(int hora24, int min, char[] ampm) {
    int hora12;
    if (hora24 == 0) {
      hora12 = 12;
      ampm[0] = 'A';
    } else if (hora24 == 12) {
      hora12 = 12;
      ampm[0] = 'P';
    } else if (hora24 > 12) {
      hora12 = hora24 - 12;
      ampm[0] = 'P';
    } else {
      hora12 = hora24;
      ampm[0] = 'A';
    }
    return new int[]{hora12, min};
  }

  // Função para exibir a hora convertida
  public static void mostrarHora(int hora, int min, char ampm) {
    String periodo = (ampm == 'A') ? "A.M." : "P.M.";
    String msg = String.format("Hora convertida: %d:%02d %s", hora, min, periodo);
    JOptionPane.showMessageDialog(null, msg, "Conversão de Horário", JOptionPane.INFORMATION_MESSAGE);
  }

  public static void main(String[] args) {
    while (true) {
      int hora24 = 0, min = 0;
      boolean entradaValida = false;
      while (!entradaValida) {
        try {
          hora24 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora (0-23):", "Entrada", JOptionPane.QUESTION_MESSAGE));
          min = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os minutos (0-59):", "Entrada", JOptionPane.QUESTION_MESSAGE));
          if (hora24 < 0 || hora24 > 23 || min < 0 || min > 59) {
            JOptionPane.showMessageDialog(null, "Hora ou minuto fora do intervalo válido!", "Erro", JOptionPane.ERROR_MESSAGE);
          } else {
            entradaValida = true;
          }
        } catch (HeadlessException | NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Entrada inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
      }

      char[] ampm = new char[1];
      int[] horaMin = converterHora(hora24, min, ampm);
      mostrarHora(horaMin[0], horaMin[1], ampm[0]);

      int opcao = JOptionPane.showConfirmDialog(null, "Deseja converter outro horário?", "Continuar", JOptionPane.YES_NO_OPTION);
      if (opcao != JOptionPane.YES_OPTION) {
        break;
      }
    }
  }
}