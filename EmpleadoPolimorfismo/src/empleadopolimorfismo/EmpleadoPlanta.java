/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleadopolimorfismo;

/**
 *
 * @author rivar
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bonoAnual;

    public EmpleadoPlanta(String nombre, String id, double sueldoBase, double bonoAnual) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.bonoAnual = bonoAnual;
    }
    public double calcularSueldo() {
        return sueldoBase + bonoAnual;
    }
    
    
    
}
