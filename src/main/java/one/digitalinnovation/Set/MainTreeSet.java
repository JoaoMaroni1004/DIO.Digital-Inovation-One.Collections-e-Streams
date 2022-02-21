package one.digitalinnovation.Set;

import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        // Estanciar o método TREE SET
        TreeSet<String> treeCapitais = new TreeSet<>();
        // Montar a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        // Mostrar a árvore com as capitais
        System.out.println("Mostrar a árvore com as capitais: " + treeCapitais);

        // Mostar a primeira capital no topo da árvore: ");
        System.out.println("Mostar a primeira capital no topo da árvore: " + treeCapitais.first());

        // Mostrar a última capital no final da árvore
        System.out.println("Mostrar a última capital no final da árvore: " + treeCapitais.last());

        // Mostrar a primeira capital abaixo na árvore, da capital parametrizada
        System.out.println("Mostrar a primeira capital abaixo na árvore, da capital parametrizada: " + treeCapitais.lower("Florianópolis"));

        // Mostar a primeira capital acima na árvore, da capital parametrizada
        System.out.println("Mostar a primeira capital acima na arvore, da capital parametrizada: " + treeCapitais.higher("Florianópolis"));

        // Mostar todas as capitais no console
        System.out.println("Mostar todas as capitais no console: " + treeCapitais);

        // Mostrar a primeira capital no topo da árvore, removendo do Tree Set
        System.out.println("Mostrar a primeira capital no topo da árvore, removendo do Tree Set: " + treeCapitais.pollFirst());

        //Mostrar a última capital do final da árvore, removendo do Tree Set
        System.out.println("Mostrar a última capital do final da árvore, removendo do Tree Set: " + treeCapitais.pollLast());

        // Mostar todas as capitais no console
        System.out.println("Mostar todas as capitais no console: " + treeCapitais);
    }
}
