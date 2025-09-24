package fortunex.classes;

public abstract class Aposta {
    public int id; // identificador da aposta
    public double valorApostado;
    public double odd; // multiplicador da aposta
    public Usuario usuario; // quem fez a aposta
    public Evento evento; // em qual evento foi feita

    public Aposta(int id, double valorApostado, double odd) {
        this.id = id;
        this.valorApostado = valorApostado;
        this.odd = odd;
    }
    public Aposta(int i, double v, double v1, Usuario usuario, Evento evento) {
        this.usuario = usuario;
        this.evento = evento;
    }
    // Getters

    public int getId() { return id; }
    public double getValorApostado() { return valorApostado; }
    public double getOdd() { return odd; }
    public Usuario getUsuario() { return usuario; }
    public Evento getEvento() { return evento; }

    // Calcula o retorno da aposta
    public double calcularRetorno() {
        return valorApostado * odd;
    }

    // Exibe as informações da aposta
    public void mostrarAposta() {
        System.out.println("📌 Aposta ID: " + id);
        System.out.println("👤 Usuário: " + usuario.getNome());
        System.out.println("🎯 Evento: " + evento.getNome() + " (ID: " + evento.getId() + ")");
        System.out.println("💰 Valor Apostado: R$ " + valorApostado);
        System.out.println("📈 Odd: " + odd);
        System.out.println("🏆 Possível Retorno: R$ " + calcularRetorno());
    }

    public abstract void calcularOdds();

    public Object getID() {
        return null;
    }
}
// As subclasses JogoFutebol, Corrida e PartidaBasquete também precisarão ser atualizadas
// para chamar o novo construtor da superclasse Aposta

    // Subclasse para Jogo de Futebol
    class JogoFutebol extends Aposta {
        private final int goalsTimeA;
        private final int golsTimeB;

        // Conteúdo da classe JogoFutebol
        public JogoFutebol(int id, double valorApostado, int goalsTimeA, int golsTimeB) {
            super(id, valorApostado, 0); // O 'super' chama o construtor da classe Aposta
            this.goalsTimeA = goalsTimeA;
            this.golsTimeB = golsTimeB;
            calcularOdds();
        }

        @Override
        public void calcularOdds() {
            if (goalsTimeA > golsTimeB) {
                odd = 2.0; // vitória do time A
            } else if (golsTimeB > goalsTimeA) {
                odd = 2.5; // vitória do time B
            } else {
                odd = 3.0; // empate
            }
        }
    }

    // Subclasse para Corrida
    class Corrida extends Aposta {
        public int posicaoChegada;

        public Corrida(int id, double valorApostado, int posicaoChegada) {
            super(id, valorApostado, 0); // O 'id' foi adicionado aqui
            this.posicaoChegada = posicaoChegada;
            calcularOdds();
        }

        @Override
        public void calcularOdds() {
            switch (posicaoChegada) {
                case 1:
                    odd = 6.0; // campeão da corrida
                    break;
                case 2:
                    odd = 3.0; // segundo lugar
                    break;
                case 3:
                    odd = 2.0; // terceiro lugar
                    break;
                default:
                    odd = 1.1; // qualquer outra posição dá retorno baixo
                    break;
            }
        }
    }

    // Subclasse para Partida de Basquete
    class PartidaBasquete extends Aposta {
        private final int pontosTimeA;
        private final int pontosTimeB;

        public PartidaBasquete(int id, double valorApostado, int pontosTimeA, int pontosTimeB) {
            super(id, valorApostado, 0); // O 'id' foi adicionado aqui
            this.pontosTimeA = pontosTimeA;
            this.pontosTimeB = pontosTimeB;
            calcularOdds();
        }

        @Override
        public void calcularOdds() {
            int diferenca = Math.abs(pontosTimeA - pontosTimeB);
            if (diferenca > 20) {
                odd = 1.5; // vitória fácil
            } else if (diferenca > 10) {
                odd = 2.0; // vitória moderada
            } else {
                odd = 3.0; // jogo equilibrado
            }
        }
    }

