package Empresa_MEG;

import java.time.LocalDate;
import java.util.Scanner;

public class EntradaSalida {

    public static String leerString(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public static int leerInt(Scanner sc, String msg) {
        System.out.print(msg);
        return Integer.parseInt(sc.nextLine());
    }

    public static double leerDouble(Scanner sc, String msg) {
        System.out.print(msg);
        return Double.parseDouble(sc.nextLine());
    }

    public static LocalDate leerFecha(Scanner sc) {
        int dia, mes, anio;

        do {
            dia = EntradaSalida.leerInt(sc, "Dia (1-31): ");
            if (dia < 1 || dia > 31) {
                System.out.println("Error: dia invalido.");
            }
        } while (dia < 1 || dia > 31);

        do {
            mes = EntradaSalida.leerInt(sc, "Mes (1-12): ");
            if (mes < 1 || mes > 12) {
                System.out.println("Error: mes invalido.");
            }
        } while (mes < 1 || mes > 12);

        anio = EntradaSalida.leerInt(sc, "Anio: ");

        return LocalDate.of(anio, mes, dia);
    }

    public static String leerHorarioMarketing(Scanner sc) {
        int opcion;

        do {
            System.out.println("Seleccione horario:");
            System.out.println("1 - 7am a 3pm");
            System.out.println("2 - 1pm a 9pm");

            opcion = leerInt(sc, "Opcion: ");

            if (opcion != 1 && opcion != 2) {
                System.out.println("Error: opcion invalida.");
            }

        } while (opcion != 1 && opcion != 2);

        return (opcion == 1) ? "7am a 3pm" : "1pm a 9pm";
    }

    public static String leerMedioVenta(Scanner sc) {
        int opcion;

        do {
            System.out.println("Seleccione medio de venta:");
            System.out.println("1 - Web");
            System.out.println("2 - Presencial");
            System.out.println("3 - Telefono");

            opcion = leerInt(sc, "Opcion: ");

            if (opcion < 1 || opcion > 3) {
                System.out.println("Error: opcion invalida.");
            }

        } while (opcion < 1 || opcion > 3);

        return switch (opcion) {
            case 1 ->
                "Web";
            case 2 ->
                "Presencial";
            case 3 ->
                "Telefono";
            default ->
                "";
        };
    }
}
