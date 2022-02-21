package one.digitalinnovation.Comparator.ExComparator.Ex03TreeSet;

public class Ex03ComparableTreeSet implements Comparable<Ex03ComparableTreeSet> {
    private final String nome;
    private final Integer idade;

    public Ex03ComparableTreeSet(String nome, Integer idade) {
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
        return "Aluno = " + "Nome: " + nome + ", Idade: " + idade;
    }

    @Override
    public int compareTo(Ex03ComparableTreeSet aluno) {
        return this.getIdade() - aluno.getIdade();
    }
}
