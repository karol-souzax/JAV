package fortunex.classes;

//classe abstrata (mae de todas as outras)
public abstract class Evento {

    // atributos protegidos: visíveis para subclasses
    protected int id;
    protected String nome;
    protected String local;
    protected double valorAposta;
    protected String tipo;


    public Evento() {
        // construtor padrão (sem parâmetros)
        // aqui os atributos recebem eles mesmos (não inicializa valores)
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
        // setter para definir o id do evento
        this.id = id;
    }

    // método abstrato: toda subclasse é obrigada a implementar
    public abstract void mostrarInfo();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        // setter para o nome do evento
        this.nome = nome;
    }

    public double getValorAposta() {
        return valorAposta;
    }
    public void setValorAposta(double valorAposta) {
        // define o valor da aposta no evento
        this.valorAposta = valorAposta;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        // define o tipo do evento (ex: corrida, luta, jogo, etc.)
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        // setter para o local onde o evento acontece
        this.local = local;
    }
}
