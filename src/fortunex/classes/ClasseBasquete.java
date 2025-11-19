// Define o pacote (namespace) onde a classe ClasseBasquete reside.
package fortunex.classes;

// ClasseBasquete herda de Evento e representa um jogo de basquete
// Declara a classe pública ClasseBasquete, que estende a classe base Evento (herança).
public class ClasseBasquete extends Evento {

    // nomes dos times participantes
    // Atributo privado para armazenar o nome do time da casa.
    private String timeCasa;
    // Atributo privado para armazenar o nome do time visitante.
    private String timeVisitante;

    // pontos acumulados durante o jogo
    // Atributo privado para armazenar a pontuação atual do time da casa.
    private int pontosCasa;
    // Atributo privado para armazenar a pontuação atual do time visitante.
    private int pontosVisitantes;

    // Construtor da classe, recebendo os atributos básicos de um Evento.
    public ClasseBasquete(int i, String nome, String local, double va, String tipo) {
        // inicializando os atributos herdados da classe Evento
        // Inicializa o ID do evento (herdado).
        this.id = i;
        // Inicializa o nome do evento (herdado).
        this.nome = nome;
        // Inicializa o local do evento (herdado).
        this.local = local;
        // Inicializa o valor da aposta (herdado).
        this.valorAposta = va;
        // Inicializa o tipo do evento (herdado).
        this.tipo = tipo;

        // times não são recebidos no construtor, então ficam como null
        // Inicializa o nome do time da casa (deve ser definido via setter).
        this.timeCasa = null;
        // Inicializa o nome do time visitante (deve ser definido via setter).
        this.timeVisitante = null;

        // pontuações iniciam zeradas
        // Inicializa a pontuação do time da casa em zero.
        this.pontosCasa = 0;
        // Inicializa a pontuação do time visitante em zero.
        this.pontosVisitantes = 0;
    }

    // --- Métodos Setter para os Nomes dos Times ---

    // Método Setter para definir o nome do time da casa.
    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    // Método Setter para definir o nome do time visitante.
    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    // --- Outros Métodos ---

    // Método público para adicionar pontos ao time da casa.
    public void marcarPontosCasa(int pontos) {
        // soma pontos ao time da casa
        // Adiciona o valor 'pontos' à pontuação acumulada do time da casa.
        pontosCasa += pontos;
    }

    // Método público para adicionar pontos ao time visitante.
    public void marcarPontosVisitante(int pontos) {
        // soma pontos ao time visitante
        // Adiciona o valor 'pontos' à pontuação acumulada do time visitante.
        pontosVisitantes += pontos;
    }

    // Método para determinar e retornar a string do resultado final.
    public String resultado() {
        // determina vencedor com base na pontuação
        // Verifica se o time da casa tem mais pontos.
        if (pontosCasa > pontosVisitantes) {
            // Retorna a mensagem de vitória do time da casa.
            return timeCasa + " venceu!!!";
            // Caso contrário, verifica se o time visitante tem mais pontos.
        } else if (pontosCasa < pontosVisitantes) {
            // Retorna a mensagem de vitória do time visitante.
            return timeVisitante + " venceu!!!";
            // Se nenhum dos casos acima for verdadeiro, é um empate.
        } else {
            // caso de empate
            // Retorna a mensagem de empate.
            return "Empate!!!";
        }
    }

    // Método para imprimir o placar atual do jogo no console.
    public void exibirPlacar() {
        // exibe o placar formatado
        // Imprime o placar no formato: TimeCasa Pontos x Pontos TimeVisitante.
        System.out.println(timeCasa + " " + pontosCasa + " x " + pontosVisitantes + " " + timeVisitante);
    }

    // Método para calcular a probabilidade de vitória do time da casa (baseado na pontuação atual).
    public double probabilidadeCasa() {
        // calcula probabilidade baseada na pontuação
        // Calcula o total de pontos marcados no jogo.
        int total = pontosCasa + pontosVisitantes;
        // Se o total for zero, a probabilidade é neutra (50%).
        if (total == 0) return 0.5; // probabilidade neutra se ninguém pontuou
        // Calcula a probabilidade como a proporção dos pontos da casa em relação ao total de pontos.
        return (double) pontosCasa / total;
    }

    // Método para calcular a probabilidade de vitória do time visitante.
    public double probabilidadeVisitante() {
        // cálculo equivalente para o time visitante
        // Calcula o total de pontos marcados.
        int total = pontosCasa + pontosVisitantes;
        // Se o total for zero, a probabilidade é neutra (50%).
        if (total == 0) return 0.5;
        // Calcula a probabilidade como a proporção dos pontos do visitante em relação ao total.
        return (double) pontosVisitantes / total;
    }

    // Marca o método como uma substituição de um método da superclasse (Evento).
    @Override
    // Método que exibe todas as informações relevantes do evento de basquete.
    public void mostrarInfo() {
        // exibe informações do evento de basquete

        // Chamada sugerida ao método da superclasse Evento para exibir informações gerais (ID, Nome, Local, etc.).
        // super.mostrarInfo();

        // Exibe as informações específicas do jogo de basquete.
        System.out.println("--- Detalhes do Jogo de Basquete ---");
        System.out.println("Times: " + timeCasa + " vs " + timeVisitante);
        this.exibirPlacar(); // Chama o método para mostrar a pontuação atual.
        System.out.println("Probabilidade Casa: " + (probabilidadeCasa() * 100) + "%");
        System.out.println("Probabilidade Visitante: " + (probabilidadeVisitante() * 100) + "%");
    }
}