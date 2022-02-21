package one.digitalinnovation.Comparator.ExComparator.Ex02TreeMap;

public class Ex02ComparableTreeMap implements Comparable<Ex02ComparableTreeMap>{
    private final String nome;
    private final Integer idade;

    public Ex02ComparableTreeMap(String nome, Integer idade) {
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
        return "Aluno = " + " Nome: " + nome + ", Idade: " + idade;
    }

    @Override
    public int compareTo(Ex02ComparableTreeMap aluno) {
        return this.getIdade() - aluno.getIdade();
    }
}
