package fortunex.classes;

public class ClasseFutebol extends Evento {
    private String timeCasa;
    private String timeVisitante;
    private int golsCasa;
    private int golsVisitante;

    public ClasseFutebol(int i, String timeCasa, String timeVisitante, double v, String flamengoXPalmeiras) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsCasa = 0;
        this.golsVisitante = 0;
    }

    public void marcarGolCasa() {
        golsCasa++;
    }

    public void marcarGolVisitante() {
        golsVisitante++;
    }

    public void exibirPlacar() {
        System.out.println(timeCasa + " " + golsCasa + " x " + golsVisitante + " " + timeVisitante);
    }

    public String resultado() {
        if (golsCasa > golsVisitante) {
            return timeCasa + " venceu!!";
        } else if (golsVisitante > golsCasa) {
            return timeVisitante + " venceu!!";
        } else {
            return "Empate!!";
        }
    }

    @Override
    public void mostrarInfo() {

    }
}

