import java.time.LocalTime;

public class atv7 {
    public static void main(String[] args) {
    }

        LocalTime horaAtual = LocalTime.now();
        int hora = horaAtual.getHour();
        if (hora >= 5 && hora <= 11) {
            System.out.println(hora + "Bom Dia!");
        } else if (hora >= 12 && hora <= 18) {
            System.out.println(hora + "Boa Tarde!");
        } else if (hora >= 19 && hora <= 23) {
            System.out.println(hora + "Boa Noite!");
        } else { 
            System.out.println(hora + "Vai dormir!");
        }
    }
