import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) throws Exception {

        /*
         * Faça um programa que leia conjuntos de dois valores,
         * o primeiro representando o nome do aluno e o segundo representando a sua
         * idade.
         * (Pare o programa inserindo o valor 0 no campo nome)
         * 
         */

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        boolean sair = true;

        // System.out.println("Nome ");
        // nome = scan.next();

        // System.out.println("Idade ");
        // idade = scan.nextInt();

        while (sair) {

            System.out.println("Nome ");
            nome = scan.next();

            if (nome.equals("0")) {
                break;
            }

            System.out.println("Idade ");
            idade = scan.nextInt();

            System.out.println("Seu nome é  " + nome + " - Sua idade é " + idade);

            // break;

        }

        scan.close();

    }

}
