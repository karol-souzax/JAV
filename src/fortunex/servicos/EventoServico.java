package fortunex.servicos;

import fortunex.classes.ClasseFutebol;
import fortunex.classes.ClasseBasquete;
import fortunex.classes.ClasseCorridas;
import fortunex.repositorios.RepEvento;

import java.util.List;

public class EventoServico implements IServico<Object> {

    private RepEvento repEvento;

    public EventoServico() {
        this.repEvento = new RepEvento();
    }


    public void adicionar(Object evento) {
        repEvento.adicionarEvento(evento);
    }


    public void remover(int id) {
        repEvento.removerEvento(id);
    }


    public Object buscarPorId(int id) {
        return repEvento.buscarEventoPorId(id);
    }


    public List<Object> listarTodos() {
        return repEvento.listarEventos();
    }
}
