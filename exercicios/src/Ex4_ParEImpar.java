import java.util.Scanner;

public class Ex4_ParEImpar {

    /*
     * Faça um programa que peça N números inteiros,
     * calcule e mostre a quantidade de números pares
     * e a quantidade de números impares.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantPares = 0;
        int quantImpares = 0;
        int count = 0;
        int quantNumeros = 0;
        int numero = 0;
        System.out.println("Digite a quantidade de números ");
        quantNumeros = scan.nextInt();
        

        do {
            System.out.println("Digite um número.: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }

            count++;

        } while (count < quantNumeros);

        scan.close();

        System.out.println("Quantidade de pares.: " + quantPares);
        System.out.println("Quantidade de impares.: " + quantImpares);

    }

}
