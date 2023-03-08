/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Usuario
 */
public final class PoliDeportivo extends Edificio {

    
    private String nombre;
    private boolean techado;

    public PoliDeportivo() {
    }

    public PoliDeportivo(String nombre, int ancho, int largo, int alto,boolean techado) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
    
  
    @Override
    public double calcularSuperficie() {
    return this.ancho * this.largo;  
    }

    @Override
    public double calcularVolumen() {
       return this.ancho * this.alto * this.largo; 
            }

    @Override
    public String toString() {
        return "PoliDeportivo{"+ "superficie:  "+ calcularSuperficie() + " volumen :" + calcularVolumen() + "nombre=" + nombre + ", techado=" + (techado ? "si":"no") + '}';
    }
    
}
