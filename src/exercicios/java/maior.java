package exercicios.java;
import java.util.Scanner;
// maior de 3 numeros

public class maior {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        int n1= sc.nextInt();
        System.out.println("digite o segundo numero");
        int n2= sc.nextInt();
        System.out.println("digite o terceiro numero");
        int n3= sc.nextInt();
        if (n1>=n2 && n1>=n3){
            System.out.println("o maior numero é " + n1);
        }
        else if (n2>=n1 && n2>=n3){
            System.out.println("o maior numero é " + n2);
        }
        else{
            System.out.println("o maior numero é " + n3);
        sc.close();

        }

    }

}
