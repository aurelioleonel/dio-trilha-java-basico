public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        int idade = 15;
        // Operadores de comparação: <>,=, <=, >=, !, !=
        if (idade >= 18) {
            System.out.println("Pode entrar na festa.");
        } else {
            System.out.println("Não pode entrar na festa.");
        }

        boolean festaDoMeuAmigo = true;
        if (idade >= 18 || festaDoMeuAmigo) {
            System.out.println("Pode entrar na festa.");
        } else if (idade >= 15) {
            System.out.println("Pode entrar acompanhado com adulto.");
        } else {
            System.out.println("Não pode entrar na festa.");
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("i incrementa: " + i);
        }
        for (int i = 20; i > 0; i--) {
            System.out.println("i decrementa: " + i);
        }

        for (int i = 1; i < 100; i++) {
            if (i % 20 == 0) {
                System.out.println("i:" + i);
                break;
            }
        }

        for (int i = 0; i < 100; i++) {
            if (i >= 50 && i <= 70) {
                continue;
            }
            System.out.println("i: " + i);
        }

        int contador = 0;
        while (contador < 20) {
            System.out.println("Contador: " + contador);
            contador = contador + 1;
        }

        int contadorInverso = 100;
        while (contadorInverso > 20) {
            System.out.println("Contador Inverso: " + contadorInverso);
            contadorInverso = contadorInverso - 1;
        }

    }
}
