package fortunex.servicos;

import fortunex.repositorios.RepAposta;

import java.util.List;

public class ApostaServico implements IServico<Object> {

    private RepAposta repAposta;

    public ApostaServico() {
        this.repAposta = new RepAposta();
    }


    public void adicionar(Object aposta) {
        repAposta.adicionarAposta(aposta);
    }


    public void remover(int id) {
        repAposta.removerAposta(id);
    }


    public Object buscarPorId(int id) {
        return repAposta.buscarApostaPorId(id);
    }


    public List<Object> listarTodos() {
        return repAposta.listarApostas();
    }
}

