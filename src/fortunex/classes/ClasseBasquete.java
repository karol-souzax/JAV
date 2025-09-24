package fortunex.classes;

public class ClasseBasquete extends Evento {
    private String timeCasa;
    private String timeVisitante;
    private int pontosCasa;
    private int pontosVisitantes;

    public ClasseBasquete(int i, String timeCasa, String timeVisitante, double v, String lakersXCeltics) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitantes = 0;
    }


    public void marcarPontosCasa(int pontos) {
        pontosCasa += pontos;
    }

    public void marcarPontosVisitante(int pontos) {
        pontosVisitantes += pontos;
    }


    public String resultado() {
        if (pontosCasa > pontosVisitantes) {
            return timeCasa + " venceu!!!";
        } else if (pontosCasa < pontosVisitantes) {
            return timeVisitante + " venceu!!!";
        } else {
            return "Empate!!!";
        }
    }

    public void exibirPlacar() {
        System.out.println(timeCasa + " " + pontosCasa + " x " + pontosVisitantes + " " + timeVisitante);
    }

    public double probabilidadeCasa() {
        int total = pontosCasa + pontosVisitantes;
        if (total == 0) return 0.5;
        return (double) pontosCasa / total;
    }

    public double probabilidadeVisitante() {
        int total = pontosCasa + pontosVisitantes;
        if (total == 0) return 0.5;
        return (double) pontosVisitantes / total;
    }

    @Override
    public void mostrarInfo() {

    }
}
