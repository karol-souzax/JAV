package evento;

public class Main {
    public static void main(String[] args) {
        // Criando objetos com valorAposta incluído
        EventoEsportivo.Futebol af = new EventoEsportivo.Futebol(
                "Final do Campeonato", "Estádio Nacional", 100.0, "Time A");
        EventoEsportivo.Basquete ab = new EventoEsportivo.Basquete(
                "Final da Liga", "Arena Central", 50.0, "Time B");
        EventoEsportivo.Corrida ac = new EventoEsportivo.Corrida(
                "Formula 1", "Circuito de Monaco", 200.0, "Hamilton");

        // Chamando métodos, e vai chamar os dois construtores
        af.mostrarInfo("Campeonato Brasileiro");
        af.calcularPremio();
        System.out.println();

// vai mostrar o construtor com parametros
        ab.mostrarInfo(true);
        ab.calcularPremio();
        System.out.println();

// vai chamar os dois construtores
        ac.mostrarInfo(6);
        ac.calcularPremio();
    }
}

