/*
Alumnos: Nicolas Arumay y Malena Muhs
 */
package Empresa_MEG;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /*int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año: "));
            LocalDate fecha = LocalDate.of(año, mes, dia);*/

    
        int cantOperarios=10;
        int cantMarketing= 2;
        int cantVendedores=3;
        int j = 0;
       
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);
        
        Empleado[] empleados = new Empleado[15];
        
        System.out.println("OPERARIOS");
        for (int i = 0; i < cantOperarios; i++) {
            System.out.println("Operario nro. " + i);
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
            //nico
            System.out.print("Horas trabajadas: ");
            int horas = sc_int.nextInt();
            System.out.print("Puesto: ");
            String puesto = sc_string.nextLine();
            System.out.print("Area: ");
            String area = sc_string.nextLine();
            
            empleados[j]= new operario(legajo,  nombre,  apellido,  telefono,  direccion, mail, new Date() ,  horas,  puesto, area);
            j++;
        }
    
            System.out.println("VENDEDORES: ");
        for (int i = 0; i < cantOperarios; i++) {
            System.out.println("Vendedor nro. " + i);
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
            //nico
            System.out.print("Medio de ventas: ");
            String medioDeVentas = sc_string.nextLine();
            System.out.print("Total de ventas en el mes: ");
            double totalMes = sc_int.nextDouble();
            
             empleados[j]= new Vendedor( legajo,  nombre,  apellido,  telefono,  direccion,  mail, new Date(),  medioDeVentas, totalMes);
       
            j++;                
        }
        
        
            
 
                           
    }
 
}
