/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehículosherenciabásica;

/**
 *
 * @author rivar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto("Renault", "Steway", "4");
        a1.mostrarInfo();
        
        Auto a2 = new Auto("Ford", "Fuego", "5");
        a2.mostrarInfo();
    }
    
}
