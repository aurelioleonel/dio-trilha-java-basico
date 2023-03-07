import java.util.Random;

public class Ex10_ArrayMultidimensional {

    /*
     * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
     */

    public static void main(String[] args) {

        Random random = new Random();

        String[][] MeuArray = new String[15][15];

        for (int i = 0; i < MeuArray.length; i++) {

            for (int j = 0; j < MeuArray[i].length; j++) {
                MeuArray[i][j] = String.format("%02d", random.nextInt(25));
            }

        }
        System.out.println("Matriz: ");
        for (String[] linha : MeuArray) {

            for (String coluna : linha) {

                System.out.print(coluna + " ");

            }

            System.out.println("");
        }

    }

}
