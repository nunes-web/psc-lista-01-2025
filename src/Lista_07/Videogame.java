package Lista_07;

public class Videogame {
  // Variáveis (Atributos)
  private boolean ligado;
  private boolean leitorDeDisco;
  private String apu;
  private String ssd;
  private boolean hdmiConectado;
  private boolean controleConectado;

  // Construtor
  public Videogame() {
    this.ligado = false;
    this.leitorDeDisco = false;
    this.apu = "APU Integrada";
    this.ssd = "SSD 1TB";
    this.hdmiConectado = false;
    this.controleConectado = false;
  }

  // Métodos
  public void ligarDesligar() {
    if (controleConectado) {
      ligado = !ligado;
      System.out.println(ligado ? "Videogame ligado." : "Videogame desligado.");
    } else {
      System.out.println("Conecte o controle para ligar/desligar o videogame.");
    }
  }

  public void lerDiscos() {
    if (ligado && leitorDeDisco) {
      System.out.println("Lendo disco...");
    } else if (!ligado) {
      System.out.println("O videogame está desligado.");
    } else {
      System.out.println("Nenhum disco inserido.");
    }
  }

  public void processarDados() {
    if (ligado) {
      System.out.println("APU processando dados...");
    } else {
      System.out.println("O videogame está desligado.");
    }
  }

  public void salvarJogos(String nomeJogo) {
    if (ligado) {
      System.out.println("Salvando jogo: " + nomeJogo + " no SSD.");
    } else {
      System.out.println("O videogame está desligado.");
    }
  }

  public void reproduzirImagem() {
    if (ligado && hdmiConectado) {
      System.out.println("Reproduzindo imagem via HDMI.");
    } else if (!hdmiConectado) {
      System.out.println("Conecte o cabo HDMI para reproduzir imagem.");
    } else {
      System.out.println("O videogame está desligado.");
    }
  }

  // Getters e Setters
  public boolean isLigado() {
    return ligado;
  }

  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public boolean isLeitorDeDisco() {
    return leitorDeDisco;
  }

  public void setLeitorDeDisco(boolean leitorDeDisco) {
    this.leitorDeDisco = leitorDeDisco;
  }

  public String getApu() {
    return apu;
  }

  public void setApu(String apu) {
    this.apu = apu;
  }

  public String getSsd() {
    return ssd;
  }

  public void setSsd(String ssd) {
    this.ssd = ssd;
  }

  public boolean isHdmiConectado() {
    return hdmiConectado;
  }

  public void setHdmiConectado(boolean hdmiConectado) {
    this.hdmiConectado = hdmiConectado;
  }

  public boolean isControleConectado() {
    return controleConectado;
  }

  public void setControleConectado(boolean controleConectado) {
    this.controleConectado = controleConectado;
  }
}