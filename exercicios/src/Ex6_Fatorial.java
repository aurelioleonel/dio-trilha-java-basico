import java.util.Scanner;

public class Ex6_Fatorial {
    /*
     * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
     * usuário.
     * Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");

        int numero = scan.nextInt();
        int fatorial = 1;
        int meuNumero = numero;

        System.out.println("O fatorial de " + meuNumero + " com while");
        while (numero >= 1) {
            fatorial = fatorial * numero;
            numero--;
        }
        System.out.println("O fatprial de.: " + meuNumero + " é " + fatorial);

        System.out.println("");
        System.out.println("O fatorial de " + meuNumero + " com for");
        for (int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatprial de.: " + meuNumero + " é " + fatorial);

        // for (int x = numero; numero >= 0; numero--) {

        // System.out.println("Variavel x " + x);
        // System.out.println("Variavel numero " + numero);

        // }

        scan.close();

    }

}
