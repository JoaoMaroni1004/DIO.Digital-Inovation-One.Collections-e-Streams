package one.digitalinnovation.Comparator.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainEstudanteComparatorList {
    public static void main(String[] args) {
        // Instanciar o método List
        List<EstudanteComparableList> estudantes = new ArrayList<>();
        // Adicionar os elementos ao List
        estudantes.add(new EstudanteComparableList("Pedro", 19));
        estudantes.add(new EstudanteComparableList("Carlos", 23));
        estudantes.add(new EstudanteComparableList("Mariana", 21));
        estudantes.add(new EstudanteComparableList("João", 18));
        estudantes.add(new EstudanteComparableList("Thiago", 20));
        estudantes.add(new EstudanteComparableList("George", 22));
        estudantes.add(new EstudanteComparableList("Larissa", 21));

        System.out.println("Exibir de acordo com a ordem de inserção: " + estudantes);

        System.out.println("Exibir pela ordem natural dos números (idade):");
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        System.out.println("Exibir pela ordem inversa dos números (idade):");
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        System.out.println("Exibir pela ordem natural dos números (idade) - método reference:");
        estudantes.sort(Comparator.comparingInt(EstudanteComparableList::getIdade));
        System.out.println(estudantes);

        System.out.println("Exibir pela ordem inversa dos números (idade) - método reference:");
        estudantes.sort(Comparator.comparingInt(EstudanteComparableList::getIdade).reversed());
        System.out.println(estudantes);

        System.out.println("Exibir pela ordem natural dos números (idade) - interface Comparable:");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        System.out.println("Exibir pela ordem inversa dos números (idade) - interface Comparator:");
        Collections.sort(estudantes, new EstudanteComparatorList());
        System.out.println(estudantes);
    }
}
