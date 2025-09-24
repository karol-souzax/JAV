package fortunex.classes;

import java.util.ArrayList;
import java.util.List;

public class BancoEventos {
    public static List<Evento> eventos = new ArrayList<>();

    static {
        eventos.add(new ClasseFutebol(1, "Final Libertadores", "Maracanã", 100.0, "Flamengo x Palmeiras"));
        eventos.add(new ClasseBasquete(2, "NBA Finals", "Madison Square Garden", 200.0, "Lakers x Celtics"));
        eventos.add(new ClasseCorridas(3, "Fórmula 1 GP Brasil", "Interlagos", 150.0, "Hamilton"));
    }
    public static List<Evento> getEventos() {
        return eventos;
    }

}
