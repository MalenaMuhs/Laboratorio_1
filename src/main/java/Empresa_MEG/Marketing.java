package Empresa_MEG;

import java.time.LocalDate;

public class Marketing extends Empleado {
    
    private String horario;
    private double sueldoFijo = 50000.0;
    
    public Marketing(int legajo, String nombre, String apellido, String telefono, String direccion, String mail, LocalDate fechaNacimiento, String horario){
        super(legajo,nombre, apellido, telefono, direccion, mail, fechaNacimiento);
        this.horario = horario;
    }
    
    @Override
    public double calcularSueldoBruto() {
         return sueldoFijo; 
    }
    @Override
    public String toString() {
        
        return super.toString() +
           "\nHorario: " + horario +
           "\nSueldo Neto: " + String.format("%.1f", calcularSueldoNeto());
    }
}
