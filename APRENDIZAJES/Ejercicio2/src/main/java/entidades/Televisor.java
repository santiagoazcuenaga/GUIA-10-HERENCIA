/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enume.Color;

/**
 *
 * @author Usuario
 */
public final class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolusion, boolean sintonizador, int precio, Color color, char consumoElectrico, int peso) {
        super(precio, color, consumoElectrico, peso);
        this.resolucion = resolusion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Indique la resolución");
       this.resolucion = leer.nextInt();
        System.out.println("¿Este televisor cuenta con sintonizador?");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("Si")) {
            this.sintonizador = true;
        }

     
    }
    
    public void precioFinalT(){
     super.getPrecio();
        if (resolucion > 40) {
            precio = precio + (precio *0.30);
            
        }
        if(sintonizador = true){
            precio = precio +500;
            
        }
        System.out.println("El precio final por su televisor es de :"+precio);
    }
    
}
