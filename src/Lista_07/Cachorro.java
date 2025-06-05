package Lista_07;

public class Cachorro {
  // Variáveis (Atributos)
  private String nome;
  private String dataNascimento;
  private String pedigree;
  private String raca;
  private double peso;

  // Construtor
  public Cachorro(String nome, String dataNascimento, String pedigree, String raca, double peso) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.pedigree = pedigree;
    this.raca = raca;
    this.peso = peso;
  }

  // Métodos
  public void latir() {
    System.out.println(nome + " está latindo!");
  }

  public void correr() {
    System.out.println(nome + " está correndo!");
  }

  public void pular() {
    System.out.println(nome + " está pulando!");
  }

  public void brincar() {
    System.out.println(nome + " está brincando!");
  }

  public void rosnar() {
    System.out.println(nome + " está rosnando!");
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getPedigree() {
    return pedigree;
  }

  public void setPedigree(String pedigree) {
    this.pedigree = pedigree;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }
}