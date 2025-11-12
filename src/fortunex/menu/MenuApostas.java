// Conteúdo do arquivo MenuApostas.java
package fortunex.menu;
import java.util.Scanner;
import java.util.List;
import fortunex.classes.BancoEventos;
import fortunex.classes.Evento;

public class MenuApostas {

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== MENU DE APOSTAS ===");
            System.out.println("1. Listar eventos");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    List<Evento> eventos = BancoEventos.getEventos();
                    System.out.println("📌 Lista de Eventos Disponíveis:");
                    for (Evento e : eventos) {
                        System.out.println("ID: " + e.getId() +
                                " | Nome: " + e.getNome() +
                                " | Local: " + e.getLocal() +
                                " | Valor: R$" + e.getValorAposta() +
                                " | Tipo: " + e.getTipo());
                    }
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