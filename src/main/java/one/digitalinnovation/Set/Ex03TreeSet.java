package one.digitalinnovation.Set;

import java.util.Iterator;
import java.util.TreeSet;

/*
Criar um SET e execute as seguintes operações
01 - Adicionar 5 números inteiros: 3, 88, 20, 44, 3
02 - Navegar no SET exibindo cada numero no console
03 - Remova o primeiro item do SET
04 - Adicione um novo número no SET: 23
05 - Verivicar o tamanho do SET
06 - Verificar se o SET está vazio
 */
public class Ex03TreeSet {
    public static void main(String[] args) {
// [ok]Criar um SET e execute as seguintes operações
        TreeSet<Integer> numerosInteiros = new TreeSet<>(){{
// 01 [ok] - Adicionar 5 números inteiros: 3, 88, 20, 44, 3
            add(3);
            add(88);
            add(20);
            add(44);
            add(3);
        }};
// 02 [ok] - Navegar no SET exibindo cada numero no console
        Iterator<Integer> iterator = numerosInteiros.iterator();
        while (iterator.hasNext()){
            System.out.println("Elementos da Tree Set: " + iterator.next());
        }
// 03 [ok] - Remova o primeiro item do SET
        System.out.println("Remover o primeiro elemento da Tree Set: " + numerosInteiros.pollFirst());
        System.out.println("Mostrar o Tree Set após a remoção do primeiro elemento: " + numerosInteiros);
// 04 [ok] - Adicione um novo número no SET: 23
        numerosInteiros.add(23);
        System.out.println("Mostrar o Tree Set após a inserção do elemento: " + numerosInteiros);
// 05 [ok] - Verificar o tamanho do SET
        System.out.println("Verificar o tamanho do Tree Set: " + numerosInteiros.size());
// 06 [ok] - Verificar se o SET está vazio
        System.out.println("Verificar se o Tree Set está vazio: " + numerosInteiros.isEmpty());
    }
}


