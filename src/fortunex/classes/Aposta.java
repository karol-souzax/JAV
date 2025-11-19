package fortunex.classes;
public abstract class Aposta {

    private int id;
    private double valorApostado;
    private Evento eventoSelecionado;
    protected double odd; // protected para que subclasses possam alterar
    private Usuario usuario;
    private Evento evento;


    public Aposta(int id, double valorApostado,Usuario usuario, Evento evento) {
        this.id = id;
        this.valorApostado = valorApostado;
        this.usuario = usuario;
        this.evento = evento;
    }

    public Aposta(int idAposta, double valorAposta, Evento eventoSelecionado) {
    }

    public int getId() {
        return id;
    }

    public double getValorApostado() {
        return valorApostado;
    }

    public double getOdd() {
        return odd;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    // ───────── MÉTODOS DE NEGÓCIO ─────────

    /**
     * Calcula o retorno total da aposta.
     */
    public double calcularRetorno() {
        return valorApostado * odd;
    }

    /**
     * Mostra informações da aposta no console.
     */
    public void mostrarAposta() {
        System.out.println("\n=== DETALHES DA APOSTA ===");
        System.out.println("ID: " + id);
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Evento: " + evento.getNome());
        System.out.println("Valor Apostado: R$ " + valorApostado);
        System.out.println("Odd: " + odd);
        System.out.println("Possível Retorno: R$ " + calcularRetorno());
    }

    /**
     * Cada tipo de aposta deve calcular sua odd específica.
     */
    public abstract void calcularOdds();
}

// As subclasses JogoFutebol, Corrida e PartidaBasquete também precisarão ser atualizadas
// para chamar o novo construtor da superclasse Aposta

    // Subclasse para Jogo de Futebol
    class JogoFutebol extends Aposta {
        private final int golsA;
        private final int golsB;

        public JogoFutebol(
                int id,
                double valorApostado,
                Usuario usuario,
                Evento evento,
                int golsA,
                int golsB
        ) {
            super(id, valorApostado, usuario, evento);
            this.golsA = golsA;
            this.golsB = golsB;
            calcularOdds();
        }

        @Override
        public void calcularOdds() {
            if (golsA > golsB)
                odd = 2.0;
            else if (golsB > golsA)
                odd = 2.5;
            else
                odd = 3.0;
        }
    }

    // Subclasse para Corrida
     class Corrida extends Aposta {

        private int posicaoChegada;

        public Corrida(
                int id,
                double valorApostado,
                Usuario usuario,
                Evento evento,
                int posicaoChegada
        ) {
            super(id, valorApostado,usuario, evento);
            this.posicaoChegada = posicaoChegada;
            calcularOdds();
        }

        @Override
        public void calcularOdds() {
            switch (posicaoChegada) {
                case 1 -> odd = 6.0;
                case 2 -> odd = 3.0;
                case 3 -> odd = 2.0;
                default -> odd = 1.1;
            }
        }
    }

    // Subclasse para Partida de Basquete
     class PartidaBasquete extends Aposta {

        private final int pontosA;
        private final int pontosB;

        public PartidaBasquete(
                int id,
                double valorApostado,
                Usuario usuario,
                Evento evento,
                int pontosA,
                int pontosB
        ) {
            super(id, valorApostado,usuario, evento);
            this.pontosA = pontosA;
            this.pontosB = pontosB;
            calcularOdds();
        }

        @Override
        public void calcularOdds() {
            int diff = Math.abs(pontosA - pontosB);

            if (diff > 20)
                odd = 1.5;
            else if (diff > 10)
                odd = 2.0;
            else
                odd = 3.0;
        }
    }

