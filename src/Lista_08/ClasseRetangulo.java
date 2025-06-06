package Lista_08;

public class ClasseRetangulo {
  // Variáveis (Atributos)
  private double base;
  private double altura;

  // Construtor
  public ClasseRetangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  // Métodos
  public void setBase(double base) {
    this.base = base;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public double getAltura() {
    return altura;
  }

  public double calcularArea() {
    return base * altura;
  }

  public double calcularPerimetro() {
    return 2 * (base + altura);
  }
}