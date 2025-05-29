import javax.swing.JOptionPane;

public class teste {

  public static void main(String[] args) {
    int num1, num2;
    String n1, n2, n3;

    while (true) {
      try {
        n1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        n2 = JOptionPane.showInputDialog("Digite o primeiro número: ");

        num1 = Integer.parseInt(n1);
        num2 = Integer.parseInt(n2);

        if (num1 == num2) {
          JOptionPane.showMessageDialog(null, "Os números são iguais.");
        } else {
          JOptionPane.showMessageDialog(null,
              "O número " + Math.max(num1, num2) + " é maior que " + Math.min(num1, num2));
        }
        break;
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida, tente novamente...");

      }

    }

  }

}
