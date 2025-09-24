package fortunex.repositorios;
import fortunex.classes.Evento;

import java.util.List;

public interface Repositorio<t> {

    void cadastrar(t obj);
    void atualizar(t obj);
    void remover(t obj);
    List<t> listar();
}
