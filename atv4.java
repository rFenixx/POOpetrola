import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o horário: ");
        int hora = entrada.nextInt();
        if (hora >= 5 && hora <= 11) {
            System.out.println("Bom Dia!");
        } else if (hora >= 12 && hora <= 18) {
            System.out.println("Boa Tarde!");
        } else if (hora >= 19 && hora <= 23) {
            System.out.println("Boa Noite!");
        } else if (hora >= 24 && hora <= 4) {
            System.out.println("Vai Dormir!");
            entrada.close();
        }
    }
}
