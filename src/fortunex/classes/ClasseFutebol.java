package fortunex.classes;

// ClasseFutebol herda de Evento e representa um jogo de futebol
public class ClasseFutebol extends Evento {

    // times participantes da partida
    private String timeCasa;
    private String timeVisitante;

    // contagem de gols
    private int golsCasa;
    private int golsVisitante;

    public ClasseFutebol(int i, String nome, String local, double v, String tipo) {
        // inicializando os atributos herdados da classe Evento
        this.id=i;
        this.nome=nome;
        this.local=local;
        this.valorAposta=v;
        this.tipo=tipo;

        // inicialização dos times (aqui recebem null porque não há parâmetros para eles)
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;

        // placar começa zerado
        this.golsCasa = 0;
        this.golsVisitante = 0;
    }

    public void marcarGolCasa() {
        // incrementa gols do time da casa
        golsCasa++;
    }

    public void marcarGolVisitante() {
        // incrementa gols do time visitante
        golsVisitante++;
    }

    public void exibirPlacar() {
        // exibe o placar formatado
        System.out.println(timeCasa + " " + golsCasa + " x " + golsVisitante + " " + timeVisitante);
    }

    public String resultado() {
        // determina o vencedor com base no número de gols
        if (golsCasa > golsVisitante) {
            return timeCasa + " venceu!!";
        } else if (golsVisitante > golsCasa) {
            return timeVisitante + " venceu!!";
        } else {
            // empate se os gols forem iguais
            return "Empate!!";
        }
    }

    @Override
    public void mostrarInfo() {
        // método obrigatório da classe Evento, ainda não implementado
    }
}
