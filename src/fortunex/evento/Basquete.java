package fortunex.evento;

// Subclasse Basquete
class Basquete extends EventoEsportivo {
    String equipeFavorita;



    // Construtor com parâmetros
    public Basquete(String nomeEvento, String localEvento, double valorAposta, String equipeFavorita) {
        super(nomeEvento, localEvento, valorAposta);
        this.equipeFavorita = equipeFavorita;
    }

    @Override
    public void calcularPremio() {
        this.valorPremio = valorAposta * 1.8;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("🏀 Basquete");
        super.mostrarInfo();
        System.out.println("Equipe Favorita: " + equipeFavorita);
        System.out.println("Valor do Prêmio: R$ " + valorPremio);
    }
    // extra Sobrecarga do método mostrarInfo
        public void mostrarInfo(String b) {
            System.out.println("Jogo Final: " + b);
        }
}

