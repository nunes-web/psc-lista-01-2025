package Lista_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorAleatorio {
  public static void main(String[] args) {
    // Variáveis
    int[] num = new int[3];
    int maior, menor;

    // Entradas do usuário
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        try {
          System.out.println("Digite o primeiro número:");
          num[1] = scanner.nextInt();
          System.out.println("Digite o segundo número:");
          num[2] = scanner.nextInt();
          break;
        } catch (InputMismatchException e) {
          System.out.println("Valor inválido, digite apenas números");
          scanner.next();
        }
      }
    }

    // Gerador de número aleatório
    num[0] = (int) (Math.random() * (Math.pow((Math.random() * 10), (Math.random() * 10)) - 0 + 1));

    // Verificador de num maior e menor
    maior = Math.max(num[1], num[2]);
    menor = Math.min(num[1], num[2]);

    System.out.println("O primeiro número é:" + num[1]);
    System.out.println("O segundo número é:" + num[2]);

    if (num[1] == num[2]) {
      System.out.println("Os dois números são iguais");

    } else {
      System.out.println("Dentre os dois, o maior número é:" + maior);
      System.out.println("Dentre os dois, o menor número é:" + menor);
    }

    System.out.println("O numero aleatório é:" + num[0]);

    if ((num[0] % 2) != 0) {
      System.out.println("O número aleatório é: impar");
    } else {
      System.out.println("O número aleatório é: par");
    }
  }
}
