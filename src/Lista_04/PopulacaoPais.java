package Lista_04;

public class PopulacaoPais {

  public static void main(String[] args) {
    // Variáveis
    double popA = 80000, popB = 20000;
    int anos = 0;

    // Cálculo da população
    while (popB <= popA) {
      popA += popA * 0.015;
      popB += popB * 0.03;
      anos++;
    }

    System.out.println("Com a taxa de crescimento de 3% para país B, e 1,5% para país A, serão necessários " +
        anos + " anos para que a população do país B ultrapasse ou iguale a do país A.");
  }
}
