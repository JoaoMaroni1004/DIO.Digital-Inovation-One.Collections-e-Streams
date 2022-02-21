package one.digitalinnovation.Optional;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor opcional");
        // possui dois métodos (1 - isPresent, 2 - isEmpty)
            // 1 - isPresent: retorna true quando o estado do optional é presente, e false quando é vazio
            // 2 - isEmpty: retorna true quando o estado do optional é vazio, e false quando é presente
        System.out.println("Estado do optional (método isPresent): " + optionalString.isPresent());
        System.out.println("Estado do optional (método isEmpty): " + optionalString.isEmpty());


        optionalString.ifPresent(System.out::println);


        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("Valor não está presente"));

        if (optionalString.isPresent()){
            String valor = optionalString.get();
            System.out.println("Valor: " + valor);
        }
        optionalString.map((valor) -> valor.concat(" **** ")).ifPresent(System.out::println);
        optionalString.orElseThrow(IllegalStateException::new);

    }
}
