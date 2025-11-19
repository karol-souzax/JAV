package fortunex.classes;

// ClasseCorridas herda de Evento e representa um evento de corrida
public class ClasseCorridas extends Evento {

    // nomes dos competidores
    private String competidor1;
    private String competidor2;

    // tempos registrados durante a corrida
    private double tempoCompetidor1;
    private double tempoCompetidor2;

    public ClasseCorridas(int i, String nome, String ignoredLocal, double v, String tipo) {

        // construtor recebendo dados, mas usando apenas os competidores
        this.id=i;
        this.nome=nome;
        this.local=local;
        this.valorAposta=v;
        this.tipo=tipo;
        this.competidor1 = competidor1;
        this.competidor2 = competidor2;
        // tempos começam zerados
        this.tempoCompetidor1 = 0.0;
        this.tempoCompetidor2 = 0.0;
    }

    public void registrarTempoCompetidor1(double tempo) {
        // registra o tempo final do competidor 1
        this.tempoCompetidor1 = tempo;
    }

    public void registrarTempoCompetidor2(double tempo) {
        // registra o tempo final do competidor 2
        this.tempoCompetidor2 = tempo;
    }

    public String resultado() {
        // verifica se ambos já têm tempo registrado
        if (tempoCompetidor1 == 0 || tempoCompetidor2 == 0) {
            return "A corrida ainda não terminou";
        }

        // determina vencedor comparando os tempos
        if (tempoCompetidor1 < tempoCompetidor2) {
            return competidor1 + " venceu com tempo de " + tempoCompetidor1 + " segundos";
        } else if (tempoCompetidor2 < tempoCompetidor1) {
            return competidor2 + " venceu com tempo de " + tempoCompetidor2 + " segundos";
        } else {
            // caso os tempos sejam iguais
            return "Empate! Ambos terminaram com " + tempoCompetidor1 + " segundos";
        }
    }

    public void exibirTempos() {
        // imprime os tempos atuais dos competidores
        System.out.println(competidor1 + ": " + tempoCompetidor1 + " segundos");
        System.out.println(competidor2 + ": " + tempoCompetidor2 + " segundos");
    }

    @Override
    public void mostrarInfo() {
        // método obrigatório por herdar de Evento, mas ainda não implementado
    }
}
