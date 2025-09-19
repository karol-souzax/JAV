package exercicios.java;
// par ou impar
import java.util.Scanner;
public class ati {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("digite um numero para saber se é par ou impar");
        int n=sc.nextInt();
        if ( n % 2 ==0){
            System.out.println("o numero é par");
        }
        else{
            System.out.println("o numero é impar");
        }
    }
}