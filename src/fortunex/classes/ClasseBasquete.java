package fortunex.classes;

// ClasseBasquete herda de Evento e representa um jogo de basquete
public class ClasseBasquete extends Evento {

    // nomes dos times participantes
    private String timeCasa;
    private String timeVisitante;

    // pontos acumulados durante o jogo
    private int pontosCasa;
    private int pontosVisitantes;

    public ClasseBasquete(int i, String nome, String local, double va, String tipo) {
        // inicializando os atributos herdados da classe Evento
        this.id = i;
        this.nome = nome;
        this.local = local;
        this.valorAposta = va;
        this.tipo = tipo;

        // times não são recebidos no construtor, então ficam como null
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;

        // pontuações iniciam zeradas
        this.pontosCasa = 0;
        this.pontosVisitantes = 0;
    }

    public void marcarPontosCasa(int pontos) {
        // soma pontos ao time da casa
        pontosCasa += pontos;
    }

    public void marcarPontosVisitante(int pontos) {
        // soma pontos ao time visitante
        pontosVisitantes += pontos;
    }

    public String resultado() {
        // determina vencedor com base na pontuação
        if (pontosCasa > pontosVisitantes) {
            return timeCasa + " venceu!!!";
        } else if (pontosCasa < pontosVisitantes) {
            return timeVisitante + " venceu!!!";
        } else {
            // caso de empate
            return "Empate!!!";
        }
    }

    public void exibirPlacar() {
        // exibe o placar formatado
        System.out.println(timeCasa + " " + pontosCasa + " x " + pontosVisitantes + " " + timeVisitante);
    }

    public double probabilidadeCasa() {
        // calcula probabilidade baseada na pontuação
        int total = pontosCasa + pontosVisitantes;
        if (total == 0) return 0.5; // probabilidade neutra se ninguém pontuou
        return (double) pontosCasa / total;
    }

    public double probabilidadeVisitante() {
        // cálculo equivalente para o time visitante
        int total = pontosCasa + pontosVisitantes;
        if (total == 0) return 0.5;
        return (double) pontosVisitantes / total;
    }

    @Override
    public void mostrarInfo() {
        // exibe informações do evento de basquete
    }
}