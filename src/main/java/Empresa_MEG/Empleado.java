package Empresa_MEG;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Empleado {
  protected int legajo;
  protected String nombre;
  protected String apellido;
  protected String telefono;
  protected String direccion;
  protected String mail;
  protected Date fechaNacimiento;
  protected int totalDescuento=19;

  
  public Empleado (int legajo, String nombre, String apellido, String telefono, String direccion, String mail, Date fechaNacimiento){
      this.legajo = legajo;
      this.apellido = apellido;
      this.nombre = nombre;
      this.telefono = telefono;
      this.direccion = direccion;
      this.mail = mail;
      this.fechaNacimiento = fechaNacimiento;
  }
  
  public abstract double calcularSueldoBruto();
  
  public double calcularDescuento(){
      
      return calcularSueldoBruto()*(totalDescuento/100.0); 
      
  }
  
  public double calcularSueldoNeto(){
      
      return calcularSueldoBruto() - calcularDescuento();
      
  }
  @Override
    public String toString() {
    
    return "Legajo: " + legajo +
           "\nNombre: " + nombre + " " + apellido +
           "\nTelefono: " + telefono +
           "\nDireccion: " + direccion +
           "\nFecha de nacimiento: " + fechaNacimiento +
           "\nMail: " + mail;
    }
}

