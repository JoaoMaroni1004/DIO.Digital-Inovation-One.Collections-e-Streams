package one.digitalinnovation.Comparator.ExComparator.Ex01List;

public class Ex01ComparableList implements Comparable<Ex01ComparableList> {
    private final String nome;
    private final Integer idade;

    public Ex01ComparableList(String nome, Integer idade) {
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
        return "Aluno = " + "Mome: " + nome + ", Idade: " + idade;
    }

    @Override
    public int compareTo(Ex01ComparableList aluno) {
        return this.getIdade() - aluno.getIdade();}
}
