package Lista_07;

public class Televisao {
  // Variáveis (Atributos)
  private boolean ligada;
  private int volume;
  private int canal;
  private String tela;
  private String botoes;

  // Construtor
  public Televisao() {
    this.ligada = false;
    this.volume = 10;
    this.canal = 1;
    this.tela = "LED";
    this.botoes = "Controle Remoto";
  }

  // Métodos
  public void ligarDesligar() {
    ligada = !ligada;
  }

  public void aumentarVolume() {
    if (ligada && volume < 100)
      volume++;
  }

  public void diminuirVolume() {
    if (ligada && volume > 0)
      volume--;
  }

  public void mudarCanal(int novoCanal) {
    if (ligada && novoCanal > 0)
      canal = novoCanal;
  }

  public void abrirMenu() {
    if (ligada) {
      System.out.println("Menu aberto. Volume: " + volume + ", Canal: " + canal);
    }
  }

  public void gravarPrograma(String nomePrograma) {
    if (ligada) {
      System.out.println("Gravando programa: " + nomePrograma);
    }
  }

  // Getters e Setters
  public boolean isLigada() {
    return ligada;
  }

  public int getVolume() {
    return volume;
  }

  public int getCanal() {
    return canal;
  }

  public String getTela() {
    return tela;
  }

  public String getBotoes() {
    return botoes;
  }

}