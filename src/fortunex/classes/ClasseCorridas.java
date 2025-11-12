package fortunex.classes;

public class ClasseCorridas extends Evento {
    private String competidor1;
    private String competidor2;
    private double tempoCompetidor1;
    private double tempoCompetidor2;

    public ClasseCorridas(int i, String competidor1, String competidor2, double v, String hamilton) {
        this.competidor1 = competidor1;
        this.competidor2 = competidor2;
        this.tempoCompetidor1 = 0.0;
        this.tempoCompetidor2 = 0.0;
    }

    public void registrarTempoCompetidor1(double tempo) {
        this.tempoCompetidor1 = tempo;
    }

    public void registrarTempoCompetidor2(double tempo) {
        this.tempoCompetidor2 = tempo;
    }

    public String resultado() {
        if (tempoCompetidor1 == 0 || tempoCompetidor2 == 0) {
            return "A corrida ainda não terminou";
        }

        if (tempoCompetidor1 < tempoCompetidor2) {
            return competidor1 + " venceu com tempo de " + tempoCompetidor1 + " segundos";
        } else if (tempoCompetidor2 < tempoCompetidor1) {
            return competidor2 + " venceu com tempo de " + tempoCompetidor2 + " segundos";
        } else {
            return "Empate! Ambos terminaram com " + tempoCompetidor1 + " segundos";
        }
    }

    public void exibirTempos() {
        System.out.println(competidor1 + ": " + tempoCompetidor1 + " segundos");
        System.out.println(competidor2 + ": " + tempoCompetidor2 + " segundos");
    }

    @Override
    public void mostrarInfo() {

    }
}
