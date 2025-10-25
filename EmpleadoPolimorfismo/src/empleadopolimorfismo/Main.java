/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleadopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Neo", "KK999", 3000.00, 500.00));
        empleados.add(new EmpleadoTemporal("Leo messi", "XL10", 20.00, 160));
        empleados.add(new EmpleadoPlanta("Chino moreno", "Dt1999", 4500.00, 800.00));
        empleados.add(new EmpleadoTemporal("Akira", "Xo999", 25.00, 120));
        
        for (Empleado e : empleados) {
            e.mostrarInfo();
            double sueldo = e.calcularSueldo();
            System.out.printf("Empleado: "+e.getNombre()+"Sueldo Calculado: "+sueldo);
            System.out.println("");
        }
        for (Empleado e : empleados) {
            System.out.print("Empleado: " + e.getNombre());
            
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" es un empleado de planta");
            }
            else if (e instanceof EmpleadoTemporal) {
                System.out.println(" es un empleado temporal");
            }
        }
                
    }
    
}
