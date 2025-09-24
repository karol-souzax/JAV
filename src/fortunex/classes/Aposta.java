package fortunex.classes;

public class Aposta {
    protected int id; // Adicione um ID para identificar cada aposta
    protected double valorApostado;
    protected double odd; // multiplicador da aposta

    // Atualize o construtor para receber o ID
    public Aposta(int id, double valorApostado, double odd) {
        this.id = id;
        this.valorApostado = valorApostado;
        this.odd = odd;
    }

    // Adicione o método getID()
    public int getID() {
        return id;
    }

    // Método comum para calcular o retorno
    public double calcularRetorno() {
        return valorApostado * odd;
    }

    // Método que cada esporte vai implementar
    public void calcularOdds(){

    }
    public double getOdd() {
        return odd;
    }

    public double getValorApostado() {
        return valorApostado;
    }
}
// As subclasses JogoFutebol, Corrida e PartidaBasquete também precisarão ser atualizadas
// para chamar o novo construtor da superclasse Aposta

    // Subclasse para Jogo de Futebol
    class JogoFutebol extends Aposta {
        private int golsTimeA;
        private int golsTimeB;

        // Conteúdo da classe JogoFutebol
        public JogoFutebol(int id, double valorApostado, int golsTimeA, int golsTimeB) {
            super(id, valorApostado, 0); // O 'super' chama o construtor da classe Aposta
            this.golsTimeA = golsTimeA;
            this.golsTimeB = golsTimeB;
            calcularOdds();
        }

        @Override
        public void calcularOdds() {
            if (golsTimeA > golsTimeB) {
                odd = 2.0; // vitória do time A
            } else if (golsTimeB > golsTimeA) {
                odd = 2.5; // vitória do time B
            } else {
                odd = 3.0; // empate
            }
        }
    }

    // Subclasse para Corrida
    class Corrida extends Aposta {
        private int posicaoChegada;

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
        private int pontosTimeA;
        private int pontosTimeB;

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

