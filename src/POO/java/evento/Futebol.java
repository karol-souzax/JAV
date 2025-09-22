package POO.java.evento;

// Subclasse Futebol
class Futebol extends EventoEsportivo {
    String timeFavorito;

    // Construtor padrão
    /*public Futebol() {
        super();
        this.timeFavorito = "nenhum";
    }*/

    // Construtor com parâmetros
    public Futebol(String nomeEvento, String localEvento, double valorAposta, String timeFavorito) {
        super(nomeEvento, localEvento, valorAposta);
        this.timeFavorito = timeFavorito;
    }

    // Implementação do método abstrato
    /*@Override
    public void calcularPremio() {
        System.out.println("Nome do Evento: " + nomeEvento +
                "\nLocal do Evento: " + localEvento +
                "\nTime Favorito: " + timeFavorito +
                "\nValor do Prêmio: R$ " + valorPremio);
    }*/

    @Override
    public void calcularPremio() {
         this.valorPremio = valorAposta * 2;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("⚽ Futebol");
        super.mostrarInfo();
        System.out.println("Time Favorito: " + timeFavorito);
        System.out.println("Valor do Prêmio: R$ " + valorPremio);
    }
    // Sobrecarga do método mostrarInfo


    public void mostrarInfo(String b) {
        System.out.println("Campeonato Importante: " + b);
    }
}
