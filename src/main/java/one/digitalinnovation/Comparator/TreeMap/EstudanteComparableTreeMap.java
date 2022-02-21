package one.digitalinnovation.Comparator.TreeMap;

public class EstudanteComparableTreeMap implements Comparable<EstudanteComparableTreeMap> {
    private final String nome;
    private final Integer idade;

    public EstudanteComparableTreeMap(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Aluno = " + " nome: " + nome + ", idade: " + idade;
    }

    @Override
    public int compareTo(EstudanteComparableTreeMap aluno) {
        return this.getIdade() - aluno.getIdade();
    }
}
