package fortunex.servicos;

import java.util.List;

public interface IServico<T> {
    void adicionar(T entidade);
    void remover(int id);
    T buscarPorId(int id);
    List<T> listarTodos();
}

