package fortunex.classes;

public abstract class Evento {
    protected String nome;
    protected String local;
    protected double valorAposta;

    // Construtor padrão
    public Evento() {}

    // Construtor completo
    public Evento(String nome, String local, double valorAposta) {
        this.nome = nome;
        this.local = local;
        this.valorAposta = valorAposta;
    }

    // Método abstrato
    public abstract void mostrarInfo();

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    public double getValorAposta() { return valorAposta; }
    public void setValorAposta(double valorAposta) { this.valorAposta = valorAposta; }

     public Object getId() {
         return null;
     }
}