public class OperadoresLogicos_II {

    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void ifFlecha() { // Efeito flesha

        int mes = 3;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    }
                }
            }
        }
    }

    private static void ifSemFlecha() { // Efeito sem flesha

        int mes = 3;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        }
    }

    private static void ifFerias() {

        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") { // metodo errado para uma só variavel
            System.out.println("Férias");
        }

        switch (mes) {
            case "julho":
                System.out.println("Férias no mês de.: " + mes);
                break;
            case "dezembro":
                System.out.println("Férias no mês de.: " + mes);
                break;
            case "janeiro":
                System.out.println("Férias no mês de.: " + mes);
                break;

            default:
                break;
        }
    }

    private static void ifMenor() {

        double salariMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salariMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxilio.");
        }

        boolean salarioBaixo = salariMensal < mediaSalario; // criar variaveis intermediarias
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxilio.");
        }

        boolean recebeAuxilo = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilo) {
            System.out.println("Funcionário deve receber auxilio.");
        } else {
            System.out.println("Funcionário não deve receber auxilio.");
        }

    }

    private static void switchSemana() {

        String dia = "Terça";
        switch (dia) {
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;

            default:
                break;
        }
    };

    private static void switchNumero() {

        int numero = 2;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;

            default:
                System.out.println("Valor indefinido");
                break;
        }

    };

    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Féria");
                break;
            default:
                System.out.println("Mês indefinido, veja a tabela de feria do seu setor");
                break;
        }

    };

}
