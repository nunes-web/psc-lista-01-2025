package Lista_07;

public class Celular {
  // Variáveis (Atributos)
  private boolean ligado;
  private boolean carregadorConectado;
  private int volume;
  private boolean foneDeOuvidoConectado;
  private String discador;

  // Construtor
  public Celular() {
    this.ligado = false;
    this.carregadorConectado = false;
    this.volume = 10;
    this.foneDeOuvidoConectado = false;
    this.discador = "Numérico";
  }

  // Métodos
  public void ligarDesligar() {
    ligado = !ligado;
    System.out.println(ligado ? "Celular ligado." : "Celular desligado.");
  }

  public void ligarParaAlguem(String numero) {
    if (ligado) {
      System.out.println("Ligando para: " + numero);
    } else {
      System.out.println("O celular está desligado.");
    }
  }

  public void aumentarVolume() {
    if (ligado && volume < 100) {
      volume++;
      System.out.println("Volume aumentado para: " + volume);
    }
  }

  public void diminuirVolume() {
    if (ligado && volume > 0) {
      volume--;
      System.out.println("Volume diminuído para: " + volume);
    }
  }

  public void reproduzirMusica(String musica) {
    if (ligado && foneDeOuvidoConectado) {
      System.out.println("Reproduzindo música: " + musica);
    } else if (!foneDeOuvidoConectado) {
      System.out.println("Conecte o fone de ouvido para ouvir música.");
    } else {
      System.out.println("O celular está desligado.");
    }
  }

  public void mostrarNotificacoes() {
    if (ligado) {
      System.out.println("Mostrando notificações na tela.");
    } else {
      System.out.println("O celular está desligado.");
    }
  }

  // Getters e Setters
  public boolean isLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean isCarregadorConectado() {
    return carregadorConectado;
  }

  public void setCarregadorConectado(boolean carregadorConectado) {
    this.carregadorConectado = carregadorConectado;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean isFoneDeOuvidoConectado() {
    return foneDeOuvidoConectado;
  }

  public void setFoneDeOuvidoConectado(boolean foneDeOuvidoConectado) {
    this.foneDeOuvidoConectado = foneDeOuvidoConectado;
  }

  public String getDiscador() {
    return discador;
  }

  public void setDiscador(String discador) {
    this.discador = discador;
  }
}