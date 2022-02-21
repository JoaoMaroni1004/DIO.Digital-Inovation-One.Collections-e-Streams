package one.digitalinnovation.Comparator.ExComparator.Ex01List;

import java.util.Comparator;

public class Ex01ComparatorList implements Comparator<Ex01ComparableList> {

    @Override
    public int compare(Ex01ComparableList aluno1, Ex01ComparableList aluno2) {
        return aluno1.getIdade() - aluno2.getIdade();
    }
}
