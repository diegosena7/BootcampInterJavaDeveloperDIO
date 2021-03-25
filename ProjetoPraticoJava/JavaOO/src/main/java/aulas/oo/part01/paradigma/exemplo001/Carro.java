package aulas.oo.part01.paradigma.exemplo001;

public class Carro {

    private String modelo = "Onix";
    private String cor = "Cinza";
    private  String marca = "Chevrolet";
    private String cambio = "Manual";
    private Boolean status = true;
    private Integer qtidadePassageiros = 0;

    //Construtor sem parâmetros
    public Carro() {
        this.modelo = modelo;
    }

    //Construtor com parâmetros
    public Carro(String modelo, String cor, String marca, String cambio) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.cambio = cambio;
    }

    //Getters and seters
    public String getCambio() {
        return cambio;
    }
    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Integer getQtidadePassageiros() {
        return qtidadePassageiros;
    }

    //Métodos da classe
    public String ligar(){
        return "O carro está ligado...";
    }
    public String desligar(){
        return "O carro está desligado...";
    }
    public String statusVenda(){
        if (this.status == true){
            return "Carro disponível para venda";
        }else{
            return "Carro indisponível para venda";
        }
    }
    public Integer addPassageiros(Integer addPax){
        return addPax;
    }
    public Integer removePassageiros(Integer removePax){
        return removePax;
    }
}
