package one.digitalinnovation.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainLinkedHashSet {
    public static void main(String[] args) {
        // Instanciar o método LINKED HASH SET
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicionar os elementos no LINKED HASH SET
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        // Mostrar o Linked Hash Set na ordem de inserção
        System.out.println("Mostrar o Linked Hash Set na ordem de inserção: " + sequenciaNumerica);

        // Remover o elemento do '4' set
        System.out.println("\n");
        System.out.println("Remover o elemento do '4' set: " + sequenciaNumerica.remove(4));
        System.out.println("Mostrar o Linked Hash Set após a remoção do elemento: " + sequenciaNumerica);

        // Navegar em todos os itens pelo método iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        System.out.println("\n");
        while (iterator.hasNext()){
            System.out.println("Itens da Linked Hash Set: " + iterator.next());
        }

        // Navegar em todos os itens pelo método FOR EACH
        System.out.println("\n");
        for (Integer numero : sequenciaNumerica){
            System.out.println("Itens da Linked Hash Set: " + numero);
        }

        // Remover os elementos da Linked Hash Set
        sequenciaNumerica.clear();

        //Verificar se a lista está vazia
        System.out.println("\n");
        System.out.println("Verificar se a lista está vazia: " + sequenciaNumerica.isEmpty());
    }
}
