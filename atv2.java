import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.print("Seu nome:");
        String nome = tecla.nextLine();
        System.out.format("Bom Dia " + nome + "!");
        tecla.close();
    }
}
