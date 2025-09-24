// Conteúdo do arquivo MenuApostas.java
package fortunex.menu;
import fortunex.menu.BancoEventos;
import fortunex.classes.Aposta;
import fortunex.classes.Evento;
import fortunex.servicos.ApostaServico;
import fortunex.servicos.EventoServico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuApostas {

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        EventoServico eventoServico = new EventoServico();
        ApostaServico apostaServico = new ApostaServico();
        List<Evento> eventos = new ArrayList<>();


        int opcao;
        do {
            System.out.println("\n=== MENU DE APOSTAS ===");
            System.out.println("1. Listar Eventos Disponíveis");
            System.out.println("2. Fazer uma Nova Aposta");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha

            switch (opcao) {//
                case 1:
                    System.out.println("📌 Lista de Eventos Disponíveis:");
                    for (Evento e : BancoEventos.getEventos()) {
                        System.out.println("ID: " + e.getId() + " | " + e.getNome() + " | Local: " + e.getLocal() + " | Valor: R$" + e.getValorAposta());
                    }
                    break;
                case 2:
                    System.out.print("Digite o ID do evento: ");
                    int idEvento = sc.nextInt();

                    Evento eventoEscolhido = null;
                    for (Evento e : BancoEventos.getEventos()) {
                        if (e.getId() == idEvento) {
                            eventoEscolhido = e;
                            break;
                        }
                    }

                    if (eventoEscolhido != null) {
                        System.out.print("Digite o valor da aposta: ");
                        double valor = sc.nextDouble();
                        Aposta aposta1 = new Aposta(101, 50.0, 2.5, null, eventoEscolhido) {
                            @Override
                            public void calcularOdds() {

                            }

                        };
                        Aposta aposta = new Aposta(101, 50.0, 2.5, null, eventoEscolhido) {
                            @Override
                            public void calcularOdds() {

                            }
                        };
                        aposta.mostrarAposta();
                    } else {
                        System.out.println("❌ Evento não encontrado!");
                    }
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