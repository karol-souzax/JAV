//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Classe Main para testar
public class Main {
    public static void main(String[] args) {
        // Criando apostas
        ApostaFutebol af = new ApostaFutebol("Maria", 100, "Flamengo");
        ApostaBasquete ab = new ApostaBasquete("João", 50, "Lakers");
        ApostaCorrida ac = new ApostaCorrida("Ana", 200, "Hamilton");

        // Usando métodos
        af.mostrarAposta();
        af.mostrarAposta("Brasileirão");
        af.calcularRetorno();

        ab.mostrarAposta(true);
        ab.calcularRetorno();

        ac.mostrarAposta(5);
        ac.calcularRetorno();
    }
}