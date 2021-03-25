package aulas.collections_streams.comparators;

public class Estudante implements Comparable<Estudante>{

    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getters and seters
    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }

    //Método responsável por transformar o objeto em String
    @Override
    public String toString() {
        return "Estudante{" + "nome='" + nome + '\'' + ", idade=" + idade +'}'; }

     //Método responsável por fazer a comparação da referência ao atributo com o objeto recebido como parâmetro
    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
