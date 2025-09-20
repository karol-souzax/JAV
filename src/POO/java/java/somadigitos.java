package POO.java.java;
import java.util.Scanner;
// soma os digitos de um numero
// ex: 1234 = 1+2+3+4 = 10

public class somadigitos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num=sc.nextInt();
        int soma=0;

        while (num>0){// enquanto o número for maior que 0
            soma=soma+num%10;// pega o último dígito
            num=num/10;// remove o último dígito
        }
        System.out.println("A soma dos dígitos é: " + soma);// imprime a soma dos dígitos
        sc.close();
    }

}

