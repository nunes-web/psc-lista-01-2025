package Lista_02;

import java.util.Scanner;

public class Gasosa {
  public static void main(String[] args) {
    double valorLitro, valorPago, litros;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do litro da gasolina: ");
    valorLitro = scanner.nextDouble();

    System.out.println("Digite quantos litros foram vendidos: ");
    litros = scanner.nextDouble();

    valorPago = valorLitro * litros;
    String formatValorPago = String.format("%.2f", valorPago);

    System.out.println("O valor total a ser pago é: R$" + formatValorPago);

    scanner.close();
  }
}