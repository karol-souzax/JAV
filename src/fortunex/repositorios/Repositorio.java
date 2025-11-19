package fortunex.repositorios;

import java.util.List;

public interface Repositorio<t> {

    void cadastrar(t obj);
    void atualizar(t obj);
    void remover();

    void remover(int id);

    List<t> listar();
}
