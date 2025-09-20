package fortunex.repositorios;

public interface Repositorio<t> {
    void inserir(t obj);
    void atualizar(t obj);
    void remover(int id);
    t procurar(int id);
    boolean existe(int id);
}
