package Lista_08;

public class ClassePessoa {
  // Atributos
  private String nome;
  private int idade;
  private double peso;
  private double altura;

  // Construtor
  public ClassePessoa(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  // Métodos
  public void envelhecer() {
    idade++;
    if (idade <= 21) {
      crescer(0.5);
    }
  }

  public void engordar(double kg) {
    if (kg > 0) {
      peso += kg;
    }
  }

  public void emagrecer(double kg) {
    if (kg > 0) {
      peso -= kg;
    }
  }

  public void crescer(double cm) {
    if (cm > 0) {
      altura += cm;
    }
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getPeso() {
    return peso;
  }

  public double getAltura() {
    return altura;
  }
}