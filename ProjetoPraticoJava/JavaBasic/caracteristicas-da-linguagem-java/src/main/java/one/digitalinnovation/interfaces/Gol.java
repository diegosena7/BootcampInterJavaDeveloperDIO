package one.digitalinnovation.interfaces;

//Ao implementar uma classe, devo sobreescrever seus métodos a classe Gol é um Carro (Classe)
public class Gol implements Carro {

    @Override
    public String marca() {
        return "Volkswagen";
    }

    @Override
    public Double valor() {
        return null;
    }
}
