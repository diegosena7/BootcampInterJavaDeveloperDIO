package aulas.collections_streams.optional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        //Instanciando um objeto do tipo Optional usado para construir objeto opicional quando temos certeza que o atributo não é null e possui um valor
        Optional<String> optionalString = Optional.of("Valor Presente");
        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        //Instanciando um objeto do tipo Optional usado para construir objeto com atributo que pode ser null
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = não está presente"));

        //Instanciando um objeto do tipo Optional usado para construir objeto opcional sem valor, do zero
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = não está presente"));
        System.out.println("TESTEEE: " + emptyOptional.isPresent());

        //Instanciando um objeto do tipo Optional, recebe um valor null e retorna o erro NullPointerException
        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que laçna erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro = não está presente"));
    }
}
