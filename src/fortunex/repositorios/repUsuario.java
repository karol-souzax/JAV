package fortunex.repositorios;
import fortunex.classes.Usuario;

public class repUsuario implements Repositorio<Usuario> {
    private Usuario[] usuarios;
    private int indice;

    public repUsuario(int tamanho) {
        this.usuarios = new Usuario[tamanho];
        this.indice = 0;
    }

    @Override
    public void inserir(Usuario obj) {
        if (indice < usuarios.length) {
            usuarios[indice] = obj;
            indice++;
        } else {
            System.out.println("Repositorio cheio, nao e possivel inserir novo usuario.");
        }
    }

    @Override
    public void atualizar(Usuario obj) {
        for (int i = 0; i < indice; i++) {
            if (usuarios[i].getId() == obj.getId()) {
                usuarios[i] = obj;
                return;
            }
        }
        System.out.println("Usuario com ID " + obj.getId() + " nao encontrado.");
    }

    @Override
    public void remover(int id) {
        for (int i = 0; i < indice; i++) {
            if (usuarios[i].getId() == id) {
                usuarios[i] = usuarios[indice - 1]; // Substitui pelo ultimo elemento
                usuarios[indice - 1] = null; // Remove a referencia ao ultimo elemento
                indice--;
                return;
            }
        }
        System.out.println("Usuario com ID " + id + " nao encontrado.");
    }

    @Override
    public Usuario procurar(int id) {
        for (int i = 0; i < indice; i++) {
            if (usuarios[i].getId() == id) {
                return usuarios[i];
            }
        }
        System.out.println("Usuario com ID " + id + " nao encontrado.");
        return null;
    }

    @Override
    public boolean existe(int id) {
        for (int i = 0; i < indice; i++) {
            if (usuarios[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
}
