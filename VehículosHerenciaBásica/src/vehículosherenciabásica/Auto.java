/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehículosherenciabásica;

/**
 *
 * @author rivar
 */
public class Auto extends Vehiculo {
    private String cantidadPuertas;

    public Auto(String marca, String modelo, String cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    public void mostrarInfo(){
        System.out.println("Marca: " + super.getMarca() + " , Modelo: " + super.getModelo() + " , Cantidad de puertas: " + cantidadPuertas);
    }
    
    
    
}
