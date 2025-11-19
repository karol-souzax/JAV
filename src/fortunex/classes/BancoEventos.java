package fortunex.classes;

import java.util.ArrayList;
import java.util.List;

public class BancoEventos {
    public static List<Evento> eventos = new ArrayList<>();

    static {
        eventos.add(new ClasseFutebol(1, "Final Libertadores", "Maracanã", 100.0, "Flamengo x Palmeiras"));
        eventos.add(new ClasseBasquete(2, "NBA", "Madison Square Garden" ,200.0, " Celties X Lacerks"));
        eventos.add(new ClasseCorridas(3, "GP Mônaco", "Circuito de Mônaco", 150.00,  "Fórmula 1"));
    }
    public static List<Evento> getEventos() {

        return eventos;
    }

}
