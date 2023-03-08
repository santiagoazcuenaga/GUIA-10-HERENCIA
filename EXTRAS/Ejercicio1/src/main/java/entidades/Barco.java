/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import static entidades.Alquiler.leer;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Usuario
 */
public  class Barco {
    protected String matricula;
    protected int metros;
    protected LocalDate anio;
    protected int sumaTotal;

    public Barco() {
    }

    public Barco(int sumaTotal,String matricula, int metros, LocalDate anio) {
       this.sumaTotal = sumaTotal;
        this.matricula = matricula;
        this.metros = metros;
        this.anio = anio;
    }

    public int getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(int sumaTotal) {
        this.sumaTotal = sumaTotal;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }
   protected void crearBarco(){
       System.out.println("Ingrese la matricula del barco");
       this.matricula = leer.next();
       System.out.println("Ingrese su eslora en metros");
       this.metros = leer.nextInt();
       System.out.println("El año de fabricacion es de: ");
       LocalDate date = LocalDate.of(1995,12,12);
    this.anio = date;
       System.out.println(anio);
       
   } 
  
    
}
