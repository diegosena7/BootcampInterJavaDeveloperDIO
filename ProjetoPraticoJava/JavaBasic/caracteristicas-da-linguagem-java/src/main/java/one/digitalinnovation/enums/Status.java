package one.digitalinnovation.enums;

//Os atributos do tipo Enum, devem ser descritos com letras maiúsculas
public enum Status {
    OPEN(13, "Aberto"),
    CLOSE(02, "Fechado");

    private int cod;
    private String texto;

    //Construtor para instanciar o Enum
    Status(final int cod, final String texto) {
        this.cod = cod;
        this.texto = texto;
    }

    //Getters and Seters
    public int getCod() {
        return cod;
    }

    public String getTexto() {
        return texto;
    }
}
