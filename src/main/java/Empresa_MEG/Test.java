/*
Alumnos: Nicolas Arumay y Malena Muhs
 */
package Empresa_MEG;
import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    
        int cantOperarios=10;
        int cantMarketing= 2;
        int cantVendedores=3;
        int cantTotalEmpleados=15;
        int j = 0;
       
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        
        Empleado[] empleados = new Empleado[cantTotalEmpleados];
        
        //PIDE DATOS DE OPERARIO
        System.out.println("OPERARIOS");
        for (int i = 0; i < cantOperarios; i++) {
                System.out.println("Operario nro. " + (i+1));
                System.out.print("Nombre: ");
                String nombre = sc_string.nextLine();
                System.out.print("Apellido: ");
                String apellido = sc_string.nextLine();
                System.out.print("Legajo: ");
                int legajo = sc_int.nextInt();
                System.out.print("Telelfono: ");
                String telefono = sc_string.nextLine();
                System.out.print("Mail: ");
                String mail = sc_string.nextLine();
                System.out.print("Direccion: ");
                String direccion = sc_string.nextLine();
                System.out.print("Fecha de nacimiento: ");
                System.out.println("Ingrese el dia: ");
                int dia = sc_int.nextInt();
                System.out.println("Ingrese el mes: ");
                int mes = sc_int.nextInt();
                System.out.println("Ingrese el anio: ");
                int año = sc_int.nextInt();
                LocalDate fecha = LocalDate.of(año, mes, dia);
                System.out.print("Horas trabajadas: ");
                int horas = sc_int.nextInt();
                System.out.print("Puesto: ");
                String puesto = sc_string.nextLine();
                System.out.print("Area: ");
                String area = sc_string.nextLine();
            
            empleados[j]= new operario(legajo,  nombre,  apellido,  telefono,  direccion, mail, fecha ,  horas,  puesto, area);
            j++;
        }
        
        //PIDE DATOS DE VENDEDOR
            System.out.println("VENDEDORES: ");
        for (int i = 0; i < cantVendedores; i++) {
                System.out.println("Vendedor nro. " + (i+1));
                System.out.print("Nombre: ");
                String nombre = sc_string.nextLine();
                System.out.print("Apellido: ");
                String apellido = sc_string.nextLine();
                System.out.print("Legajo: ");
                int legajo = sc_int.nextInt();
                System.out.print("Telelfono: ");
                 String telefono = sc_string.nextLine();
                System.out.print("Mail: ");
                String mail = sc_string.nextLine();
                System.out.print("Direccion: ");
                String direccion = sc_string.nextLine();
                System.out.print("Fecha de nacimiento: ");
                System.out.println("Ingrese el dia: ");
                int dia = sc_int.nextInt();
                System.out.println("Ingrese el mes: ");
                int mes = sc_int.nextInt();
                System.out.println("Ingrese el anio: ");
                int año = sc_int.nextInt();
                LocalDate fecha = LocalDate.of(año, mes, dia);
                System.out.print("Medio de ventas: ");
                String medioDeVentas = sc_string.nextLine();
                System.out.print("Total de ventas en el mes: ");
                double totalMes = sc_int.nextDouble();
            
            empleados[j]= new Vendedor(legajo,  nombre,  apellido,  telefono,  direccion,  mail,    fecha,  medioDeVentas, totalMes);
            j++;                
        }
       
        //PIDE DATOS DE MARKETING 
        System.out.println("MARKETING: ");
        for (int i=0; i < cantMarketing; i++){
                System.out.println("Marketing nro. " + (i+1));
                System.out.print("Nombre: ");
                String nombre = sc_string.nextLine();
                System.out.print("Apellido: ");
                String apellido = sc_string.nextLine();
                System.out.print("Legajo: ");
                int legajo = sc_int.nextInt();
                System.out.print("Telelfono: ");
                 String telefono = sc_string.nextLine();
                System.out.print("Mail: ");
                String mail = sc_string.nextLine();
                System.out.print("Direccion: ");
                String direccion = sc_string.nextLine();
                System.out.print("Fecha de nacimiento: ");
                System.out.println("Ingrese el dia: ");
                int dia = sc_int.nextInt();
                System.out.println("Ingrese el mes: ");
                int mes = sc_int.nextInt();
                System.out.println("Ingrese el anio: ");
                int año = sc_int.nextInt();
                LocalDate fecha = LocalDate.of(año, mes, dia);
                System.out.println("Horario: ");
                String horario = sc_int.nextLine();
            empleados[j] = new Marketing(legajo,  nombre,  apellido,  telefono,  direccion,  mail,   fecha,  horario);
            j++;
        }               
    
        for (int i = 0; i < cantTotalEmpleados ; i++) {
            if (i==0)  System.out.println("OPERARIOS:");
            if (i==9)  System.out.println("VENDEDORES:");
            if (i==12)  System.out.println("MARKETING:");
               
            System.out.println(empleados[i]);
        }
    }
}
