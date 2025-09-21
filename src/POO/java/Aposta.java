package POO.java;

// Classe abstrata (superclasse)
abstract class Aposta {
    String usuario;
    double valor;

    // Construtor padrão
    Aposta() {
        this.usuario = "Anônimo";
        this.valor = 0.0;
    }

    // Construtor sobrecarregado
    Aposta(String usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    // Método normal
    void mostrarAposta() {
        System.out.println("Usuário: " + usuario + " fez uma aposta de R$ " + valor);
    }

    // Método abstrato - cada tipo de aposta precisa implementar
    abstract void calcularRetorno();
}

// Classe POO.java.ApostaFutebol herda de POO.java.Aposta
class ApostaFutebol extends Aposta {
    String time;

    // Construtor padrão
    ApostaFutebol() {
        super();
        this.time = "Não definido";
    }

    // Construtor sobrecarregado
    ApostaFutebol(String usuario, double valor, String time) {
        super(usuario, valor);
        this.time = time;
    }

    // Implementação do método abstrato
    @Override
    void calcularRetorno() {
        System.out.println(usuario + " apostou R$ " + valor + " no time " + time +
                " e pode ganhar R$ " + (valor * 2));
    }

    // Sobrecarga de método
    void mostrarAposta(String campeonato) {
        System.out.println(usuario + " apostou R$ " + valor + " no " + time + " pelo campeonato " + campeonato);
    }
}

// Classe POO.java.ApostaBasquete herda de POO.java.Aposta
class ApostaBasquete extends Aposta {
    String equipe;

    // Construtor padrão
    ApostaBasquete() {
        super();
        this.equipe = "Não definida";
    }

    // Construtor sobrecarregado
    ApostaBasquete(String usuario, double valor, String equipe) {
        super(usuario, valor);
        this.equipe = equipe;
    }

    @Override
    void calcularRetorno() {
        System.out.println(usuario + " apostou R$ " + valor + " na equipe " + equipe +
                " e pode ganhar R$ " + (valor * 1.8));
    }

    // Sobrecarga de método
    void mostrarAposta(boolean jogoFinal) {
        if (jogoFinal) {
            System.out.println(usuario + " fez uma aposta especial na FINAL com R$ " + valor);
        } else {
            System.out.println(usuario + " apostou R$ " + valor + " em jogo normal de basquete");
        }
    }
}

// Classe POO.java.ApostaCorrida herda de POO.java.Aposta
class ApostaCorrida extends Aposta {
    String piloto;

    // Construtor padrão
    ApostaCorrida() {
        super();
        this.piloto = "Desconhecido";
    }

    // Construtor sobrecarregado
    ApostaCorrida(String usuario, double valor, String piloto) {
        super(usuario, valor);
        this.piloto = piloto;
    }

    @Override
    void calcularRetorno() {
        System.out.println(usuario + " apostou R$ " + valor + " no piloto " + piloto +
                " e pode ganhar R$ " + (valor * 3));
    }

    // Sobrecarga de método
    void mostrarAposta(int numeroCorrida) {
        System.out.println(usuario + " apostou R$ " + valor + " no piloto " + piloto +
                " na corrida número " + numeroCorrida);
    }
}



