package Lista_02;

import java.util.Scanner;

public class NumSomaSubMult {
  public static void main(String[] args) {
    double num1, num2, soma, sub, multi;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    num1 = scanner.nextDouble();
    System.out.println("Digite o segundo número: ");
    num2 = scanner.nextDouble();

    soma = num1 + num2;
    sub = num1 - num2;
    multi = num1 * num2;

    System.out.println("A soma dos números é: " + soma);
    System.out.println("A subtração dos números é: " + sub);
    System.out.println("A multiplicação dos números é: " + multi);

    scanner.close();
  }
}