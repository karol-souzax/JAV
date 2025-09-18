package evento;

// Superclasse abstrata
public abstract class EventoEsportivo {
    String nomeEvento;
    String localEvento;
    double valorAposta; // agora é atributo da classe

    // Construtor padrão, os dois não são obrigatórios
    //Útil quando você quer criar um objeto com valores padrão e depois alterar os atributos manualmente.
    public EventoEsportivo() {
        this.nomeEvento = "a definir";
        this.localEvento = "caruaru";
        this.valorAposta = 0;
    }

    // Construtor com parâmetros
    // Útil quando você quer criar um objeto já inicializado com valores específicos.
    public EventoEsportivo(String nomeEvento, String localEvento, double valorAposta) {
        this.nomeEvento = nomeEvento;
        this.localEvento = localEvento;
        this.valorAposta = valorAposta;
    }

    // Método normal
    public void mostrarInfo() {
        System.out.println("Nome do Evento: " + nomeEvento);
        System.out.println("Local do Evento: " + localEvento);
        System.out.println("Valor da Aposta: R$ " + valorAposta);
    }

    // Método abstrato
    public abstract void calcularPremio();

    // ================= Subclasses =================

    // Subclasse Futebol
    static class Futebol extends EventoEsportivo {
        String timeFavorito;

        // Construtor padrão
        public Futebol() {
            super();
            this.timeFavorito = "nenhum";
        }

        // Construtor com parâmetros
        public Futebol(String nomeEvento, String localEvento, double valorAposta, String timeFavorito) {
            super(nomeEvento, localEvento, valorAposta);
            this.timeFavorito = timeFavorito;
        }

        // Implementação do método abstrato
        @Override
        public void calcularPremio() {
            double valorPremio = valorAposta * 2;
            System.out.println("Nome do Evento: " + nomeEvento +
                    "\nLocal do Evento: " + localEvento +
                    "\nTime Favorito: " + timeFavorito +
                    "\nValor do Prêmio: R$ " + valorPremio);
        }

        // Sobrecarga do método mostrarInfo
        void mostrarInfo(String campeonato) {
            super.mostrarInfo();
            System.out.println("Campeonato: " + campeonato);
        }
    }

    // Subclasse Basquete
    static class Basquete extends EventoEsportivo {
        String equipeFavorita;



        // Construtor com parâmetros
        public Basquete(String nomeEvento, String localEvento, double valorAposta, String equipeFavorita) {
            super(nomeEvento, localEvento, valorAposta);
            this.equipeFavorita = equipeFavorita;
        }

        @Override
        public void calcularPremio() {
            double valorPremio = valorAposta * 1.8;
            System.out.println("Evento: " + nomeEvento +
                    "\nLocal: " + localEvento +
                    "\nEquipe Favorita: " + equipeFavorita +
                    "\nValor do Prêmio: R$ " + valorPremio+
                    "\nValor da Aposta: R$ " + valorAposta);
        }

        // Sobrecarga do método mostrarInfo
        public void mostrarInfo(boolean jogoFinal) {
            System.out.println("Jogo Final: " + (jogoFinal ? "Sim" : "Não"));
        }
    }

    // Subclasse Corrida
    static class Corrida extends EventoEsportivo {
        String pilotoFavorito;

        // Construtor padrão
        public Corrida() {
            super();
            this.pilotoFavorito = "nenhum";
        }
        // Construtor com parâmetros
        public Corrida(String nomeEvento, String localEvento, double valorAposta, String pilotoFavorito) {
            super(nomeEvento, localEvento, valorAposta);
            this.pilotoFavorito = pilotoFavorito;

        }

        @Override
        public void calcularPremio() {
            double valorPremio = valorAposta * 3;
            System.out.println("Nome do Evento: " + nomeEvento +
                    "\nLocal do Evento: " + localEvento +
                    "\nPiloto Favorito: " + pilotoFavorito +
                    "\nValor do Prêmio: R$ " + valorPremio);
        }

        // Sobrecarga do método mostrarInfo
        public void mostrarInfo(int numeroCorrida) {
            super.mostrarInfo();
            System.out.println("Piloto Favorito: " + pilotoFavorito +
                    "\nNúmero da Corrida: " + numeroCorrida);
        }
    }
}



