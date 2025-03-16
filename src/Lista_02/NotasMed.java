package Lista_02;

import java.util.Scanner;

public class NotasMed {
  public static void main(String[] args) {
    double nota1, nota2, nota3, nota4, mediaArit;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    nota1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota: ");
    nota2 = scanner.nextDouble();
    System.out.println("Digite a terceira nota: ");
    nota3 = scanner.nextDouble();
    System.out.println("Digite a quarta nota: ");
    nota4 = scanner.nextDouble();

    mediaArit = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.println("A média aritmética das notas é: \n" + mediaArit);

    scanner.close();
  }

}