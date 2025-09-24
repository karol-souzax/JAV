package fortunex.servicos;

import fortunex.classes.Usuario;

import java.util.List;

public interface IServico<T> {
    void adicionar(T obj);
    void remover(T obj);
    void alterar(int index,T obj);
    List<T> listarTodos();
}

