package Lista_03;
//Spontaneous Craving Satisfaction Machine

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SCSMs {

    public static void main(String[] args) {
        Locale country = Locale.getDefault();
        String compra, notasFormat, valorCompraFormat;
        int precoSalg = 5, precoDoce = 8, precoSuco = 3, precoRefri = 10;
        int qtdSalg = 0, qtdDoce = 0, qtdSuco = 0, qtdRefri = 0;
        int valorCompra, valorPago, valorTroco, pedido;
        boolean finalCompra;
        int[] notas = {50, 20, 10, 5, 2, 1};
        int[] qtdNotas = new int[notas.length];

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(country);
        String precoSalgFormat = currencyFormat.format(precoSalg);
        String precoDoceFormat = currencyFormat.format(precoDoce);
        String precoSucoFormat = currencyFormat.format(precoSuco);
        String precoRefriFormat = currencyFormat.format(precoRefri);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nBem-vindo à Máquina de Satisfação de Desejos Espontâneos! S.C.S.M.\n"
                    + "Aqui você pode comprar salgados, doces, sucos e refrigerantes.\n\n"
                    + "===========================\n\n"
                    + "Aqui estão os preços dos produtos:\n"
                    + "[1] Salgado: " + precoSalgFormat + "\n"
                    + "[2] Doce: " + precoDoceFormat + "\n"
                    + "[3] Suco: " + precoSucoFormat + "\n"
                    + "[4] Refrigerante: " + precoRefriFormat + "\n\n"
                    + "===========================\n");

            do {
                System.out.println("Digite qual produto que deseja comprar [1 - 4]: ");
                pedido = scanner.nextInt();
                switch (pedido) {
                    case 1:
                        System.out.println("Digite a quantidade de salgados que deseja comprar: ");
                        qtdSalg = scanner.nextInt();
                        break;
                    case 2:
                        System.out.println("Digite a quantidade de doces que deseja comprar: ");
                        qtdDoce = scanner.nextInt();
                        break;
                    case 3:
                        System.out.println("Digite a quantidade de sucos que deseja comprar: ");
                        qtdSuco = scanner.nextInt();
                        break;
                    case 4:
                        System.out.println("Digite a quantidade de refrigerantes que deseja comprar: ");
                        qtdRefri = scanner.nextInt();
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

                System.out.println("Deseja comprar mais alguma coisa? [S / N]");
                compra = scanner.next();
                finalCompra = compra.equalsIgnoreCase("N");

            } while (finalCompra == false);

            valorCompra = (qtdSalg * precoSalg) + (qtdDoce * precoDoce) + (qtdSuco * precoSuco) + (qtdRefri * precoRefri);
            valorCompraFormat = currencyFormat.format(valorCompra);

            System.out.println("\n===========================\n\n"
                    + "O valor total da sua compra é: " + valorCompraFormat);

            System.out.println("Esta máquina aceita apenas as notas de: \n");
            for (int i = 0; i < notas.length; i++) {
                notasFormat = currencyFormat.format(notas[i]);
                System.out.println(notasFormat);
            }

            do {
                System.out.println("\nDigite o valor que deseja pagar: ");
                valorPago = scanner.nextInt();

                valorTroco = valorPago - valorCompra;
                if (valorTroco < 0) {
                    System.out.println("\nValor pago é insuficiente, tente novamente");
                }
            } while (valorTroco < 0);

            if (valorTroco == 0) {
                System.out.println("Parabéns, você não precisa de troco!");
            } else {

                for (int i = 0; i < notas.length; i++) {
                    qtdNotas[i] = (valorTroco / notas[i]);
                    valorTroco = valorTroco % notas[i];
                }
                System.out.println("\nSeu troco será:");
                for (int i = 0; i < notas.length; i++) {
                    if (qtdNotas[i] > 0) {
                        notasFormat = currencyFormat.format(notas[i]);
                        System.out.println(notasFormat + ": " + qtdNotas[i] + " nota(s)");
                    }
                }
            }

        }
    }
}
