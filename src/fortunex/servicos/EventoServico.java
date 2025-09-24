package fortunex.servicos;

import fortunex.classes.Evento;
import fortunex.classes.Usuario;
import fortunex.repositorios.RepEvento;

import java.util.List;

public class EventoServico implements IServico<Evento> {

    private RepEvento repEvento;

    public EventoServico() {
        this.repEvento = new RepEvento();
    }

    @Override
    public void adicionar( Evento evento) {
        repEvento.cadastrar(evento);
    }

    @Override
    public void remover(Evento id) {
        repEvento.remover(id);
    }
    @Override
    public void alterar(int index, Evento obj) {
        repEvento.atualizar(obj);
    }

    @Override
    public List<Evento> listarTodos() {
        return repEvento.listar();
    }
}
