package Lista_02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Eurotrip {
  public static void main(String[] args) {
    double tripPriceDE, tripPricePT, tripPriceIT, travelers, totalPrice;
    Locale country = Locale.getDefault();

    try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("Digite o preço da viagem para Alemanha (valor em sua moeda local): ");
      tripPriceDE = scanner.nextDouble();
      System.out.println("Digite o preço da viagem para Portugal (valor em sua moeda local): ");
      tripPricePT = scanner.nextDouble();
      System.out.println("Digite o preço da viagem para Itália (valor em sua moeda local): ");
      tripPriceIT = scanner.nextDouble();
      System.out.println("Digite a quantidade de viajantes: ");
      travelers = scanner.nextDouble();

      totalPrice = (tripPriceDE + tripPricePT + tripPriceIT) * travelers;

      NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(country);
      String formatTotalPrice = currencyFormat.format(totalPrice);

      System.out.println("O valor total da viagem para " + travelers + " viajantes é: \n" + formatTotalPrice);
    }
  }
}