package one.digitalinnovation.Map;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        // Instanciar o método MAP (Hash Map) passando dois parâmetos (key(k) e value(v)
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();
        // Inserir os elementos no Hash Map
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println("Mostrar os elementos no Hash Map: " + campeoesMundialFifa);

        System.out.println("Atualizar o valor para a chave Brasil: " + campeoesMundialFifa.put("Brasil", 6));
        System.out.println("Mostrar os elemsntos no HashMap após atualizar: " + campeoesMundialFifa);

        System.out.println("Retornar a Argentina: " + campeoesMundialFifa.get("Argentina"));

        System.out.println("Retornar se existe ou não um campeão França: " + campeoesMundialFifa.containsKey("França"));

        System.out.println("Remover o campeão França: " + campeoesMundialFifa.remove("França"));

        System.out.println("Retornar se existe ou não um campeão França: " + campeoesMundialFifa.containsKey("França"));

        System.out.println("Retornar se existe ou não alguma seleção hexacampeã: " + campeoesMundialFifa.containsValue(6));

        System.out.println("Retornar o tamanho do mmapa: " + campeoesMundialFifa.size() + " elementos");

        // Navega no Hash Map pelo método Entry Set
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println("Campeões mundiais: " + entry.getKey() + ", titulos: " + entry.getValue());
        }
        System.out.println("\n");
        // Navega no Hash Map método key
        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println("Campeões Mundiais: " + key + ", títulos: " + campeoesMundialFifa.get(key));
        }
        System.out.println(campeoesMundialFifa);

        System.out.println("Verificar se o Hasp Map contém a chave 'Estados Unidos': " + campeoesMundialFifa.containsKey("Estados Unidos"));

        System.out.println("Verificar se o Hash Map contém a o valor '5': " + campeoesMundialFifa.containsValue(5));

        System.out.println("Verificar o tamanho antes de limpar o Hash Map: " + campeoesMundialFifa.size());
        campeoesMundialFifa.clear();

        System.out.println("Verificar o tamanho depois de limpar o Hash Map: " + campeoesMundialFifa.size());

    }
}
