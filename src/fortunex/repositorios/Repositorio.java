package fortunex.repositorios;
/*essa interface vai ser implementada por todas as classes de repositório
ela vai definir os métodos básicos que todas as classes de repositório devem ter
esses métodos são: inserir, atualizar, remover, procurar e existe
esses métodos vão receber um objeto do tipo t, que é um tipo genérico
ou um id do tipo int, e vão retornar um objeto do tipo t ou um boolean
isso vai permitir que todas as classes de repositório tenham os mesmos métodos básicos, mas
cada classe de repositório vai implementar esses métodos de acordo com a sua necessidade*/
public interface Repositorio<t> {//t é um tipo genérico, pode ser qualquer coisa
    void inserir(t obj);
    void atualizar(t obj);
    void remover(int id);
    t procurar(int id);
    boolean existe(int id);
}
