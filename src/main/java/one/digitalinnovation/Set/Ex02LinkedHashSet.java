package one.digitalinnovation.Set;

import java.util.LinkedHashSet;

/*
Criar um SET e execute as seguintes operações
01 - Adicionar 5 números inteiros: 3, 88, 20, 44, 3
02 - Navegar no SET exibindo cada numero no console
03 - Remova o primeiro item do SET
04 - Adicione um novo número no SET: 23
05 - Verivicar o tamanho do SET
06 - Verificar se o SET está vazio
 */
public class Ex02LinkedHashSet {
        public static void main(String[] args) {
// [ok] Criar um SET e execute as seguintes operações
            LinkedHashSet<Integer> numerosInteiros = new LinkedHashSet<>();
// 01 [ok] - Adicionar 5 números inteiros: 3, 88, 20, 44, 3
            numerosInteiros.add(3);
            numerosInteiros.add(88);
            numerosInteiros.add(20);
            numerosInteiros.add(44);
            numerosInteiros.add(3);
// 02 [ok] - Navegar no SET exibindo cada numero no console
            for (Integer numero : numerosInteiros){
                System.out.println("Itens da Linked Hash Set: " + numero);
            }
// 03 [ok] - Remova o primeiro item do SET
            System.out.println("Remover o primeiro item da Linked Hash Set: " + numerosInteiros.remove(3));
            System.out.println("Mostrar o Hash Set após a remoção do elemento '3': " + numerosInteiros);
// 04 [ok] - Adicione um novo número no SET: 23
            numerosInteiros.add(23);
            System.out.println("Mostrar o Linked Hash Set após adicionar o novo elemento: " + numerosInteiros);
// 05 [ok] - Verivicar o tamanho do SET
            System.out.println("Verificar o tamanho da Linked Hash Set: " + numerosInteiros.size());
// 06 [ok] - Verificar se o SET está vazio
            System.out.println("Verificar se a Linked Hash Set está vazia: " + numerosInteiros.isEmpty());
    }
}
