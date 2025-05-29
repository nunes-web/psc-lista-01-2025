package Lista_05.CrimeGame;

public class Jogador {
  String nome;
  int pontos;
  String classificacao;

  public String setClassificacao(String classificacao) {
    this.classificacao = classificacao;
    return this.classificacao;
  }

  public String getClassificacao() {
    return classificacao;
  }

  public int setPontos(int pontos) {
    this.pontos = pontos;
    return this.pontos;
  }

  public int getPontos() {
    return pontos;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
}
