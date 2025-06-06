package Lista_08;

public class ClasseQuadrado {
  // Atributo
  private double lado;

  // Construtor
  public ClasseQuadrado(double lado) {
    this.lado = lado;
  }

  // Métodos
  public void setLado(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  public double calcularArea() {
    return lado * lado;
  }
}