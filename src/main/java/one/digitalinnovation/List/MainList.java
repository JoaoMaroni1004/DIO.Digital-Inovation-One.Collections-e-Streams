package one.digitalinnovation.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        // Estanciar um array list
        List<String > nomes = new ArrayList<>();

        // Adicionar os elementos no array list
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        // Mostrar os nomes na ordem em ue foram inseridos
        System.out.println("Mostrar os elementos na ordem em que foram inseridos: " + nomes);


        // Alterar o elemento (index 2) de 'Juliana' para 'Larissa' e mostrar na ordem que foram inseridos
        nomes.set(2, "Larissa");
        System.out.println("Atualizar a lista com o novo elemento 'Larissa': " + nomes);


        // Mostrar os elementos em ordem alfabética
        Collections.sort(nomes);
        System.out.println("Mostrar os elementos em ordem alfabética: " + nomes);

        // Alterar o elemento (index 2) de 'Juliana' para 'Wesley' e mostrar os nomes em ordem alfabética
        nomes.set(2, "Wesley");
        System.out.println("Atualizar a lista com o novo elemento 'Wesley': " + nomes);

        // Remover o nome que está na posição 4 (index 4) 'Maria'
        nomes.remove(4);
        System.out.println("Remover o elemento que está na posição 4 (index 4) 'Maria': " + nomes);

        // Remover o elemento 'Wesley' que está na lista
        nomes.remove("Wesley");
        System.out.println("Remover o elemento 'Wesley' que está na lista: " + nomes);

        //Mostar o elemento que está na posição 1 (index 1) 'Carlos'
        String nome = nomes.get(1);
        System.out.println("Mostar o elemento que está na posição 1 (index 1) 'Carlos': " + nome);

        //Mostrar o tamanho da lista
        int tamanho = nomes.size();
        System.out.println("Mostrar o tamanho da lista:" + tamanho);

        //Remover o elemento 'Larissa' e mostrar o novo tamanho da lista
        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println("Remover o elemento 'Larissa' e mostrar o novo tamanho da lista: " + tamanho);

        //Verificar se existe um determinado elemento na lista: (retorna true ou false)
        boolean temObjeto = nomes.contains("Anderson");
        System.out.println("Verificar se existe um determinado elemento 'Anderson' na lista: " + temObjeto);
        temObjeto = nomes.contains("Fernando");
        System.out.println("Verificar se existe um determinado elemento 'Fernando' na lista: " + temObjeto);

        //Retornar em qual indice o elemento 'Carlos' está na lista (retorna index da lista)
        int posicao = nomes.indexOf("Carlos");
        System.out.println("Retornar em qual indice o elemento 'Carlos' está na lista: " + posicao);

        //Verificar se a lista está vazia: (retorna true ou false)
        //boolean listaVazia = false;
        boolean listaVazia = nomes.isEmpty();
        System.out.println("Verificar se a lista está vazia: " + listaVazia);

        /* Exibir os elementos da lista usando FOR EACH
        FOR EACH - recebe dois argumentos:
        1º - declaração de uma variável que não exiata no escopo do código
        2º - lista ou coleção de elementos
        */
        for (String nomeDoItem /*1º argumento*/: nomes /*2º argumento*/){
            System.out.println("Itens da lista FOR EACH: " + nomeDoItem);
        }

        //Exibir os elementos da lista usando Iterator:
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){/* hasNext -> retorna true sempre que houver mais um elemento na coleção*/
            //next -> retorna o elemento que esta sendo iterado no momento
            System.out.println("Itens da lista ITERATOR: " + iterator.next());
        }

        //Remover os elementos da lista (limpar) e verificar se está vazia
        nomes.clear();
        //listaVazia = true;
        listaVazia = nomes.isEmpty();
        System.out.println("Remover os elementos da lista (limpar), e verificar se está vazia:" + listaVazia);

    }
}
