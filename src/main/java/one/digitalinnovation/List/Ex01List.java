package one.digitalinnovation.List;
/*
Crie uma lista e execite as seguintes operações:
01 - adicionar 5 nomes: Juliana. Pedro, Carlos, Larissa e João
02 - navegar na lista exibindo cada nome no console
03 - substituir o nome Carlos por Roberto
04 - retornar o nome da posição 1
05 - retornar o nome da posição 4
06 - remover o nome joão
07 - retornar a quantidade de itens da lista
08 - verificar se o nome Juliano existe na lista
09 - criar uma nova lista com os nomes: Ismael e Rodrigo
     adicionar todos os itens na nova lista criada
10 - ordenar os itens da lista por ordem alfabética
11 - verificar se a lista está vazia
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ex01List {
    public static void main(String[] args) {
    // [ok] - Criar uma lista e execite as seguintes operações:
    // 01 [ok] - adicionar 5 nomes: Juliana. Pedro, Carlos, Larissa e João
        List<String> novaLista1 = new ArrayList<>();
        novaLista1.add("Juliana");
        novaLista1.add("Pedro");
        novaLista1.add("Carlos");
        novaLista1.add("Larissa");
        novaLista1.add("João");
        System.out.println(novaLista1);
    // 02 [ok] - navegar na lista exibindo cada nome no console
        Iterator<String> iterator = novaLista1.iterator();
        while(iterator.hasNext()){
            System.out.println("Itens da lista: " + iterator.next());
        }
    // 03 [ok] - substituir o nome Carlos por Roberto
        novaLista1.set(2, "Roberto");
            System.out.println("Substituir o nome Carlos por Roberto: " + novaLista1);
    // 04 [ok] - retornar o nome da posição 1
        String novaLista = novaLista1.get(1);
        System.out.println("Retornar o nome da posição index 1: " + novaLista1);
    // 05 [ok] - remover o nome da posição 4
        novaLista1.remove(4);
        System.out.println("Remover o nome da posição index 4: " + novaLista1);
    // 06 [ok] - remover o nome joão
        novaLista1.remove("João");
        System.out.println("Remover o nome João: " + novaLista1);
    // 07 [ok] - retornar a quantidade de itens da lista
        System.out.println("Retornar a quantidade de itens da lista: " + novaLista1.size());
    // 08 [ok] - verificar se o nome Juliano existe na lista
        boolean temNome = novaLista1.contains("Juliano");
        System.out.println("Verificar se o nome Juliano existe na lista: " + temNome);
    // 09 [ok] - criar uma nova lista com os nomes: Ismael e Rodrigo adicionar todos os itens na nova lista criada
        List<String> novaLista2 = new ArrayList<>();
        novaLista2.add("Ismael");
        novaLista2.add("Rodrigo");
        novaLista1.addAll(novaLista2); // adiciona tudo o que está na lista 1 e insere na lista 2
        System.out.println(novaLista2);
    // 10 [ok] - ordenar os itens da lista por ordem alfabética
        Collections.sort(novaLista1);
        System.out.println(novaLista1);
    // 11 [ok] - verificar se a lista está vazia
        boolean listaVazia = novaLista1.isEmpty();
        System.out.println("Verificar se a lista está vazia:  " + listaVazia);
    }
}
