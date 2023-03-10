public class App {
    public static void main(String[] args) throws Exception {

        Pilha minhaPilha = new Pilha();

        int i = 1;

        while (i <= 6) {
            minhaPilha.push(new No(i));
            // System.out.println(minhaPilha);
            i++;
        }

        // minhaPilha.push(new No(1));
        // minhaPilha.push(new No(2));
        // minhaPilha.push(new No(3));
        // minhaPilha.push(new No(4));
        // minhaPilha.push(new No(5));
        // minhaPilha.push(new No(6));

        // Mostrando todos os dados da pilha
        System.out.println(minhaPilha);

        // excluido o item da pilha
        System.out.println(minhaPilha.pop());

        // Mostrando todos os dados da pilha apos a exclusão
        System.out.println(minhaPilha);

        // adicionando o item 6
        minhaPilha.push(new No(6));

        // Mostrando todos os dados apos a inclusão do item 6
        System.out.println(minhaPilha);

    }
}
