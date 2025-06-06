package Lista_08;

public class ClasseBola {
  // Variáveis (Atributos)
  private String cor;
  private double circunferencia;
  private String material;

  // Construtor
  public ClasseBola(String cor, double circunferencia, String material) {
    this.cor = cor;
    this.circunferencia = circunferencia;
    this.material = material;
  }

  // Métodos
  public void trocador(String novaCor) {
    this.cor = novaCor;
    System.out.println("Cor da bola trocada para: " + this.cor);
  }

  public void mostraCor() {
    System.out.println("A cor da bola é: " + this.cor);
  }

  // Getters e Setters
  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public double getCircunferencia() {
    return circunferencia;
  }

  public void setCircunferencia(double circunferencia) {
    this.circunferencia = circunferencia;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }
}