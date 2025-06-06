package Lista_08;

public class ClasseContaCorrente {
  // Atributos
  private String numeroConta;
  private String nomeCorrentista;
  private double saldo;

  // Construtor
  public ClasseContaCorrente(String numeroConta, String nomeCorrentista) {
    this.numeroConta = numeroConta;
    this.nomeCorrentista = nomeCorrentista;
    this.saldo = 0.0;
  }

  // Métodos
  public void alterarNome(String novoNome) {
    this.nomeCorrentista = novoNome;
  }

  public void deposito(double valor) {
    if (valor > 0) {
      this.saldo += valor;
      System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    } else {
      System.out.println("Valor de depósito inválido.");
    }
  }

  public void saque(double valor) {
    if (valor > 0 && valor <= saldo) {
      this.saldo -= valor;
      System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    } else {
      System.out.println("Saldo insuficiente ou valor inválido.");
    }
  }

  // Getters e Setters
  public String getNumeroConta() {
    return numeroConta;
  }

  public String getNomeCorrentista() {
    return nomeCorrentista;
  }

  public double getSaldo() {
    return saldo;
  }
}