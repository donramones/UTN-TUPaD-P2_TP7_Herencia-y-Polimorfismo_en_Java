/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleadopolimorfismo;

/**
 *
 * @author rivar
 */
public abstract class Empleado {
    private String nombre;
    private String id;
    
    public abstract double calcularSueldo();
    
    public void mostrarInfo() {
        System.out.print("ID: " + id + ", Nombre: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
