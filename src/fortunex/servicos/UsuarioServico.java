package fortunex.servicos;

import fortunex.classes.Usuario;
import fortunex.repositorios.repUsuario;

import java.util.List;

public class UsuarioServico implements IServico<Usuario> {

    private repUsuario repUsuario;

    public UsuarioServico() {
        this.repUsuario = new repUsuario();
    }


    public void adicionar(Usuario usuario) {
        repUsuario.adicionarUsuario(usuario);
    }


    public void remover(int id) {
        repUsuario.removerUsuario(id);
    }


    public Usuario buscarPorId(int id) {
        return repUsuario.buscarUsuarioPorId(id);
    }


    public List<Usuario> listarTodos() {
        return repUsuario.listarUsuarios();
    }
}

