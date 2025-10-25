/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeométricasmétodosabstractos;

/**
 *
 * @author rivar
 */
public class Rectangulo extends Figura {
   private double base;
   private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return super.getNombre() +" {" + "base= " + base + ", altura= " + altura + "}";
    }
    
   
   

}
