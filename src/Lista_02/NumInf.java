package Lista_02;

import java.util.Scanner;

public class NumInf {
  public static void main(String[] args) {
    double num;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    num = scanner.nextDouble();

    System.out.println("O número digitado foi: " + num);

    scanner.close();
  }
}
