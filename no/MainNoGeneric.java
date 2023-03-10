public class MainNoGeneric {
    public static void main(String[] args) {

        NoGeneric<String> no1 = new NoGeneric<String>("Conteudo No1");
        NoGeneric<String> no2 = new NoGeneric<String>("Conteudo No2");

        no1.setProximoNo(no2);

        NoGeneric<String> no3 = new NoGeneric<String>("Conteudo no3");
        no2.setProximoNo(no3);

        NoGeneric<String> no4 = new NoGeneric<String>("Conteudo no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println(no2.getProximoNo());
        System.out.println(no3);
        System.out.println(no3.getProximoNo());
        System.out.println(no4);
        System.out.println(no4.getProximoNo());

        System.out.println("----------------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        // System.out.println(no1);

    }
}
