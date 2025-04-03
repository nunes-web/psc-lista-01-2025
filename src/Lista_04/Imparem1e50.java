package Lista_04;

public class Imparem1e50 {
  public static void main(String[] args) {
    System.out.println("Números ímpares entre 1 e 50:");

    // Calculo de numeros impar
    for (int i = 1; i <= 50; i++) {
      if (i % 2 != 0) {
        System.out.print(i + ", ");
      }
    }
  }
}
