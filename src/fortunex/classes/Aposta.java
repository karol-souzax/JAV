package fortunex.classes;
//aqui vai ser a classe abstrata que vai ser extendida pelas outras classes
//ela vai ter os atributos e metodos comuns a todas as classes
//e tambem vai ter os metodos abstratos que vao ser implementados nas subclasses
    // Classe abstrata base
    abstract class Aposta {
        protected double valorApostado;
        protected double odd; // multiplicador da aposta

        public Aposta(double valorApostado, double odd) {
            this.valorApostado = valorApostado;
            this.odd = odd;
        }

        // Método comum para calcular o retorno
        public double calcularRetorno() {
            return valorApostado * odd;
        }

        // Método abstrato que cada esporte vai implementar
        public abstract void calcularOdds();

        public double getOdd() {
            return odd;
        }

        public double getValorApostado() {
            return valorApostado;
        }
    }

    // Subclasse para Jogo de Futebol
    class JogoFutebol extends Aposta {
        private int golsTimeA;
        private int golsTimeB;

        public JogoFutebol(double valorApostado, int golsTimeA, int golsTimeB) {
            super(valorApostado, 0);
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

        public Corrida(double valorApostado, int posicaoChegada) {
            super(valorApostado, 0);
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

        public PartidaBasquete(double valorApostado, int pontosTimeA, int pontosTimeB) {
            super(valorApostado, 0);
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

