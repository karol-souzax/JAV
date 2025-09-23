package fortunex.classes;
import java.util.Scanner;
public class Usuario extends rename {


    public Usuario(String nome, String email, String senha) {

    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            Usuario user = new Usuario(nome, email, senha);

            System.out.print("Email para login: ");
            String emailLogin = scanner.nextLine();
            System.out.print("Senha para login: ");
            String senhaLogin = scanner.nextLine();

            }

        }
    }



// tem q sempre colocar essa escrita "extends rename" para indicar que essa classe é uma subclasse de rename
//troquem o nome da classe entidade1 para o nome que quiserem, mas sempre lembrando de colocar "extends rename"
//façam o mesmo para as outras classes entidade2, entidade3 e entidade4