// Conteúdo do arquivo MenuApostas.java
package fortunex.menu;
import java.util.Scanner;
import java.util.List;
import fortunex.classes.BancoEventos;
import fortunex.classes.Evento;
import fortunex.classes.Aposta;
import fortunex.classes.BancoApostas;

public class MenuApostas {

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== MENU DE APOSTAS ===");
            System.out.println("1. Listar eventos");
            System.out.println("2. Fazer aposta (em desenvolvimento)");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    List<Evento> eventos = BancoEventos.getEventos();// obtém a lista de eventos do banco
                    System.out.println("📌 Lista de Eventos Disponíveis:");
                    for (Evento e : eventos) {
                        System.out.println("ID: " + e.getId() +
                                " | Nome: " + e.getNome() +
                                " | Local: " + e.getLocal() +
                                " | Valor: R$" + e.getValorAposta() +
                                " | Tipo: " + e.getTipo());
                    }
                    break;
                case 2:
                    List<Evento> listaEventos = BancoEventos.getEventos();// obtém a lista de eventos do banco

                    if (listaEventos.isEmpty()) {
                        System.out.println("Nenhum evento disponível para apostar.");
                        break;
                    }

                    System.out.println("\n--- Eventos disponíveis ---");
                    for (Evento e : listaEventos) {
                        System.out.println("ID: " + e.getId() +
                                " | Nome: " + e.getNome());
                    }

                    System.out.print("\nDigite o ID do evento que deseja apostar: ");
                    int idEscolhido = sc.nextInt();
                    sc.nextLine();

                    Evento eventoSelecionado = null;// variável para armazenar o evento escolhido

                    for (Evento e : listaEventos) {// procura o evento pelo ID
                        if (e.getId() == idEscolhido) {
                            eventoSelecionado = e;// atribui o evento encontrado
                            break;
                        }
                    }

                    if (eventoSelecionado == null) {// se não encontrou o evento
                        System.out.println("Evento não encontrado!");
                        break;
                    }

                    System.out.print("Digite o valor da aposta: ");// solicita o valor da aposta
                    double valorAposta = sc.nextDouble();
                    sc.nextLine();

                    // gerar id automático para aposta
                    int idAposta = BancoApostas.getApostas().size() + 1;

                    Aposta novaAposta = new Aposta(idAposta, valorAposta, eventoSelecionado) {// cria uma nova aposta
                        @Override
                        public void calcularOdds() {

                        }
                    };
                    BancoApostas.adicionarAposta(novaAposta);// adiciona a aposta ao banco

                    System.out.println("\nAposta registrada com sucesso!");
                    System.out.println("Aposta ID: " + idAposta +
                            " | Evento: " + eventoSelecionado.getNome() +
                            " | Valor: R$" + valorAposta);
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");


            }

        } while (opcao != 0);
    }
}