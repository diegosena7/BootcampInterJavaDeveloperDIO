package one.digitalinnovation.interfaces;

/*
O método da interface extende o seu modificador de acesso automaticamente, não precisamos deixar
explícito que o método é público se a interface for pública
 */
public interface Carro extends Automovel{

    String marca();

    Double valor();

    default void ligar() {

        System.out.println("Ligando o carro!");
    }

    default String codigoRenavan() {
        return "6533jijiio";
    }
}
