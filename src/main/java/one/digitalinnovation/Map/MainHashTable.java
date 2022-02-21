package one.digitalinnovation.Map;

import java.util.Hashtable;
import java.util.Map;

public class MainHashTable {
    public static void main(String[] args) {
        // Instanciar a Hash Table
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        // Inserir os elementos na Hash Table
        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 21);

        System.out.println("Mostrar a Hash Table após a inserção: " + estudantes);

        System.out.println("Altera chave 'Pedro' de 21 para 55: " + estudantes.put("Pedro", 55));
        System.out.println("Mostrar a Hash Table após a alteração: " + estudantes);

        System.out.println("Remover o estudante do indice 0: " + estudantes.remove("Pedro"));
        System.out.println("Mostrar a Hash Table após a remoção: " + estudantes);

        // Recuperar o estudante do índice 2
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println("Recuperar o estudante do índice 2: " + idadeEstudante);
        System.out.println("Mostrar a Hash Table após a recuperação: " + estudantes);

        System.out.println("Exibir o tamanho do Hash Table: " + estudantes.size());

        System.out.println("Percorrer a Hash table - método for each (key set):");
        for (String key : estudantes.keySet()) {
            System.out.println("Aluno: " + key + ", Idade: " + estudantes.get(key));
        }
        System.out.println("Mostrar a Hash Table após a percorrer: " + estudantes);
        System.out.println("\n");

        System.out.println("Percorrer a Tree Map - método for each (map entry)");
        for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
            System.out.println("Aluno: " + entry.getKey() + ", Idade: " + entry.getValue());
        }
        System.out.println("Mostrar a Hash Table após a percorrer: " + estudantes);
    }
}
