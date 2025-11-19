package fortunex.repositorios;
import java.util.List;
import java.util.ArrayList;
import fortunex.classes.Evento;


public abstract class RepEvento implements Repositorio<Evento>{
    private final List<Evento> eventos = new ArrayList<>();// Lista para armazenar os eventos

    @Override
    public void cadastrar(Evento obj) {
        eventos.add(obj); // Adiciona o evento à lista

    }

    @Override
    public void atualizar(Evento obj) {
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getId() == obj.getId()) {
                eventos.set(i, obj);
                return;
            }
        }
        System.out.println("Evento com ID " + obj.getId() + " nao encontrado.");

    }

    @Override
    public void remover( int id) {
        eventos.remove(id);// Remove o evento com o id especificado

    }

    @Override
    public List<Evento> listar() {
        return eventos;
    }


}
