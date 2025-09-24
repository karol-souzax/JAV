package fortunex.repositorios;
import fortunex.classes.Evento;
import fortunex.classes.Usuario;
import java.util.ArrayList;
import java.util.List;

public class RepUsuario implements Repositorio<Usuario> {
    private final List<Usuario> usuarios = new ArrayList<>();

    public void cadastrar(Usuario u) {

        usuarios.add(u);
    }

    public void atualizar(Usuario obj) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == obj.getId()) {
                usuarios.set(i, obj);
                return;
            }
        }
        System.out.println("Usuario com ID " + obj.getId() + " nao encontrado.");
    }

    public void remover(Evento id) {
        usuarios.remove(id);
    }



    public List<Usuario> listar() {

        return usuarios;
    }


}
