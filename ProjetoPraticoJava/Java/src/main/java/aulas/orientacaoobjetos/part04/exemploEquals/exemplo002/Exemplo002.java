package aulas.orientacaoobjetos.part04.exemploEquals.exemplo002;

public class Exemplo002 {

    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        //Retorna true a comparação de objetos diferentes, pois fizemos a sobrescrita do método equals na claasse Veiculo
        System.out.println(carro1.equals(carro2));
    }
}
