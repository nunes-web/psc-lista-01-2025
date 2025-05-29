package Lista_05.CrimeGame;

public class CrimeGameApp {

  public static void main(String[] args) {
    // Variáveis
    int pontos = 0;
    int resposta;
    String[] perguntas = {
        "Telefonou para a vítima?",
        "Esteve no local do crime?",
        "Mora perto da vítima?",
        "Devia para a vítima?",
        "Já trabalhou com a vítima?"
    };

    // Introdução ao Jogo
    Jogador jogador = new Jogador();

    javax.swing.JFrame janela = new javax.swing.JFrame();
    String nome = javax.swing.JOptionPane.showInputDialog(janela, "Digite o seu nome jogador(a): ", "CrimeGame!",
        javax.swing.JOptionPane.QUESTION_MESSAGE);

    jogador.setNome(nome);

    javax.swing.JOptionPane.showMessageDialog(janela,
        "Bem-vindo, " + jogador.getNome() + "!" + "\nResponda as perguntas, seja sincero, e tudo acabará bem...",
        "CrimeGame!",
        javax.swing.JOptionPane.INFORMATION_MESSAGE);

    // Perguntas
    for (String pergunta : perguntas) {
      resposta = javax.swing.JOptionPane.showConfirmDialog(janela, pergunta, "CrimeGame!",
          javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
      if (resposta == javax.swing.JOptionPane.YES_OPTION) {
        jogador.setPontos(++pontos);
      }
    }

    // Resultado

    switch (jogador.getPontos()) {
      case 0:
        jogador.setClassificacao("Inocente");
        javax.swing.JOptionPane.showMessageDialog(janela,
            "Este é um caso sério " + jogador.getNome() + "!" + "\nMas acredito que você seja "
                + jogador.getClassificacao() + "\n\nTome cuidado, há um assassino à solta!",
            "CrimeGame!",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        break;
      case 1:
        jogador.setClassificacao("Inocente");
        javax.swing.JOptionPane.showMessageDialog(janela,
            "Este é um caso sério " + jogador.getNome() + "!" + "\nMas acredito que você seja "
                + jogador.getClassificacao() + "\n\nTome cuidado, há um assassino à solta!",
            "CrimeGame!",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        break;
      case 2:
        jogador.setClassificacao("Suspeito(a)");
        javax.swing.JOptionPane.showMessageDialog(janela,
            "Este é um caso sério " + jogador.getNome() + "!" + "\nInfelizmente você é considerado um "
                + jogador.getClassificacao()
                + "\n\nTome cuidado, estaremos de olho em você!",
            "CrimeGame!",
            javax.swing.JOptionPane.WARNING_MESSAGE);
        break;
      case 3:
        jogador.setClassificacao("Cúmplice");
        javax.swing.JOptionPane.showMessageDialog(janela,
            "Este é um caso sério " + jogador.getNome() + "!" + "\nInfelizmente você é considerado um "
                + jogador.getClassificacao()
                + "\n\nTome cuidado, estamos de olho em você!",
            "CrimeGame!",
            javax.swing.JOptionPane.WARNING_MESSAGE);
        break;
      case 4:
        jogador.setClassificacao("Cúmplice");
        javax.swing.JOptionPane.showMessageDialog(janela,
            "Este é um caso sério " + jogador.getNome() + "!" + "\nInfelizmente você é considerado um "
                + jogador.getClassificacao()
                + "\n\nTome cuidado, estamos de olho em você!",
            "CrimeGame!",
            javax.swing.JOptionPane.WARNING_MESSAGE);
        break;
      case 5:
        jogador.setClassificacao("Assassino!");
        javax.swing.JOptionPane.showMessageDialog(janela,
            "Te pegamos " + jogador.getNome() + "!" + "\nVocê é o "
                + jogador.getClassificacao()
                + "\n\nVocê será preso e julgado por seus crimes!",
            "CrimeGame!",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        break;
      default:
        jogador.setClassificacao("Erro na classificação");
        break;
    }
    javax.swing.JOptionPane.showMessageDialog(janela,
        "Obrigado por jogar Crime Game!\n" + jogador.getNome() + ",\nVocê fez " + jogador.getPontos()
            + " pontos" + "\nSua classificação é: " + jogador.getClassificacao(),
        "CrimeGame!",
        javax.swing.JOptionPane.INFORMATION_MESSAGE);

  }
}
