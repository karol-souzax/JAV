package fortunex.servicos;

import fortunex.classes.Evento;
import fortunex.repositorios.RepEvento;

import java.util.List;

public class EventoServico implements IServico<Evento> {

    @Override
    public void remover( int id) {
        repEvento.remover();
    } RepEvento repEvento;

    public EventoServico() {
        this.repEvento = new RepEvento() {// cria um repositório de eventos
            @Override
            public void remover() {

            }
        };
    }

    @Override
    public void adicionar( Evento evento) {// adiciona um evento
        repEvento.cadastrar(evento);
    }

    @Override
    public void remover(Evento obj) {// remove um evento
        repEvento.remover();}
    @Override
    public void alterar(int index, Evento obj) {// altera um evento
        repEvento.atualizar(obj);
    }

    @Override
    public List<Evento> listarTodos() {// lista todos os eventos
        return repEvento.listar();
    }
}
