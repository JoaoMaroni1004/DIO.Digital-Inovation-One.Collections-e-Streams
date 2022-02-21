package one.digitalinnovation.Comparator.TreeMap;

import java.util.Comparator;

public class EstudanteComparatorTreeMap implements Comparator<EstudanteComparableTreeMap> {
    @Override
    public int compare(EstudanteComparableTreeMap aluno1, EstudanteComparableTreeMap aluno2) {
        return aluno1.getIdade() - aluno2.getIdade();
    }
}
