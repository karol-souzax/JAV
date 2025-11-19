package fortunex.classes;

import java.util.ArrayList;
import java.util.List;

public class BancoApostas {

    private static List<Aposta> apostas = new ArrayList<>();

    public static void adicionarAposta(Aposta aposta) {
        apostas.add(aposta);
    }

    public static List<Aposta> getApostas() {
        return apostas;
    }
}
