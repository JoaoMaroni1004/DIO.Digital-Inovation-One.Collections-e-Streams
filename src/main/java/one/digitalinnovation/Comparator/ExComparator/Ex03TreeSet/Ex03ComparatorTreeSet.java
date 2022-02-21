package one.digitalinnovation.Comparator.ExComparator.Ex03TreeSet;

import java.util.Comparator;

public class Ex03ComparatorTreeSet implements Comparator<Ex03ComparableTreeSet> {
    @Override
    public int compare(Ex03ComparableTreeSet aluno1, Ex03ComparableTreeSet aluno2) {
        return aluno1.getIdade() - aluno2.getIdade();
    }
}
