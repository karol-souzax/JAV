package evento;

public class Main {
    public static void main(String[] args) {
        // Criando objetos com valorAposta incluído
        Aposta af = new Futebol(
                "Final do Campeonato", "Estádio Nacional", 100.0, "Time A");
        Aposta ab = new Basquete(
                "Final da Liga", "Arena Central", 50.0, "Time B");
        Aposta ac = new Corrida(
                "Formula 1", "Circuito de Monaco", 200.0, "Hamilton");

        // Chamando métodos, e vai chamar os dois construtores

        af.calcularPremio();
        af.mostrarInfo();
        af.mostrarInfo("com parametros");

        System.out.println();

// vai mostrar o construtor com parametros
        ab.calcularPremio();
        ab.mostrarInfo();
        ab.mostrarInfo("true");
        System.out.println();

// vai chamar os dois construtores--
        ac.calcularPremio();
        ac.mostrarInfo();
        ac.mostrarInfo("3");
    }
}

