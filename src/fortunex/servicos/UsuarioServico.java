package fortunex.servicos;

import fortunex.classes.Usuario;
import fortunex.repositorios.RepUsuario;

import java.util.List;

public class UsuarioServico implements IServico<Usuario> {

    private final RepUsuario RepUsuario;

    public UsuarioServico() {

        this.RepUsuario = new RepUsuario();
    }

// Implementação dos métodos da interface IServico
    @Override
    public void adicionar(Usuario usuario) {
        RepUsuario.cadastrar(usuario);
    }

// Implementação dos métodos da interface IServico
    @Override
    public void remover(Usuario id) {
        RepUsuario.remover(id);
    }

    @Override
    public void alterar(int index, Usuario obj) {
        RepUsuario.atualizar(obj);
    }

    @Override
    public List<Usuario> listarTodos() {

        return RepUsuario.listar();
    }

}

