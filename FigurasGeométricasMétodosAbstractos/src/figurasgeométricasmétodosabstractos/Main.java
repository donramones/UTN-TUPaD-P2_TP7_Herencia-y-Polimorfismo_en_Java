/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figurasgeométricasmétodosabstractos;

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
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(3, "Circulo A"));
        figuras.add(new Rectangulo(3, 2, "Rectangulo A")); 
        figuras.add(new Circulo(2, "Circulo B"));
        figuras.add(new Rectangulo(2, 6, "Rectangulo B"));
        
        for (Figura figura : figuras) {
            System.out.println("El perimetro de la figura "+figura+" es " +figura.calcularArea());
        }
        
        
        
    }
    
}
