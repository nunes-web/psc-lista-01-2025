package Lista_07;

public class ArCondicionado {
  // Variáveis (Atributos)
  private boolean condensadora;
  private boolean evaporadora;
  private boolean controle;
  private boolean serpentina;
  private boolean dutoDeDrenagem;

  // Construtor
  public ArCondicionado() {
    this.condensadora = true;
    this.evaporadora = true;
    this.controle = true;
    this.serpentina = true;
    this.dutoDeDrenagem = true;
  }

  // Métodos
  public void refrigerarAmbiente() {
    if (condensadora) {
      System.out.println("Refrigerando o ambiente...");
    }
  }

  public void aumentarTemperatura() {
    if (evaporadora) {
      System.out.println("Aumentando a temperatura do ambiente...");
    }
  }

  public void diminuirTemperatura() {
    if (evaporadora) {
      System.out.println("Diminuindo a temperatura do ambiente...");
    }
  }

  public void ventilarAmbiente() {
    if (controle) {
      System.out.println("Ventilando o ambiente...");
    }
  }

  public void drenarAguaSerpentina() {
    if (serpentina) {
      System.out.println("Drenando água da serpentina...");
    }
  }

  public void reconhecerTemperaturaAmbiente() {
    if (dutoDeDrenagem) {
      System.out.println("Reconhecendo temperatura do ambiente...");
    }
  }

  // Getters e Setters (opcionais)
  public boolean isCondensadora() {
    return condensadora;
  }

  public void setCondensadora(boolean condensadora) {
    this.condensadora = condensadora;
  }

  public boolean isEvaporadora() {
    return evaporadora;
  }

  public void setEvaporadora(boolean evaporadora) {
    this.evaporadora = evaporadora;
  }

  public boolean isControle() {
    return controle;
  }

  public void setControle(boolean controle) {
    this.controle = controle;
  }

  public boolean isSerpentina() {
    return serpentina;
  }

  public void setSerpentina(boolean serpentina) {
    this.serpentina = serpentina;
  }

  public boolean isDutoDeDrenagem() {
    return dutoDeDrenagem;
  }

  public void setDutoDeDrenagem(boolean dutoDeDrenagem) {
    this.dutoDeDrenagem = dutoDeDrenagem;
  }
}