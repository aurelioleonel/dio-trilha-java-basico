import java.util.Random;

public class Ex9_NumerosAleatorios {

    public static void main(String[] args) {

        /*
         * Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
         * armazene-os num vetor.
         * Ao final mostre os números e seus sucessores.
         */

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.print("Númros aleatorios: ");
        for (int numero : numerosAleatorios) {

            System.out.print(numero + " ");

        }

        System.out.print("\nSucessores dos números aleatorios: ");
        for (int numero : numerosAleatorios) {

            System.out.print(numero + 1 + " ");

        }

        System.out.print("\nAntecessores dos números aleatorios: ");
        for (int numero : numerosAleatorios) {

            System.out.print(numero - 1 + " ");

        }
        System.out.print("\n");

    }

}
