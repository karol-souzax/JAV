package POO.java.evento;

// Superclasse abstrata
public abstract class EventoEsportivo implements Aposta{
    String nomeEvento;
    String localEvento;
    double valorAposta;
    double valorPremio;// agora é atributo da classe

    // Construtor padrão, os dois não são obrigatórios
    //Útil quando você quer criar um objeto com valores padrão e depois alterar os atributos manualmente.
    /* public EventoEsportivo() {
        this.nomeEvento = "a definir";
        this.localEvento = "caruaru";
        this.valorAposta = 0;
    }*/

    // Construtor com parâmetros
    // Útil quando você quer criar um objeto já inicializado com valores específicos.
    public EventoEsportivo(String nomeEvento, String localEvento, double valorAposta) {
        this.nomeEvento = nomeEvento;
        this.localEvento = localEvento;
        this.valorAposta = valorAposta;
    }


    // Método normal
    public void mostrarInfo() {
        System.out.println("Nome do Evento: " + nomeEvento);
        System.out.println("Local do Evento: " + localEvento);
        System.out.println("Valor da Aposta: R$ " + valorAposta);
    }
    @Override
    // Método abstrato
    public abstract void calcularPremio();



}



