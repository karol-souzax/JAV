package fortunex.repositorios;
import fortunex.classes.Usuario;
//
public class repUsuario implements Repositorio<Usuario> {
    private Usuario[] usuarios;
    private int indice;//indice para controlar a posicao do array

    public repUsuario(int tamanho) {//tamanho do array
        this.usuarios = new Usuario[tamanho];
        this.indice = 0;
    }

    @Override
    public void inserir(Usuario obj) {//inserir um usuario no array
        if (indice < usuarios.length) {//verifica se o array nao esta cheio
            usuarios[indice] = obj;//insere o usuario na posicao do indice
            indice++;
        } else {
            System.out.println("Repositorio cheio, nao e possivel inserir novo usuario.");
        }
    }

    @Override
    public void atualizar(Usuario obj) {//atualiza um usuario no array
        for (int i = 0; i < indice; i++) {//percorre o array
            if (usuarios[i].getId() == obj.getId()) {//verifica se o id do usuario é igual ao id do usuario a ser atualizado
                usuarios[i] = obj;
                return;
            }
        }
        System.out.println("Usuario com ID " + obj.getId() + " nao encontrado.");
    }

    @Override
    public void remover(int id) {//remove um usuario do array
        for (int i = 0; i < indice; i++) {
            if (usuarios[i].getId() == id) {//verifica se o id do usuario é igual ao id do usuario a ser removido
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
    public boolean existe(int id) {//verifica se um usuario existe no array
        for (int i = 0; i < indice; i++) {//percorre o array
            if (usuarios[i].getId() == id) {//verifica se o id do usuario é igual ao id do usuario a ser verificado
                return true;
            }
        }
        return false;
    }
}
