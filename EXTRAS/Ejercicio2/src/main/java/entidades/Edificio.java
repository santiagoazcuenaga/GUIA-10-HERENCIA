/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Usuario
 */
public abstract class Edificio {
    protected int ancho;
    protected int largo;
    protected int alto;

    public Edificio() {
    }

    public Edificio(int ancho, int largo, int alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public abstract double calcularSuperficie();
    
    
    public abstract double calcularVolumen();
    
    
    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + '}';
    }
    
    
    
}
