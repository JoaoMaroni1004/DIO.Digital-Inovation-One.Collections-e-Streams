package one.digitalinnovation.Comparator.TreeMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MainEstudanteComparatorTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> estudantes = new TreeMap<>();
        estudantes.put("Pedro", 21);

        System.out.println("Exibir os elementos da TreeMap" + estudantes);

        System.out.println("Exibir pela ordem numérica (idade):");
    }
}
