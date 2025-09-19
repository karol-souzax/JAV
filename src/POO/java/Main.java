package POO.java;

public class Main {
    public static void main(String[] args) {

        /*fusca.cor = "Azul";
        fusca.modelo = "Fusca";
        fusca.ano = 1980;
        fusca.marca = "Volkswagen";
        System.out.println("Cor: " + fusca.cor);*/


        Carro fusca = new Carro("Azul", "Fusca", 1980, "Volkswagen");//instancia o objeto
        System.out.println("Cor: " + fusca.cor);//acessa o atributo do objeto
        System.out.println("Modelo: " + fusca.modelo);
        System.out.println("Ano: " + fusca.ano);
        System.out.println("Marca: " + fusca.marca);

    }
}
