import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe a operação:\nSoma/+\nSub/-\nMulti/x\nDiv/ /");
        String operacao = leitura.nextLine();

        System.out.print("Digite um número: ");
        double n1 = leitura.nextDouble();
        System.out.print("Digite outro número: ");
        double n2 = leitura.nextDouble();
        System.out.print(calculadora(n1, n2, operacao));
        leitura.close();

    }

    public static double calculadora(double n1, double n2, String operacao) {
        double resultado = 0;
        if (operacao.equals("+")) {
            resultado = n1 + n2;
        } else if (operacao.equals("-")) {
            resultado = n1 - n2;
        } else if (operacao.equals("x")) {
            resultado = n1 * n2;
        } else if (operacao.equals("/")) {
            resultado = n1 / n2;
        }
        return resultado;

    }
}
