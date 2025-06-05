package Lista_07;

public class Casa {
  // Variáveis (Atributos)
  private String logradouro;
  private double areaConstruida;
  private String bairro;
  private String cidade;
  private String cep;

  public Casa(String logradouro, double areaConstruida, String bairro, String cidade, String cep) {
    this.logradouro = logradouro;
    this.areaConstruida = areaConstruida;
    this.bairro = bairro;
    this.cidade = cidade;
    this.cep = cep;
  }

  // Getters e Setters
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public double getAreaConstruida() {
    return areaConstruida;
  }

  public void setAreaConstruida(double areaConstruida) {
    this.areaConstruida = areaConstruida;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  // Métodos
  public void alugar() {
    System.out.println("Casa alugada!");
  }

  public void trancar() {
    System.out.println("Casa trancada!");
  }

  public void destrancar() {
    System.out.println("Casa destrancada!");
  }

  public void comprar() {
    System.out.println("Casa comprada!");
  }

  public void decorar() {
    System.out.println("Casa decorada!");
  }

  public void limpar() {
    System.out.println("Casa limpa!");
  }
}
