package Lista_03;
//Spontaneous Craving Satisfaction Machine

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SCSMs {

    public static void main(String[] args) {
        Locale country = Locale.getDefault();
        String compra, notasFormat, valorCompraFormat, cancelarS;
        int precoSalg = 5, precoDoce = 8, precoSuco = 3, precoRefri = 10;
        int qtdSalg = 0, qtdDoce = 0, qtdSuco = 0, qtdRefri = 0;
        int valorCompra, valorPago, valorTroco, pedido;
        boolean finalCompra, cancelarPedido;
        int[] notas = { 50, 20, 10, 5, 2, 1 };
        int[] qtdNotas = new int[notas.length];

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(country);
        String precoSalgFormat = currencyFormat.format(precoSalg);
        String precoDoceFormat = currencyFormat.format(precoDoce);
        String precoSucoFormat = currencyFormat.format(precoSuco);
        String precoRefriFormat = currencyFormat.format(precoRefri);

        try (Scanner scanner = new Scanner(System.in)) {
            // Menu inicial da SCSMs
            do {
                System.out.println("\nBem-vindo à Máquina de Satisfação de Desejos Espontâneos! S.C.S.M.\n"
                        + "Aqui você pode comprar salgados, doces, sucos e refrigerantes.\n\n"
                        + "=====================================\n\n"
                        + "Aqui estão os preços dos produtos:\n"
                        + "[1] Salgado: " + precoSalgFormat + "\n"
                        + "[2] Doce: " + precoDoceFormat + "\n"
                        + "[3] Suco: " + precoSucoFormat + "\n"
                        + "[4] Refrigerante: " + precoRefriFormat + "\n\n"
                        + "=====================================\n");

                // Escolha do produto
                do {
                    while (true) {
                        try {
                            System.out.println("Digite qual produto que deseja comprar [1 - 4]: ");
                            pedido = scanner.nextInt();
                            if (pedido < 1 || pedido > 4) {
                                System.out.println(
                                        "Opção inválida...");
                                continue;
                            }
                            break;
                        } catch (InputMismatchException notInt) {
                            System.out.println(
                                    "Entrada inválida... ");
                            scanner.next();
                        }

                    }

                    switch (pedido) {
                        case 1:
                            while (true) {
                                try {
                                    System.out.println("Digite a quantidade total de salgados que deseja comprar: ");
                                    qtdSalg = scanner.nextInt();
                                    break;
                                } catch (InputMismatchException notInt) {
                                    System.out.println(
                                            "Entrada inválida... ");
                                    scanner.next();
                                }
                            }
                            break;
                        case 2:
                            while (true) {
                                try {
                                    System.out.println("Digite a quantidade total de doces que deseja comprar: ");
                                    qtdDoce = scanner.nextInt();
                                    break;
                                } catch (InputMismatchException notInt) {
                                    System.out.println(
                                            "Entrada inválida... ");
                                    scanner.next();
                                }
                            }
                            break;
                        case 3:
                            while (true) {
                                try {
                                    System.out.println("Digite a quantidade total de sucos que deseja comprar: ");
                                    qtdSuco = scanner.nextInt();
                                    break;
                                } catch (InputMismatchException notInt) {
                                    System.out.println(
                                            "Entrada inválida... ");
                                    scanner.next();
                                }
                            }
                            break;
                        case 4:
                            while (true) {
                                try {
                                    System.out
                                            .println("Digite a quantidade total de refrigerantes que deseja comprar: ");
                                    qtdRefri = scanner.nextInt();
                                    break;
                                } catch (InputMismatchException notInt) {
                                    System.out.println(
                                            "Entrada inválida... ");
                                    scanner.next();
                                }
                            }
                            break;
                        default:
                            System.out.println("Opção inválida...");
                    }

                    System.out.println("Deseja comprar mais alguma coisa? [S / N]");
                    compra = scanner.next();
                    finalCompra = compra.equalsIgnoreCase("N");

                } while (finalCompra == false);

                // Calculo do total da compra
                valorCompra = (qtdSalg * precoSalg) + (qtdDoce * precoDoce) + (qtdSuco * precoSuco)
                        + (qtdRefri * precoRefri);
                valorCompraFormat = currencyFormat.format(valorCompra);

                System.out.println("\n=====================================\n\n"
                        + "O valor total da sua compra é: " + valorCompraFormat);

                System.out.println("Esta máquina aceita apenas as notas de: \n");
                for (int i = 0; i < notas.length; i++) {
                    notasFormat = currencyFormat.format(notas[i]);
                    System.out.println(notasFormat);
                }

                System.out.println("\nDeseja continuar sua compra [S / N]");
                cancelarS = scanner.next();
                cancelarPedido = cancelarS.equalsIgnoreCase("N");

                if (cancelarPedido == true) {
                    System.out.println("\nSeu pedido foi cancelado..." +
                            "\n\n=====================================\\n\\n");
                }
            } while (cancelarPedido == true);

            // Pagamento e calculo de troco
            do {
                while (true) {
                    try {
                        System.out.println("\nDigite o valor que deseja pagar: ");
                        valorPago = scanner.nextInt();
                        break;
                    } catch (InputMismatchException notInt) {
                        System.out.println(
                                "Entrada inválida... ");
                        scanner.next();
                    }
                }

                valorTroco = valorPago - valorCompra;
                if (valorTroco < 0) {
                    System.out.println("\nValor pago é insuficiente, tente novamente");
                }
            } while (valorTroco < 0);

            if (valorTroco == 0) {
                System.out.println("\n=====================================\n\n" +
                        "Parabéns, você não precisa de troco!");
            } else {

                for (int i = 0; i < notas.length; i++) {
                    qtdNotas[i] = (valorTroco / notas[i]);
                    valorTroco = valorTroco % notas[i];
                }
                System.out.println("\n=====================================\n\n" +
                        "Seu troco será: ");
                for (int i = 0; i < notas.length; i++) {
                    if (qtdNotas[i] > 0) {
                        notasFormat = currencyFormat.format(notas[i]);
                        System.out.println(notasFormat + ": " + qtdNotas[i] + " nota(s)");
                    }
                }
            }
            System.out.println("Compra finalizada, volte sempre!\n"
                    + "\n=====================================\n");

        }
    }
}
