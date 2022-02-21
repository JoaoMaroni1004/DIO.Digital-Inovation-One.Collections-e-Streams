package one.digitalinnovation.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
Criar uma fila e executar as seguintes operações:
01 - Adicionar 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
02 - Navegar na fila exibindo cada nome no console.
03 - Retornar o primeiro item da fila, sem removê - lo
04 - Retornar o primeiro item da fila, removendo o mesmo.
05 - Adicionar um novo nome: Daniel. Verifique a posição que o mesmo assuniu na fila
06 - Retornar o tamanho da fila.
07 - Verificar se a lista está vazia.
08 - Verificar se o nome Carlos está na fila.
 */
public class Ex01LinkedListQueue {
    public static void main(String[] args) {
// Criar uma fila e executar as seguintes operações:
// 01 [ok] - Adicionar 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
        Queue<String> novaListaLigada = new LinkedList<>();
            novaListaLigada.add("Juliana");
            novaListaLigada.add("Pedro");
            novaListaLigada.add("Carlos");
            novaListaLigada.add("Larissa");
            novaListaLigada.add("João");
        System.out.println("Itens da Lista: " + novaListaLigada);
// 02 [ok] - Navegar na fila exibindo cada nome no console.
        Iterator<String> iteratorListaLigada = novaListaLigada.iterator();
        while (iteratorListaLigada.hasNext()){
            System.out.println(iteratorListaLigada.next());
        }
// 03 [ok] - Retornar o primeiro item da fila, sem removê - lo
        String primeiroDaFila1 = novaListaLigada.peek();
        System.out.println("Retornar o primeiro item da fila, sem removê - lo: " + primeiroDaFila1);
        System.out.println("Itens da Lista: " + novaListaLigada);
// 04 [ok] - Retornar o primeiro item da fila, removendo o mesmo.
        String primeiroDaFila2 = novaListaLigada.poll();
        System.out.println("Retornar o primeiro item da fila, removendo o mesmo: " + primeiroDaFila2);
        System.out.println("Itens da Lista: " + novaListaLigada);
// 05 [ok] - Adicionar um novo nome: Daniel. Verifique a posição que o mesmo assuniu na fila
        novaListaLigada.add("Daniel");
        System.out.println("Adicionar um novo nome: " + novaListaLigada);
        System.out.println("Itens da Lista: " + novaListaLigada);
// 06 [ok] - Retornar o tamanho da fila.
        System.out.println("Tamanho da fila: " + novaListaLigada.size());
// 07 [ok] - Verificar se a lista está vazia.
        System.out.println("Verificar se alista está vazia: " + novaListaLigada.isEmpty());
// 08 [ok] - Verificar se o nome Carlos está na fila.
        boolean contemElemento = novaListaLigada.contains("Carlos");
        System.out.println("Verficar se o nome 'Carlos' está na lista: " + contemElemento);
    }
}
