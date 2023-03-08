/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Alquiler {

private String nombre;
private int documento;
private LocalDate fechaAlquiler;
private LocalDate fechaDevolucion;
private int posAmarre;
private Barco barco;
private int tiempoDefinido;
static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alquiler() {
    
    }

    public Alquiler(int tiempoDefinido,String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barco) {
        this.tiempoDefinido = tiempoDefinido;
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public int getTiempoDefinido() {
        return tiempoDefinido;
    }

    public void setTiempoDefinido(int tiempoDefinido) {
        this.tiempoDefinido = tiempoDefinido;
    }

    public static Scanner getLeer() {
        return leer;
    }

    public static void setLeer(Scanner leer) {
        Alquiler.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
public void crearAlquiler(){
    System.out.println("Bienvenido a barquitos");   
    System.out.println("Ingrese su nombre");
    this.nombre = leer.next();
    System.out.println("Ingrese su documento");
    this.documento = leer.nextInt();
    System.out.println("Su fecha de inicio de alquiler es " );
    this.fechaAlquiler = LocalDate.now();
    System.out.println(fechaAlquiler);
    System.out.println("Ingrese cuantos dias se quedará con el barco");
    this.tiempoDefinido = leer.nextInt();
    this.fechaDevolucion = LocalDate.now().plusDays(tiempoDefinido);
    System.out.println("Deberá devolverlo el: "+fechaDevolucion);
    System.out.println("Ingrese la posición del amarre");
    this.posAmarre = leer.nextInt();
    System.out.println("Ingrese que barco quiere seleccionar");
    System.out.println("VELERO / BARCO A MOTOR / YATE");
    String opcion = leer.next().toLowerCase();
    switch(opcion){
        case "velero":
            Veleros velero = new Veleros();
            this.barco = velero;
            velero.crearVelero();
           int sumaTotal = this.tiempoDefinido*(velero.getMetros() * 10);
                System.out.println("El alquiler es de: "+ (sumaTotal+velero.getNmastil()));
            break;
        case "barco a motor":
        BarcoAMotor barcmotor = new BarcoAMotor();
        this.barco = barcmotor;
        barcmotor.crearBarcoAMotor();
       sumaTotal = this.tiempoDefinido *(barcmotor.getMetros() * 10);
            System.out.println("el alquiler es de: "+(sumaTotal + barcmotor.getPotencia()));
        break;
        case "yate":
        Yate yate = new Yate();
       this.barco = yate;
       yate.crearYate();
       sumaTotal = this.tiempoDefinido * (yate.getMetros() * 10);
            System.out.println("El alquiler es de: "+(sumaTotal + yate.getPotenciacv() + yate.getNumerocamarote()));
       break;
    }
    
    
}


    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posAmarre=" + posAmarre + ", barco=" + barco + '}';
    }


}
