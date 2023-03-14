package one.digitalinovation;

//import java.util.ArrayList;
//import java.util.List;

import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();


        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeut"))); //casso não adicione retorna um erro
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault"))); //caso não adicione retorma false
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); //pega o primeiro da fila mas não remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); //pega o primeiro e remove
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());








    }
}
