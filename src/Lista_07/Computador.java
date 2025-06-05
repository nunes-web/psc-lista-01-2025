package Lista_07;

public class Computador {
  // Variáveis (Atributos)
  private boolean ligado;
  private String ssd;
  private String placaMae;
  private String placaVideo;
  private String processador;
  private String memoriaRAM;

  // Construtor
  public Computador() {
    this.ligado = false;
    this.ssd = "SSD 2Tb NVMe PCIe 4.0";
    this.placaMae = "Placa mãe ASUS x570 Tuf Gaming";
    this.placaVideo = "Placa de vídeo RTX 4070 12Gb";
    this.processador = "AMD Ryzen 7 5700X3D";
    this.memoriaRAM = "32GB DDR4 3200MHz";
  }

  // Métodos
  public void ligarDesligar() {
    ligado = !ligado;
    System.out.println(ligado ? "Computador ligado." : "Computador desligado.");
  }

  public void reiniciar() {
    if (ligado) {
      System.out.println("Reiniciando o computador...");
    } else {
      System.out.println("O computador está desligado.");
    }
  }

  public void abrirPrograma(String nomePrograma) {
    if (ligado) {
      System.out.println("Abrindo o programa: " + nomePrograma);
    } else {
      System.out.println("O computador está desligado.");
    }
  }

  public void calcularVariaveis() {
    if (ligado) {
      System.out.println("Processador está calculando variáveis...");
    } else {
      System.out.println("O computador está desligado.");
    }
  }

  public void salvarArquivos(String nomeArquivo) {
    if (ligado) {
      System.out.println("Salvando arquivo: " + nomeArquivo + " na memória RAM.");
    } else {
      System.out.println("O computador está desligado.");
    }
  }

  // Getters
  public boolean isLigado() {
    return ligado;
  }

  public String getSsd() {
    return ssd;
  }

  public String getPlacaMae() {
    return placaMae;
  }

  public String getPlacaVideo() {
    return placaVideo;
  }

  public String getProcessador() {
    return processador;
  }

  public String getMemoriaRAM() {
    return memoriaRAM;
  }

  // Setters
  public void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public void setSsd(String ssd) {
    this.ssd = ssd;
  }

  public void setPlacaMae(String placaMae) {
    this.placaMae = placaMae;
  }

  public void setPlacaVideo(String placaVideo) {
    this.placaVideo = placaVideo;
  }

  public void setProcessador(String processador) {
    this.processador = processador;
  }

  public void setMemoriaRAM(String memoriaRAM) {
    this.memoriaRAM = memoriaRAM;
  }
}