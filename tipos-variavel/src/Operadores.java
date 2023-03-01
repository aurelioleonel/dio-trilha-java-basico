public class Operadores {

    public static void main(String[] args) {

        String concatenacao = "?";

        System.out.println("Concatenação ' + ' ");

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        System.out.println("");
        System.out.println("Unarios");

        int numero = 5;
        numero = -numero; // Deixa o numero negativo
        System.out.println(numero);

        numero = numero * -1; // Deixa o numero positivo
        System.out.println(numero);

        System.out.println("");
        System.out.println("Incremento ++ --");
        numero++; // Incrementa
        System.out.println(numero);
        numero--; // Decrementa
        System.out.println(numero);

        System.out.println("");
        System.out.println("Boolean");
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        variavel = !variavel;

        System.out.println(variavel);

        System.out.println("");
        System.out.println("Ternário");
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        String resultado = (a == b) ? "verdadeiro" : "false";

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNARIO
        System.out.println(resultado);

        System.out.println("");
        System.out.println("Relacionais");
        int numero1 = 2;
        int numero2 = 1;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2 \n");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2 \n");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2 \n");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2 \n");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2 \n");

        System.out.println(" ");
        System.out.println("Boleanos");
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("Fim");

    }

}
