package Divertidamente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divertidamente {
  public static void main(String[] args) {
    // Variaveis
    Boolean novasAmizades, boolVerificar;
    String novasAmizadesS;
    int alegria = 0, tristeza = 0;
    int novasAmizadesCidade, notaA1, notaA2, notaA3, notaMed, algoritmosF, algoritmosNF;

    try (Scanner scanner = new Scanner(System.in)) {
      // Introducao
      System.out.println("Bem-vindo ao Divertidamente!\n\n" +
          "Com a mudança para uma nova cidade, as emoções de Hilux, \nque tem apenas 11 anos de idade, ficam extremamente agitadas.\r\n"
          +
          "Uma confusão na sala de controle do seu cérebro deixa a Alegria e a Tristeza de fora, \nafetando a vida de Hilux radicalmente.\n");

      // Primeira pergunta
      do {
        System.out.println("A Hilux fez novas amizades? [S / N]");
        novasAmizadesS = scanner.nextLine();

        if (novasAmizadesS.equalsIgnoreCase("S") || novasAmizadesS.equalsIgnoreCase("N")) {
          boolVerificar = true;

        } else {
          boolVerificar = false;
          System.out.println("Valor inválido, informe novamente..\n");
        }
      } while (boolVerificar == false);

      novasAmizades = novasAmizadesS.equalsIgnoreCase("S");

      if (novasAmizades == false) {
        tristeza += 30;

      } else {
        alegria += 10;
        while (true) {
          try {
            System.out.println("Quantas amizades novas ela fez?");
            novasAmizadesCidade = scanner.nextInt();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Valor inválido, informe novamente...\n");
            scanner.next();
          }
        }

        alegria = alegria * novasAmizadesCidade;
      }

      // Segunda pergunta
      System.out.println("\nNa nova cidade Hilux fez 3 provas, A1, A2 e A3.");
      do {
        while (true) {
          try {
            System.out.println("Qual foi a nota da prova A1: ");
            notaA1 = scanner.nextInt();
            System.out.println("Qual foi a nota da prova A2: ");
            notaA2 = scanner.nextInt();
            System.out.println("Qual foi a nota da prova A3: ");
            notaA3 = scanner.nextInt();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Valor invalido, informe novamente...");
            scanner.next();
          }
        }

        if (notaA1 < 0 || notaA2 < 0 || notaA3 < 0 || notaA1 > 10 || notaA2 > 10 || notaA3 > 10) {
          System.out.println("Nota inválida, informe novamente...");
        }
      } while (notaA1 < 0 || notaA2 < 0 || notaA3 < 0 || notaA1 > 10 || notaA2 > 10 || notaA3 > 10);

      notaMed = ((notaA1 + notaA2 + notaA3) / 3);

      if (notaMed >= 7) {
        alegria += 50;
        System.out.println("Hilux está aprovada!");
      } else {
        tristeza += 50;
        System.out.println("Hilux não conseguiu ser aprovada");
      }

      // Terceira pergunta
      System.out.println("Agora, Hilux está estudando e tem 10 Algoritmos");
      do {

        while (true) {
          try {
            System.out.println("\nQuantos algoristmos Hilux conseguiu fazer:");
            algoritmosF = scanner.nextInt();
            break;
          } catch (InputMismatchException e) {
            System.out.println("Valor inválido, informe novamente...\n");
            scanner.next();
          }
        }

        if (algoritmosF < 0 || algoritmosF > 10) {
          System.out.println("Valor inválido, informe novamente...\n");
        }

      } while (algoritmosF < 0 || algoritmosF > 10);

      algoritmosNF = 10 - algoritmosF;
      algoritmosF = algoritmosF * 10;
      algoritmosNF = algoritmosNF * 10;
      alegria += algoritmosF;
      tristeza += algoritmosNF;

      // Resultados
      if (alegria > tristeza) {
        System.out.println("\nA mudança para a nova cidade foi uma experiência incrível para a Hilux.");
      } else {
        System.out.println("\nA mudança para a nova cidade foi uma experiência desagradável para a Hilux.");
      }

      System.out.println("\nHilux conseguiu : " +
          "\nAlegria: " + alegria +
          "\nTristeza: " + tristeza);
    }

  }
}
