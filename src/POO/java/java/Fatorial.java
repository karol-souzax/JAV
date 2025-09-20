package POO.java.java;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial:");
        int num = sc.nextInt();

        // mostra o cálculo do fatorial em uma linha
        System.out.print(num + "! = ");
        if (num<0){// fatorial não existe para números negativos, então verifica se o número é negativo
            System.out.print("não existe fatorial para esse número");//se quiser pode adicionar um else no fim daqui
        }
        long fatorial = 1;// variável para armazenar o fatorial, começa com 1
// esse i vai ser o número que vai ser multiplicado, começa com o número digitado, e o num vai diminuir até chegar em 1
        for (int i = num; i >= 1; i--) {// percorre do número até 1, vai decrescendo, presta atenção que é i--
            fatorial *= i;// multiplica o fatorial pelo número atual
            System.out.print(i);// imprime o número atual
            if (i > 1) {// se não for o último número, imprime o "x"
                System.out.print(" x ");
            }

        }
        // mostra o resultado
        System.out.println(" = " + fatorial);

        sc.close();
    }
}