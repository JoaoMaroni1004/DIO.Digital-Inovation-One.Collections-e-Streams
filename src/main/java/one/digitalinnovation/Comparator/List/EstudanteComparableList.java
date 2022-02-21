package one.digitalinnovation.Comparator.List;

public class EstudanteComparableList implements Comparable<EstudanteComparableList> {
    private final String nome;
    private final Integer idade;

    public EstudanteComparableList(String nome, Integer idade) {
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
        return "Estudante = " + "Nome: " + nome + ", idade: " + idade;
    }

    @Override
    public int compareTo(EstudanteComparableList o) {
        return this.getIdade() - o.getIdade();
    }
}
