package one.digitalinnovation.Map;

import java.util.HashMap;
import java.util.Map;

/*
Criar um Map e executar as seguintes operações:
01 - Adicionar os 26 estados brasieiros no Map, onde:
    1 - a sigla será a chave
    2 - o estado será o valor
02 - Remover o estado de Minas Gerais
03 - Adicionar o Distrito Federal
04 - Verificar o tamanho do mapa
05 - Remover o estado de Mato Grosso do Sul usando o nome
06 - Navegar em todos os registros do mapa, mostrando no console
     o seguinte formato: NOME (SIGLA)
07 - Verificar se o estado de Santa Catarina existe no mapa buscando por sua sigla
08 - Verifique se o estado do Maranhão existe no map buscando por seu nome
*/
public class Ex01HashMap {
    public static void main(String[] args) {
// [ok] Criar um Map e executar as seguintes operações:
        HashMap<String, String> estadosBrasil = new HashMap<>();
// 01 [] - Adicionar os 26 estados brasieiros no Map, onde:
        // 1 - a sigla será a chave
        // 2 - o estado será o valor
        estadosBrasil.put("AC", "Acre");
        estadosBrasil.put("TO", "Tocantins");
        estadosBrasil.put("SE", "Sergipe");
        estadosBrasil.put("AL", "Alagoas");
        estadosBrasil.put("AP", "Amapá");
        estadosBrasil.put("SP", "São Paulo");
        estadosBrasil.put("SC", "Santa Catarina");
        estadosBrasil.put("AM", "Amazonas");
        estadosBrasil.put("BA", "Bahia");
        estadosBrasil.put("CE", "Ceará");
        estadosBrasil.put("RS", "Rio Grande do Sul");
        estadosBrasil.put("MA", "Maranhão");
        estadosBrasil.put("RN", "Rio Grande do Norte");
        estadosBrasil.put("ES", "Espírito Santo");
        estadosBrasil.put("GO", "Goiás");
        estadosBrasil.put("RJ", "Rio de Janeiro");
        estadosBrasil.put("RO", "Rondonia");
        estadosBrasil.put("RR", "Roraima");
        estadosBrasil.put("MT", "Mato Grosso");
        estadosBrasil.put("PI", "Piauí");
        estadosBrasil.put("MS", "Mato Grosso do Sul");
        estadosBrasil.put("PE", "Pernanbuco");
        estadosBrasil.put("MG", "Minas Gerais");
        estadosBrasil.put("PA", "Pará");
        estadosBrasil.put("PR", "Paraná");
        estadosBrasil.put("PB", "Paraíba");
//Fonte: https://www.migalhas.com.br/coluna/gramatigalhas/127056/siglas-dos-estados-brasileiros em 21/02/2022

// 02 [ok] - Remover o estado de Minas Gerais
        estadosBrasil.remove("MG");
        System.out.println("Remover o estado de Minas Gerais: " + estadosBrasil);
// 03 [ok] - Adicionar o Distrito Federal
        System.out.println("Adicionar o Distrito Federal: " + estadosBrasil.put("DF", "Distrito Federal"));
        System.out.println("Adicionar o Distrito Federal: " + estadosBrasil);
// 04 [ok] - Verificar o tamanho do mapa
        System.out.println("Verificar o tamanho do mapa: " + estadosBrasil.size());
// 05 [ok] - Remover o estado de Mato Grosso do Sul usando o nome
        System.out.println("Remover o estado de Mato Grosso do Sul usando o nome: " + estadosBrasil.remove("MS", "Mato Grosso do Sul"));
        System.out.println("Remover o estado de Mato Grosso do Sul usando o nome: " + estadosBrasil);
// 06 [ok] - Navegar em todos os registros do mapa, mostrando no console o seguinte formato: NOME (SIGLA)
        for (Map.Entry<String, String> entry : estadosBrasil.entrySet()) {
            System.out.println("Nome: " + entry.getValue() +  ", (Sigla): " + entry.getKey() );
        }
// 07 [ok] - Verificar se o estado de Santa Catarina existe no mapa buscando por sua sigla
        System.out.println("Verificar se o estado de Santa Catarina existe no mapa buscando por sua sigla: " + estadosBrasil.containsKey("SC"));
// 08 [ok] - Verifique se o estado do Maranhão existe no map buscando por seu nome
        System.out.println("Verifique se o estado do Maranhão existe no map buscando por seu nome: " + estadosBrasil.containsValue("Maranhão"));
    }
}
