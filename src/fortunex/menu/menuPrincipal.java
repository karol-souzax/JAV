// Conteúdo do arquivo menuPrincipal.java
package fortunex.menu;
import fortunex.classes.Usuario;
import fortunex.servicos.UsuarioServico;
import java.util.Scanner;

import fortunex.classes.*;
import fortunex.servicos.UsuarioServico;

public class menuPrincipal {

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        UsuarioServico usuarioServico = new UsuarioServico();

        int opcao;
        do {
            System.out.println("\n=== FORTUNEX - MENU ===");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Fazer Login");
            System.out.println("3. Listar Usuários");
            System.out.println("4. Remover Usuário");
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
                    System.out.print("Senha: ");
                    String senha = sc.nextLine();
                    Usuario novoUsuario = new Usuario(nome, email, senha);
                    usuarioServico.adicionar(novoUsuario);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Email: ");
                    String emailLogin = sc.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = sc.nextLine();

                    if (usuarioServico.autenticar(emailLogin, senhaLogin)) {
                        System.out.println("✅ Login realizado com sucesso!");

                        MenuApostas.iniciar(); // Chamada para a outra classe
                    } else {
                        System.out.println("❌ Email ou senha incorretos!");
                    }
                    break;
                case 3:
                    usuarioServico.listarTodos();
                    break;
                case 4:
                    System.out.print("Email do usuário para remover: ");
                    String emailRemover = sc.nextLine();
                    Usuario usuarioRemover = new Usuario("", emailRemover, "");
                    usuarioServico.remover(usuarioRemover);
                    System.out.println("Usuário removido, se existir.");
                    break;
                case 0:
                    System.out.println(" Saindo do sistema...");
                    break;
                default:
                    System.out.println(" Opção inválida!");
            }
        } while (opcao != 0);
    }
}