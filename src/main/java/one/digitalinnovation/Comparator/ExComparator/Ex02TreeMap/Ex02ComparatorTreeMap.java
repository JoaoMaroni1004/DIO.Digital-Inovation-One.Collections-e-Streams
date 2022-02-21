package one.digitalinnovation.Comparator.ExComparator.Ex02TreeMap;

import java.util.Comparator;

public class Ex02ComparatorTreeMap implements Comparator<Ex02ComparableTreeMap> {

    @Override
    public int compare(Ex02ComparableTreeMap aluno1, Ex02ComparableTreeMap aluno2) {
        return aluno1.getIdade() - aluno2.getIdade();
    }
}
