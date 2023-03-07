import java.util.Scanner;

public class Ex5_Tabuada {
    /*
     * Desenvolva um gerador de tabuada,
     * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
     * O usuário deve informar de qual numero ele deseja ver a tabuada.
     * A saída deve ser conforme o exemplo abaixo:
     * Tabuada de 5:
     * 5 X 1 = 5
     * 5 X 2 = 10
     * ...
     * 5 X 10 = 50
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da tabuada.:");

        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);

        for (int x = 1; x <= 10; x++) {
            System.out.println("  " + numero + " X " +
                    String.format("%02d", x) +
                    " = " + String.format("%02d", numero * x));

        }

        scan.close();

    }
}
