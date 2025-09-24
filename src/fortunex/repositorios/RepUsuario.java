package fortunex.repositorios;

import fortunex.classes.Usuario;
import java.util.ArrayList;
import java.util.List;

public class RepUsuario implements Repositorio<Usuario> {
    private final List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void cadastrar(Usuario u) {
        usuarios.add(u);
    }

    public void atualizar(Usuario obj) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId().equals(obj.getId())) {
                usuarios.set(i, obj);
                return;
            }
        }
        System.out.println("Usuario com ID " + obj.getId() + " nao encontrado.");
    }

    @Override // Adicione a anotação para indicar que está sobrescrevendo o método da interface
    public void remover(Usuario u) {
        usuarios.remove(u);
    }

    @Override
    public List<Usuario> listar() {
        return usuarios;
    }
}