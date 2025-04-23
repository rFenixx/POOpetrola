import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Seu nome:");
        String nome = tecla.nextLine();
        for (int i = 0; i < 10; i++)
            System.out.println("Bom Dia " + nome + "!");
        tecla.close();
    }
}