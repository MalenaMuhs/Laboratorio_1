/*
Alumnos: Nicolas Arumay y Malena Muhs
 */
package Empresa_MEG;
import java.util.Date;
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
       /*int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año: "));
            LocalDate fecha = LocalDate.of(año, mes, dia);*/
            Date hoy = new Date();

        Empleado e1 = new operario(123, "Nicolas", "Arumay", "1100327885", "Calle 123", 
                                   "example@gmail.com", hoy, 1, "hola", "chau");
                               
        
        System.out.println(e1);
    }
 
}
