import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// fazer o scanner para ler os valores do usuário

        System.out.println("Digite o número de elementos do array:");
        int n = sc.nextInt();// lê o número de elementos do array
        int[] array = new int[n];// cria o array com o tamanho n

        // Preenche o array com os valores do usuário
        for (int i = 0; i < n; i++) {// percorre o array
            System.out.print("Digite o valor da posição " + i + ": ");
            array[i] = sc.nextInt();// lê o valor do usuário e armazena na posição i do array
        }

        // Define o tamanho da matriz
        System.out.println("Digite o número de linhas da matriz:");
        int linhas = sc.nextInt();
        System.out.println("Digite o número de colunas da matriz:");
        int colunas = sc.nextInt();

        if (linhas * colunas != n) {
            System.out.println("Erro: o tamanho da matriz não corresponde ao número de elementos do array!");
            sc.close();
            return;
        }

        int[][] matriz = new int[linhas][colunas];// cria a matriz com o tamanho definido

        // Passa os valores do array para a matriz
        int k = 0; // índice do array
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = array[k];
                k++;
            }
        }

        // Imprime a matriz
        System.out.println("Matriz resultante:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
