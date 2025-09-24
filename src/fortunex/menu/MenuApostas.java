// Conteúdo do arquivo MenuApostas.java
package fortunex.menu;

import fortunex.classes.Aposta;
import fortunex.classes.Evento;
import fortunex.repositorios.RepEvento;
import fortunex.servicos.ApostaServico;
import fortunex.servicos.EventoServico;

import java.util.Scanner;

public class MenuApostas {

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        EventoServico eventoServico = new EventoServico();
        ApostaServico apostaServico = new ApostaServico();

        int opcao;
        do {
            System.out.println("\n=== MENU DE APOSTAS ===");
            System.out.println("1. Listar Eventos Disponíveis");
            System.out.println("2. Fazer uma Nova Aposta");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Eventos Disponíveis ---");
                    // O método listarTodos() já retorna a lista de eventos
                    for (Evento evento : eventoServico.listarTodos()) {
                        evento.mostrarInfo(); // Exibe as informações do evento
                    }
                    break;
                case 2:
                    System.out.println("\n--- Fazer Nova Aposta ---");
                    System.out.print("Digite o ID do evento para apostar: ");
                    int idEvento = sc.nextInt();
                    sc.nextLine();

                    // O usuário precisa selecionar o tipo de aposta e o valor
                    System.out.print("Digite o valor da aposta: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    // Lógica para criar a aposta e adicioná-la ao sistema
                    Aposta novaAposta = new Aposta(1, valor, 2.0); // ID, valor, odd
                    apostaServico.adicionar(novaAposta);
                    System.out.println("Aposta realizada com sucesso!");
                    break;
                case 0:
                    System.out.println("Saindo do menu de apostas...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}