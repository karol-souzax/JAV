package fortunex.classes;

public abstract class Evento {
    protected int id;
    protected String nome;
    protected String local;
    protected double valorAposta;
    protected String tipo;


    public Evento() {
        this.id= id;
        this.nome = nome;
        this.valorAposta = valorAposta;
        this.tipo = tipo;
        this.local= local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void mostrarInfo();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAposta() {
        return valorAposta;
    }
    public void setValorAposta(double valorAposta) {
        this.valorAposta = valorAposta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}