package Empresa_MEG;
import java.util.Date;
public class operario extends Empleado  {

    private String area; 
    private String puesto;
    private int horasTrabajadas;
    private double valorHora = 120.0;
    

    public operario(int legajo, String nombre, String apellido, String telefono, String direccion, 
                    String mail, Date fechaNacimiento , int horasTrabajadas, String puesto, String area){
        super(legajo,nombre, apellido, telefono, direccion, mail, fechaNacimiento);
        this.horasTrabajadas = horasTrabajadas;
        this.area = area;
        this.puesto = puesto;
    }
    
    @Override
    public double calcularSueldoBruto() {
      return horasTrabajadas*valorHora;
    }
    @Override
    public String toString() {
        
        return super.toString() +
           "\nHoras trabajadas: " + horasTrabajadas +
           "\nSueldo Neto: " + calcularSueldoNeto();
    }
    
}
