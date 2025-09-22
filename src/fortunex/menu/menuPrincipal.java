package fortunex.menu;


import java.util.Scanner;
import fortunex.classes.Usuario;
import fortunex.servicos.UsuarioServico;

public class menuPrincipal {
    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        UsuarioServico usuarioServico = new UsuarioServico();

        int opcao;
        do {
            System.out.println("\n=== BETFAIR - MENU ===");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Remover Usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    usuarioServico.cadastrar(new Usuario(nome, email));
                    break;
                case 2:
                    usuarioServico.listar();
                    break;
                case 3:
                    System.out.print("Nome do usuário para remover: ");
                    String nomeRemover = sc.nextLine();
                    Usuario usuario = new Usuario(nomeRemover);
                    usuarioServico.remover(usuario);
                    break;
                case 0:
                    System.out.println("👋 Saindo do sistema...");
                    break;
                default:
                    System.out.println("❌ Opção inválida!");
            }
        } while (opcao != 0);
    }
}