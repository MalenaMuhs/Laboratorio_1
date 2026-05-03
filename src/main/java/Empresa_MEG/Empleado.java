package Empresa_MEG;

import java.util.Date;

public abstract class Empleado {
  protected int legajo;
  protected String nombre;
  protected String apellido;
  protected String telefono;
  protected String direccion;
  protected String mail;
  protected Date fechaNacimiento;
  
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
  
  public double calcularDescuento(double totalDescuento){
      
      return calcularSueldoBruto()*(totalDescuento/100.0); 
      
  }
  
  public double calcularSueldoNeto(){
      
      return calcularSueldoBruto() - calcularDescuento();
      
  }
  
}
