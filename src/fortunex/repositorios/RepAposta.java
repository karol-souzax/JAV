package fortunex.repositorios;

import java.util.ArrayList;
import java.util.List;
import fortunex.classes.Aposta;

public class RepAposta implements Repositorio<Aposta> {
    private final List<Aposta> apostas = new ArrayList<>();

    @Override
    public void cadastrar(Aposta obj) {
        apostas.add(obj);
    }

    @Override
    public void remover() {
        apostas.remove(0); // Remove a primeira aposta da lista como exemplo
    }

    @Override
    public void remover(int id) {

    }

    @Override
    public List<Aposta> listar() {
        return apostas;
    }


    public void atualizar(Aposta obj) {
        for (int i = 0; i < apostas.size(); i++) {
            if (apostas.get(i).getId() == obj.getId()) {
                apostas.set(i, obj);
                return;
            }
        }
        System.out.println("Aposta com ID " + obj.getId() + " nao encontrada.");

    }


}
