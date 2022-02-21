package one.digitalinnovation.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        // criar a coleção de estudantes
        List<String> estudantes = new ArrayList<>(){{
        // adiconar os estudantes à List
            add("Pedro");
            add("Thayse");
            add("Marcelo");
            add("Carla");
            add("Juliana");
            add("Thiago");
            add("Rafael");
        }};

        System.out.println("Retornar a contagem de elementos do stream");
        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Retornar o elemento com o maior número de letras");
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Retornar o elemento com o menor número de letras");
        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));


        System.out.println("Retornar os elementos que tem a letra 'R' no nome");
        System.out.println("Elementos com a letra 'R': " + estudantes.stream().filter((estudante) ->
        estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna uma coleção, com os nomes conccatenados à quantidade de letra de cada nome");
        System.out.println("Retorna uma nova coleção  com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" -- ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println("Retorna somente os 3 primeiros itens da coleção");
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Exibe cada elemento no console, e depois retorna a mesma coleção");
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Exibe cada elemento no console sem retornar outra coleção");
        System.out.println("Retorna os elementos novamente: ");
                estudantes.stream().forEach(System.out::println);

        System.out.println("Retorna true se todos os elementos possuem a letra 'W' no nome");
        System.out.println("Letra w no nome: " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        System.out.println("Retorna true se algum dos elementos possui letra minúscula no nome");
        System.out.println("Letra minúscula no nome: " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        System.out.println("Retorna true se nenhum dos elementos possui letra minúscula no nome");
        System.out.println("Letra minúscula no nome: " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        System.out.println("Retorna o 1º elemento da coleção, se existir exibe no console");
        System.out.print("Retorna o 1º elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Exemplo de operação encadeada");
        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" -- ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                //.collect(Collectors.toList()))
        // .collect(Collectors.joining(", ")));
        // .collect(Collectors.toSet)));
        .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf(" -- ") + 1))));
    }
}
