package one.digitalinnovation.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainLinkedListQueue {
    public static void main(String[] args) {
        //Instanciar uma QUEUE - linkedList
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        // Mostrar os elementos da fila:
        System.out.println("Mostrar os elementos da fila: " + filaBanco);


        /*
        // Mostrar o primeiro elemento da fila e remove - lo (método poll)
        String clienteASerAtendido = filaBanco.poll();
        System.out.println("Mostrar o primeiro elemento da fila 'Pamela': " + clienteASerAtendido);
        // Mostrar os elementos da fila após a execução do método poll
        System.out.println("Mostrar os elementos da fila após a execução do método POLL:" );
        System.out.println(filaBanco);
        */

        // Mostrar o primeiro elemento da fila sem removê - lo (método peek)
        String primeiroCliente = filaBanco.peek();
        System.out.println("Mostrar o primeiro elemento da fila sem remove - lo (PEEK): " + primeiroCliente);
        System.out.println("Mostrar os elementos da fila após execução do método PEEK:");
        System.out.println(filaBanco);

        // Mostrar o primeiro elemento da fila sem removê - lo (método ELEMENT)
        ///filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println("Mostrar o primeiro elemento da fila sem remove - lo (ELEMENT): " + primeiroClienteOuErro);
        System.out.println("Mostrar os elementos da fila após execução do método ELEMENT: ");
        System.out.println(filaBanco);

        for (String cliente : filaBanco) {
            System.out.println("Itens da lista - método FOR EACH: " + cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while(iteratorFilaBanco.hasNext()){
            System.out.println("Itens da lista - método ITERATOR: " + iteratorFilaBanco.next());
        }

        //Mostrar o tamanho da fila
        System.out.println("Mostrar o tamanho da fila: " + filaBanco.size());

        //Remover (limpar) os elementos da fila
        System.out.println("Remover (limpar) os elementos da fila: ");

        //Verificar se a lista está vazia
        System.out.println("Verificar se a lista está vazia: " + filaBanco.isEmpty());
    }
}
