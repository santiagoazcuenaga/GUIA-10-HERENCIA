/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public final class EdificioDeOficina extends Edificio{
static Scanner leer = new Scanner(System.in);
    
    private int nOficinas;
private int cantPersonas;
private int cantPisos;
private int personaTotal;
    public EdificioDeOficina() {
    }

  //  public EdificioDeOficina(int nOficinas, int cantPersonas, int cantPisos, int ancho, int largo, int alto) {
     //   super(ancho, largo, alto);
     //   this.nOficinas = nOficinas;
    //    this.cantPersonas = cantPersonas;
    //    this.cantPisos = cantPisos;
    //    this.personaTotal = (this.cantPersonas * this.nOficinas)* this.cantPisos;
   // }

    public EdificioDeOficina(int ancho, int largo, int alto) {
        super(ancho, largo, alto);
    }

    public int getPersonaTotal() {
        return personaTotal;
    }

    public void setPersonaTotal(int personaTotal) {
        this.personaTotal = personaTotal;
    }

    public int getnOficinas() {
        return nOficinas;
    }

    public void setnOficinas(int nOficinas) {
        this.nOficinas = nOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

     
    
    @Override
    public double calcularSuperficie() {
          return this.ancho * this.largo;  
    }

    @Override
    public double calcularVolumen() {
        return this.ancho * this.alto * this.largo; 
    }
    
  public void cuantasPersonas(){
      System.out.println("ingrese la cantidad de oficinas");
      this.nOficinas = leer.nextInt();
      System.out.println("ingrese cuantas personas entran en la oficina");
      this.cantPersonas = leer.nextInt();
      System.out.println("ingrese la cantidad de pisos");
      this.cantPisos = leer.nextInt();
     this.personaTotal = (this.cantPersonas * this.nOficinas)* this.cantPisos;
  
  }  
  

    @Override
    public String toString() {
        return "EdificioDeOficina{" +"superficie:  "+ calcularSuperficie() + " volumen :" + calcularVolumen()+ "nOficinas=" + nOficinas + ", cantPersonas=" + cantPersonas + ", cantPisos=" + cantPisos + ", personaTotal=" + personaTotal + '}';
    }
    
    
    
    
}
