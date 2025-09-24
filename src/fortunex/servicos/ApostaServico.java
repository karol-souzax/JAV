package fortunex.servicos;
import fortunex.classes.Aposta;
import fortunex.classes.Usuario;
import fortunex.repositorios.RepAposta;

import java.util.List;

public class ApostaServico implements IServico<Aposta> {
    private final RepAposta RepAposta;

    public ApostaServico() {

        this.RepAposta = new RepAposta();
    }

    @Override
    public void adicionar(Aposta aposta) {
        RepAposta.cadastrar(aposta);
    }


    public void remover(Aposta aposta) {
        RepAposta.remover(aposta);
    }



    public void alterar(int index, Aposta obj) {
        RepAposta.atualizar(obj);
    }

    public List<Aposta> listarTodos() {
        return RepAposta.listar();
    }
}

