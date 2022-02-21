package one.digitalinnovation.Comparator.List;

import java.util.Comparator;

public class EstudanteComparatorList implements Comparator<EstudanteComparableList> {

    @Override
    public int compare(EstudanteComparableList aluno1, EstudanteComparableList aluno2) {
        return aluno1.getIdade() - aluno2.getIdade();
    }
}
