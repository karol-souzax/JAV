package evento;

// Subclasse Corrida
public class Corrida extends EventoEsportivo {
    String pilotoFavorito;

    // Construtor padrão
    /*public Corrida() {
        super();
        this.pilotoFavorito = "nenhum";
    }*/
    // Construtor com parâmetros
    public Corrida(String nomeEvento, String localEvento, double valorAposta, String pilotoFavorito) {
        super(nomeEvento, localEvento, valorAposta);
        this.pilotoFavorito = pilotoFavorito;


    }

    @Override
    public void calcularPremio() {
        this.valorPremio= valorAposta*3;    }



    @Override
    public void mostrarInfo() {
        System.out.println("🏁 Corrida");
        super.mostrarInfo();
        System.out.println("Piloto Favorito: " + pilotoFavorito);
        System.out.println("Valor do Prêmio: R$ " + valorPremio);
    }
    //EXTRA Sobrecarga do método mostrarInfo
    @Override
    public void mostrarInfo(String b) {
        System.out.println(
                "\nNúmero da Corrida: " + b);
    }
}
