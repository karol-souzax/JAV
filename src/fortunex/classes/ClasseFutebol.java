package fortunex.classes;

public class ClasseFutebol {
    private String timeCasa;
    private String timeVisitante;
    private int golsCasa;
    private int golsVisitante;

    public ClasseFutebol() {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsCasa = 0;
        this.golsVisitante = 0;

    }
    public void marcarGolsCasa(){
        golsCasa++;
    }
    public void marcarGolVisitante(){
        golsVisitante++;
    }
    public void exibirPlacar(){
        System.out.println(timeCasa + " " + golsCasa + " x " + golsVisitante + " " + timeVisitante);

    }
    public String resultado() {
        if(golsCasa > golsVisitante){
            return timeCasa + " vendeu !!";
        } else if (golsVisitante > golsCasa){
            return timeVisitante + "venceu !!";
        } else {
            return "empate !!";

        }
    }

}
