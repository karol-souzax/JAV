// Conteúdo do arquivo Evento.java
package fortunex.classes;

public abstract class Evento {
    protected int id; // Novo atributo ID
    protected String nome;
    protected String local;
    protected double valorAposta;

    public Evento() {}

    public Evento(int id, String nome, String local, double valorAposta) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.valorAposta = valorAposta;
    }

    public int getId() {
        return id;
    }

    public abstract void mostrarInfo();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    public double getValorAposta() { return valorAposta; }
    public void setValorAposta(double valorAposta) { this.valorAposta = valorAposta; }
}