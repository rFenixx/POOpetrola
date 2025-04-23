import java.util.Scanner;
import java.util.Arrays;

public class atv8 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int[] vetor = new int[15];
        System.out.println("Digite 15 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leitura.nextInt();
        }
        System.out.println("Os números digitados são:");
        Arrays.sort(vetor);
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        leitura.close();
    }
}