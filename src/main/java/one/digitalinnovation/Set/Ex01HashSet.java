package one.digitalinnovation.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Criar um SET e execute as seguintes operações
01 - Adicionar 5 números inteiros: 3, 88, 20, 44, 3
02 - Navegar no SET exibindo cada numero no console
03 - Remova o primeiro item do SET
04 - Adicione um novo número no SET: 23
05 - Verivicar o tamanho do SET
06 - Verificar se o SET está vazio
 */
public class Ex01HashSet {
    public static void main(String[] args) {
// [ok]Criar um SET e execute as seguintes operações
        Set<Integer> numerosInteiros = new HashSet<>();
// 01 [ok] - Adicionar 5 números inteiros: 3, 88, 20, 44, 3
        numerosInteiros.add(3);
        numerosInteiros.add(88);
        numerosInteiros.add(20);
        numerosInteiros.add(44);
        numerosInteiros.add(3);
// 02 [ok] - Navegar no SET exibindo cada numero no console
        Iterator<Integer> iterator = numerosInteiros.iterator();
        while (iterator.hasNext()){
            System.out.println("Elementos do Hash Set: " + iterator.next());
        }
// 03 [ok] - Remova o primeiro item do SET
        numerosInteiros.remove(3);
        System.out.println("Mostrar o Hash Set após a remoção do elemento '3': " + numerosInteiros);
// 04 [ok] - Adicione um novo número no SET: 23
        numerosInteiros.add(23);
        System.out.println("Mostrar o Hash Set após a inclusão do novo número: " + numerosInteiros);
// 05 [ok] - Verificar o tamanho do SET
        System.out.println("Verificar o tamanho do Hash Set: " + numerosInteiros.size());
// 06 [ok] - Verificar se o SET está vazio
        System.out.println("Verificar se o Hash Set está vazio: " + numerosInteiros.isEmpty());
    }
}
