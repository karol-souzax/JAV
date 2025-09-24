// Conteúdo do arquivo UsuarioServico.java
package fortunex.servicos;

import fortunex.classes.Usuario;
import fortunex.repositorios.RepUsuario;

import java.util.List;

public class UsuarioServico implements IServico<Usuario> {

    private final RepUsuario RepUsuario;

    public UsuarioServico() {
        this.RepUsuario = new RepUsuario();
    }

    // Método para autenticar o login
    public boolean autenticar(String email, String senha) {
        for (Usuario u : RepUsuario.listar()) {
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void adicionar(Usuario usuario) {
        RepUsuario.cadastrar(usuario);
    }

    @Override
    public void remover(Usuario usuario) {
        RepUsuario.remover(usuario);
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