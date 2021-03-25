package aulas.oo.part03.heranca.exemplo001;

public class Motocicleta extends Veiculo {

    private String cilindradas;

    //Getters and seters
    public String getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindradas='" + cilindradas + '\'' +
                '}';
    }
}
