import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        char[] letras = new char[7];
        System.out.println("Digite 7 letras:");
        for (int i = 0; i < letras.length; i++) {
            letras[i] = leitura.next().charAt(0);
        }
        System.out.println("Vogais digitadas:");
        for (char letra : letras) {
            if (Vogal(letra)) {
                System.out.print(letra + " ");
            }
        }
    }

    public static boolean Vogal(char c) {
        char letra = Character.toLowerCase(c);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}