package Lista_07;

public class FoneDeOuvido {
  // Características (Atributos)
  private String modelo;
  private int volume;
  private String tamanho;
  private String ajuste;
  private boolean microfoneLigado;

  // Construtor
  public FoneDeOuvido(String modelo, int volume, String tamanho, String ajuste, boolean microfoneLigado) {
    this.modelo = modelo;
    this.volume = volume;
    this.tamanho = tamanho;
    this.ajuste = ajuste;
    this.microfoneLigado = microfoneLigado;
  }

  // Métodos (Ações)
  public void avancarAudio() {
    System.out.println("Áudio avançado para a próxima faixa.");
  }

  public void reiniciarAudio() {
    System.out.println("Áudio reiniciado.");
  }

  public void voltarAudio() {
    System.out.println("Voltando o áudio para a faixa anterior.");
  }

  public void reproduzirAudio() {
    System.out.println("Reproduzindo áudio.");
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Volume aumentado para: " + volume);
  }

  public void diminuirVolume() {
    if (volume > 0) {
      volume--;
      System.out.println("Volume diminuído para: " + volume);
    }
  }

  public void pausarAudio() {
    System.out.println("Áudio pausado.");
  }

  public void iniciarAudio() {
    System.out.println("Áudio iniciado.");
  }

  public void ligarMicrofone() {
    microfoneLigado = true;
    System.out.println("Microfone ligado.");
  }

  public void desligarMicrofone() {
    microfoneLigado = false;
    System.out.println("Microfone desligado.");
  }

  // Getters e Setters
  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public String getTamanho() {
    return tamanho;
  }

  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }

  public String getAjuste() {
    return ajuste;
  }

  public void setAjuste(String ajuste) {
    this.ajuste = ajuste;
  }

  public boolean isMicrofoneLigado() {
    return microfoneLigado;
  }

  public void setMicrofoneLigado(boolean microfoneLigado) {
    this.microfoneLigado = microfoneLigado;
  }
}