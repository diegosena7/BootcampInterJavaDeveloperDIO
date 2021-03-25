package one.digitalinnovation.abstracts;

public class Quadrado extends FormaGeometrica {

    private String nome;
    private Double area;

    public Quadrado(final String nome, final Double area) {
        this.nome = nome;
        this.area = area;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double area() {
        return null;
    }

    //Cria a String do objeto
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder()//
                .append("Quadrado [")//
                .append("nome=\"")//
                .append(nome).append("\"")//
                .append(",area=")//
                .append(area)//
                .append("]");
        return builder.toString();
    }
}
