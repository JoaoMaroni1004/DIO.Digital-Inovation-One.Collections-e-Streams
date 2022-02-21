package one.digitalinnovation.Set;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        // Estanciar o método HASHSET
        Set<Double> notasAlunos = new HashSet<>(){{
           add(05.8);
           add(09.3);
           add(06.5);
           add(10.0);
           add(05.4);
           add(07.3);
           add(03.8);
           add(04.0);
        }};

        // Mostrar a lista HASHSET em ordem aleatória
        System.out.println("Mostrar a lista HASHSET em ordem aleatória: " + notasAlunos);

        // Remover a nota '3.8' do set
        System.out.println("\n");
        System.out.println("Remover a nota '3.8' do set: " + notasAlunos.remove(3.8));
        System.out.println("Mostrar a lista HASHSET após remover: " + notasAlunos);

        //Mostrar a quantidade de itens do set (tamanho):
        System.out.println("\n");
        System.out.println("Mostrar a quantidade de itens do set (tamanho): " + notasAlunos.size());

        // Navegar em todos os itens do ITERATOR:
        System.out.println("\n");
        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println("Itens da lista ITERATOR: " + iterator.next());
        }
            System.out.println("\n");
        // Navegar pelos itens da lista  - FOR EACH
        for (Double nota: notasAlunos) {
            System.out.println("Itens da lista FOR EACH: " + nota);
        }

        // Remover os elementos do set
        System.out.println("\n");
        System.out.println("Remover os elementos do set: ");

        // Remover os elementos do Hash Set
        notasAlunos.clear();

        //Mostrar se o set está ou não vazio
        System.out.println("\n");
        System.out.println("Mostrar se o set está ou não vazio: "  + notasAlunos.isEmpty());
    }
}
