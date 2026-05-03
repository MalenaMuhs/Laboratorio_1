package Empresa_MEG;
import java.util.Date;
public class Vendedor extends Empleado {

    private String medioVenta;
    private double totalVentasMes;
    private double sueldoBase = 30000.0;
    private double comision = 0.002;
    
    public Vendedor(int legajo, String nombre, String apellido, String telefono, String direccion, String mail, Date fechaNacimiento, String medioDeVentas, double totalMes){
       super( legajo,nombre, apellido, telefono, direccion, mail, fechaNacimiento);
        this.medioVenta = medioDeVentas;
        this.totalVentasMes = totalMes;
    }
    
    @Override
    public double calcularSueldoBruto() {  
        return sueldoBase + (totalVentasMes*comision);
    }
    @Override
    public String toString() {
        
        return super.toString() +
           "\nVentas del mes: " + totalVentasMes +
           "\nSueldo Neto: " + calcularSueldoNeto();
    }
}
