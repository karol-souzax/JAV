package fortunex.classes;

public class ClasseBasquete {
    private String timeCasa;
    private String timeVisitante;
    private int pontosCasa;
    private int pontosVisitantes;

    public ClasseBasquete(String timeCasa, String timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitantes = 0;
    }
    public void marcarPontosCasa(int pontos) {
        pontosCasa += pontos;
    }
    public void marcarPontosVisitante(int pontos){
        pontosCasa += pontos;
    }

    public String resultad0(){
        if (pontosCasa > pontosVisitantes){
            return timeCasa + "venceu!!!";
        }else if (pontosCasa < pontosVisitantes){
            return timeVisitante + "Venceu!!!";
        }else{
            return "empate!!!";
        }
    }

    public void exibirPlacar(){
        System.out.println(timeCasa + " " + pontosCasa + " x " + pontosVisitantes + " " + timeVisitante);
    }
    public double probabilidadeCasa() {
        int total = pontosCasa + pontosVisitantes;
        if (total == 0) return 0.5;
        return(double) pontosCasa / total;
    }
    public double probabilidadeVisitante() {
        int total = pontosCasa + pontosVisitantes;
        if (total == 0) return 0.5;
        return (double) pontosVisitantes / total;
    }

}
