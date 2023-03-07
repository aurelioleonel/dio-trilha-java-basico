import java.util.*;

public class Ex7_OrdemInversa {

    public static void main(String[] args) {
        /*
         * Crie um vetor de 6 números inteiros
         * e mostre-os na ordem inversa.
         */

        int[] vetor = { 0, 1, 2, 3, 4, 5 };
        String vetorInverso = "";

        System.out.println(Arrays.toString(vetor)); // mostra todos itens de um vetor

        vetorInverso = vetorInverso + ("[");
        for (int i = vetor.length - 1; i >= 0; i--) { // invertendo o vetor

            if (i > 0) {
                vetorInverso = vetorInverso + vetor[i] + ", ";
            } else {
                vetorInverso = vetorInverso + vetor[i];
            }

        }
        vetorInverso = vetorInverso + ("]");
        System.out.println(vetorInverso);

    }

}
