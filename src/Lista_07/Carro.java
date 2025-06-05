package Lista_07;

public class Carro {
  // Variáveis (Atributos)
  private String motor;
  private int rodas;
  private String volante;
  private boolean embreagem;
  private boolean farolAceso;

  // Construtor
  public Carro() {
    this.motor = "Motor 1.0 Flex";
    this.rodas = 4;
    this.volante = "Volante hidráulico";
    this.embreagem = false;
    this.farolAceso = false;
  }

  // Métodos
  public void mover() {
    System.out.println("O carro está se movendo.");
  }

  public void virar(String direcao) {
    System.out.println("Virando para a direção: " + direcao);
  }

  public void acenderFarol() {
    farolAceso = true;
    System.out.println("Farol aceso.");
  }

  public void frear() {
    if (embreagem) {
      System.out.println("Carro freiando com embreagem acionada.");
    } else {
      System.out.println("Carro freiando.");
    }
  }

  public void buzinar() {
    System.out.println("Sai da frente roda dura!: BEEP BEEP!");
  }

  // Getters e Setters
  public String getMotor() {
    return motor;
  }

  public void setMotor(String motor) {
    this.motor = motor;
  }

  public int getRodas() {
    return rodas;
  }

  public void setRodas(int rodas) {
    this.rodas = rodas;
  }

  public String getVolante() {
    return volante;
  }

  public void setVolante(String volante) {
    this.volante = volante;
  }

  public boolean isEmbreagem() {
    return embreagem;
  }

  public void setEmbreagem(boolean embreagem) {
    this.embreagem = embreagem;
  }

  public boolean isFarolAceso() {
    return farolAceso;
  }

  public void setFarolAceso(boolean farolAceso) {
    this.farolAceso = farolAceso;
  }
}