package POO.java;

public class Carro {
    public String cor;
    public String modelo;
    public int ano;
    public String marca;

    public boolean ligado;//indica se o carro está ligado ou desligado
    public int aceleracao;//velocidade atual do carro
    //metodo construtor
    public Carro(String cor, String modelo, int ano, String marca) {
        //this  referencia o objeto atual
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.ligado = false; //inicialmente o carro está desligado
        this.aceleracao = 0; //inicialmente a aceleração é 0

    }
    public void ligar(){
        if (!this.ligado){//se o carro não está ligado
            return;//sai do método
        }
        this.ligado=false;//desliga o carro
    }
    public void acelerar(String tipoAceleracao){//método para acelerar o carro


    }
 }

