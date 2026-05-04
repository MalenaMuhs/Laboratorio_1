/*
Alumnos: Nicolas Arumay y Malena Muhs
 */
package Empresa_MEG;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        final int CANT_OPERARIO = 1;
        final int CANT_MARKETING = 1;
        final int CANT_VENDEDOR = 1;
        final int CANT_TOTAL_EMPLEADOS = 3;
        int j = 0;

        Scanner sc = new Scanner(System.in);

        Empleado[] empleados = new Empleado[CANT_TOTAL_EMPLEADOS];

        //PIDE DATOS DE OPERARIO
        System.out.println("OPERARIOS");
        for (int i = 0; i < CANT_OPERARIO; i++) {
            System.out.println("Operario nro. " + (i + 1));

            String nombre = EntradaSalida.leerString(sc, "Nombre: ");
            String apellido = EntradaSalida.leerString(sc, "Apellido: ");
            int legajo = EntradaSalida.leerInt(sc, "Legajo: ");
            String telefono = EntradaSalida.leerString(sc, "Telefono: ");
            String mail = EntradaSalida.leerString(sc, "Mail: ");
            String direccion = EntradaSalida.leerString(sc, "Direccion: ");
            System.out.println("Fecha de nacimiento: ");
            LocalDate fecha = EntradaSalida.leerFecha(sc);

            int horas = EntradaSalida.leerInt(sc, "Horas trabajadas: ");
            String puesto = EntradaSalida.leerString(sc, "Puesto: ");
            String area = EntradaSalida.leerString(sc, "Area: ");

            empleados[j] = new Operario(legajo, nombre, apellido, telefono, direccion, mail, fecha, horas, puesto, area);
            j++;
        }

        //PIDE DATOS DE VENDEDOR
        System.out.println("VENDEDORES: ");
        for (int i = 0; i < CANT_VENDEDOR; i++) {
            System.out.println("Vendedor nro. " + (i + 1));
            String nombre = EntradaSalida.leerString(sc, "Nombre: ");
            String apellido = EntradaSalida.leerString(sc, "Apellido: ");
            int legajo = EntradaSalida.leerInt(sc, "Legajo: ");
            String telefono = EntradaSalida.leerString(sc, "Telefono: ");
            String mail = EntradaSalida.leerString(sc, "Mail: ");
            String direccion = EntradaSalida.leerString(sc, "Direccion: ");
            System.out.println("Fecha de nacimiento: ");
            LocalDate fecha = EntradaSalida.leerFecha(sc);

            String medioDeVentas = EntradaSalida.leerMedioVenta(sc);
            double totalMes = EntradaSalida.leerDouble(sc, "Total ventas: ");

            empleados[j] = new Vendedor(legajo, nombre, apellido, telefono, direccion, mail, fecha, medioDeVentas, totalMes);
            j++;
        }

        //PIDE DATOS DE MARKETING 
        System.out.println("MARKETING: ");
        for (int i = 0; i < CANT_MARKETING; i++) {
            System.out.println("Marketing nro. " + (i + 1));

            String nombre = EntradaSalida.leerString(sc, "Nombre: ");
            String apellido = EntradaSalida.leerString(sc, "Apellido: ");
            int legajo = EntradaSalida.leerInt(sc, "Legajo: ");
            String telefono = EntradaSalida.leerString(sc, "Telefono: ");
            String mail = EntradaSalida.leerString(sc, "Mail: ");
            String direccion = EntradaSalida.leerString(sc, "Direccion: ");
            System.out.println("Fecha de nacimiento: ");
            LocalDate fecha = EntradaSalida.leerFecha(sc);

            String horario = EntradaSalida.leerHorarioMarketing(sc);

            empleados[j] = new Marketing(legajo, nombre, apellido, telefono, direccion, mail, fecha, horario);
            j++;
        }
        System.out.println("\n\nINFORMACION DE LOS EMPLEADOS");

        for (int i = 0; i < CANT_TOTAL_EMPLEADOS; i++) {
            if (i == 0) {
                System.out.println("\nOPERARIOS:\n-------------------------");
            }
            if (i == CANT_OPERARIO) {
                System.out.println("\nVENDEDORES:\n-------------------------");
            }
            if (i == CANT_OPERARIO + CANT_VENDEDOR) {
                System.out.println("\nMARKETING:\n-------------------------");
            }
            System.out.println("Empleado nro. " + (i+1));
            System.out.println(empleados[i]);
        }
    }
}
