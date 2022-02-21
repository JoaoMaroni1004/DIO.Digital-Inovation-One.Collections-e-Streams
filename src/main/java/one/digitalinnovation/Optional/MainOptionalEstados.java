package one.digitalinnovation.Optional;

import java.util.Optional;

public class MainOptionalEstados {
    public static void main(String[] args) {

        System.out.println("Valor opcional que está presente:");
        // método of recebe um valor do tipo de dado passado pelo usuário (string, integer, double etc)
                        // está recebendo um valor (string) diferente de null
        Optional<String> optionalString = Optional.of("Valor Presente");
        // Optional<String> optionalString = Optional.of(null);
        // o método ifPresentOrElse recebe dois argumentos:
        //      1.º ifPresent — expressão do tipo 'lambda', sendo execudada se o valor estiver presente
                        // "mostra o valor contido na espressão 'lambda'"
        //      2.º OrElse — implementação da 'interface' runnable, não recebe nenhum valor
                        // "mostra apenas uma mensagem ao usuário"
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));


        System.out.println("Valor opcional que não está presente:");
        // ifNullable constroi de acordo com o argumanto passado
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));


        System.out.println("Valor opcional que não está presente:");
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));


        System.out.println("Valor opcional que lança um erro NullPointerException:");
        Optional<String> optionalNullErro = Optional.of(null);
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }
}
