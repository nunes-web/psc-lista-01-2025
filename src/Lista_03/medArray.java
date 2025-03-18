package Lista_03;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class medArray {

    public static void main(String[] args) {
        double[] num = new double[2];
        double big, small, medArt;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            num[0] = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            num[1] = scanner.nextDouble();

            big = Arrays.stream(num).max().getAsDouble();
            small = Arrays.stream(num).min().getAsDouble();
            medArt = Arrays.stream(num).average().getAsDouble();

            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            numberFormat.setMaximumFractionDigits(2);
            String bigFormat = numberFormat.format(big);
            String smallFormat = numberFormat.format(small);
            String medArtFormat = numberFormat.format(medArt);

            System.out.println("O maior número é: " + bigFormat);
            System.out.println("O menor número é: " + smallFormat);
            System.out.println("A média aritmética é: " + medArtFormat);
        }
    }
}
