/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeométricasmétodosabstractos;

/**
 *
 * @author rivar
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    @Override
    public String toString() {
        return super.getNombre()+" {radio=" + radio + "}";
        
    }
    
    
    
    
    
}
