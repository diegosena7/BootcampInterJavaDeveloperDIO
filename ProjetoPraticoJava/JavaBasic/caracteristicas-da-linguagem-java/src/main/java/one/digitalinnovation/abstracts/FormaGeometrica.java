package one.digitalinnovation.abstracts;

/*
Não pode virar um objeto (ser instanciada), seus métodos (abstratos) não possuem corpo
Se um método for abstrato, a classe precisa ser abstrata
 */
public abstract class FormaGeometrica {

    public abstract String nome();
    public abstract Double area();

    public String desenha(int x , int y) {
        return "Desenhando nas coordenadas X="+x+" Y:"+y;
    }
}
