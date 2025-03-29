package Lista_04;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Pessoa {
  public static void main(String[] args) {
    // Variáveis
    String nome, sexo, salarioF, estadoCivil;
    int idade;
    Double salario;
    boolean estadoCivilB = false;

    // Formatação Numérica Salário
    Locale country = Locale.getDefault();
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(country);

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Faça sua identificação:");

      // Identificação: Nome
      do {
        while (true) {
          System.out.printf("Digite seu nome: ");
          nome = scanner.nextLine();

          // Verificação se o nome contém números
          if (nome.matches(".*\\d.*")) {
            System.out.println("Seu nome não pode conter números. Tente novamente...\n");
          } else {
            break;
          }
        }
        // Verificação se o nome contém mais que 3 caracteres
        if (nome.length() <= 3) {
          System.out.println("Seu nome não pode conter menos que 3 caracteres. Tente novamente...\n");
        }

      } while (nome.length() <= 3);

      // Identificação: Idade
      do {
        // Verificação se a idade contém apenas números
        while (true) {
          try {
            System.out.printf("Digite sua idade: ");
            idade = scanner.nextInt();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Tente novamente...\n");
            scanner.next();
          }
        }
        // Verificação se a idade está entre 0 e 150
        if (idade < 0 || idade > 150) {
          System.out.println("Valor inválido. Tente novamente...\n");
        }
      } while (idade < 0 || idade > 150);
      // Limpeza do buffer de entrada
      scanner.nextLine();

      // Identificação: Salário
      do {
        // Verificação se o salário contém apenas números
        while (true) {
          try {
            System.out.printf("Digite seu salário: ");
            salario = scanner.nextDouble();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Tente novamente...\n");
            scanner.next();
          }
        }
        // Verificação se o salário não é menor que zero
        if (salario < 0) {
          System.out.println("Valor inválido. Tente novamente...\n");
        }
      } while (salario < 0);
      // Formatação do salário em moeda local
      salarioF = currencyFormat.format(salario);
      // Limpeza do buffer de entrada
      scanner.nextLine();

      // Identificação: Sexo
      do {
        // Verificação se o sexo contém apenas caracteres
        while (true) {
          try {
            System.out.printf("Digite seu sexo [F / M]: ");
            sexo = scanner.nextLine().toUpperCase();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Valor inválido, tente novamente...\n");
            scanner.next();
          }
        }
        // Verificação se o sexo contém mais que 1 caracter
        if (sexo.length() != 1) {
          System.out.println("Valor inválido, tente novamente...\n");
        }
      } while (sexo.length() != 1);

      // Identificação: Estado Civil
      do {
        // Verificação se o Estado Civil contém apenas caracteres
        while (true) {
          try {
            System.out.printf("Digite a sigla do seu Estado Civil: \n"
                + "\nSolteiro(a): S   |   Viúvo(a): V"
                + "\nCasado(a): C     |   Divorciado(a): D"
                + "\n\nSeu estado Civil: ");
            estadoCivil = scanner.nextLine().toUpperCase();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Valor inválido, tente novamente...\n");
            scanner.next();
          }
        }
        // Verificação se o nome contém mais que 1 caracter
        switch (estadoCivil) {
          case "S":
            estadoCivilB = true;
          case "C":
            estadoCivilB = true;
          case "V":
            estadoCivilB = true;
          case "D":
            estadoCivilB = true;
            break;
          default:
            System.out.println("Valor inválido, tente novamente...\n");
        }

      } while (estadoCivilB == false);
    }

    // Identificação Completa

    System.out.println("\n=========================\n"
        + "\nNome: " + nome
        + "\nIdade: " + idade
        + "\nSalário: " + salarioF
        + "\nSexo: " + sexo
        + "\nEstado Civil: " + estadoCivil
        + "\n\n=========================\n");
  }
}
