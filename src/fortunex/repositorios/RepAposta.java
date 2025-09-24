package fortunex.repositorios;

import java.util.ArrayList;
import java.util.List;
import fortunex.classes.Aposta;
import fortunex.classes.Evento;

public class RepAposta implements Repositorio<Aposta> {
    private final List<Aposta> apostas = new ArrayList<>();

    @Override
    public void cadastrar(Aposta obj) {
        apostas.add(obj);
    }

    @Override
    public void remover(Aposta obj) {
        apostas.remove(obj);
    }

    @Override
    public List<Aposta> listar() {
        return apostas;
    }


    public void atualizar(Aposta obj) {
        for (int i = 0; i < apostas.size(); i++) {
            if (apostas.get(i).getID() == obj.getID()) {
                apostas.set(i, obj);
                return;
            }
        }
        System.out.println("Aposta com ID " + obj.getID() + " nao encontrada.");

    }


}
