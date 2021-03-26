package aulas.orientacaoobjetos.part04.exemploEquals.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        //Retorna false, pois são objetos diferentes
        System.out.println("carro2 comparando com carro2 = " + carro1.equals(carro2));

        //Retorna true, pois a comparação se deve ao mesmo objeto
        System.out.println("carro1 comparando com carro1 = " + carro1.equals(carro1));
    }
}
