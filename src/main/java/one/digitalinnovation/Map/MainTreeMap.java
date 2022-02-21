package one.digitalinnovation.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainTreeMap {
    public static void main(String[] args) {
        // Instanciar o método Tree Map
        TreeMap<String, String > treeCapitais = new TreeMap<>();

        //Montar a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");

        System.out.println("Mostrar a árvore depois de montada: " + treeCapitais);

        // Retornar a primeira capital no topo da árvore (método first key)
        System.out.println("Retornar a primeira capital no topo da árvore: " + treeCapitais.firstKey());

        // Retornar a última capital no final da arvore (método last key)
        System.out.println("Retornar a última capital no final da arvore: " + treeCapitais.lastKey());

        System.out.println("Retornar a primeira capital abaixo na árvore, da capital parametrizada: " + treeCapitais.lowerKey("SC"));

        System.out.println("Retornar a primeira capital acima na arvore, da capital parametrizada: " + treeCapitais.higherKey("SC"));

        System.out.println("Mostrar todas as capitais no console: " + treeCapitais);

        System.out.println("Retornar a primeira capital no topo da árvore (método first entry (get key - get value): ");
        System.out.println("Estado: " + treeCapitais.firstEntry().getKey() + ", Capital: " + treeCapitais.firstEntry().getValue());

        System.out.println("Retornar as capitais: " + treeCapitais);

        System.out.println("Retornar a última capital no final da arvore (método last entry (get key - get value): ");
        System.out.println("Estado: " + treeCapitais.lastEntry().getKey() + ", Capital: " + treeCapitais.lastEntry().getValue());
        System.out.println("Retornar as capitais: " + treeCapitais);

        System.out.println("Retornar a primeira capital no topo da árvore (método map entry (first entry - poll first entry) - com remoção:");
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        System.out.println("Estado: " + firstEntry.getKey() + ", Capital: " + firstEntry.getValue());

        System.out.println("Retornar a última capital no final da arvore (método map entry (last entry - poll last entry) - com remoção:");
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
        System.out.println("Estado: " + lastEntry.getKey() + ", Capital: " + lastEntry.getValue());

        System.out.println("Retornar as capitais depois de remover: " + treeCapitais);

        System.out.println("\n");

        System.out.println("Percorrer a Tree Map - método iterator:");
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("Estado: " + key + ", Capital: " + treeCapitais.get(key));
        }
        System.out.println("\n");

        System.out.println("Percorrer a Tree Map - método for each (key set):");
        for (String capital : treeCapitais.keySet()) {
            System.out.println("Estado: " + capital + ", Capital: " + treeCapitais.get(capital));
        }
        System.out.println("\n");

        System.out.println("Percorrer a Tree Map - método for each (map entry)");
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println("Estado: " + capital.getKey() + ", Capital: " + capital.getValue());
        }
    }
}
