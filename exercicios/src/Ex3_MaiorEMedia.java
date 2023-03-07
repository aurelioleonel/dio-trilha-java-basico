import java.util.Scanner;

public class Ex3_MaiorEMedia {
    /*
     * Faça um programa que leia 5 números
     * e informe o maior número
     * e a média desses números.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        double media = 0d;

        do {
            System.out.println("Digite um numero");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            count++;

            media += numero;

        } while (count < 5);

        media = media / count;

        System.out.println("O maior numero é.: " + maior + " e a media é " + media);

        scan.close();

    }

}
