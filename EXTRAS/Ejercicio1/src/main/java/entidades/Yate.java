/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import static entidades.Alquiler.leer;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public final class Yate extends Barco {
    private int potenciacv;
    private int numerocamarote;

    public Yate() {
    }

    public Yate(int potenciacv, int numerocamarote, int sumaTotal, String matricula, int metros, LocalDate anio) {
        super(sumaTotal, matricula, metros, anio);
        this.potenciacv = potenciacv;
        this.numerocamarote = numerocamarote;
    }

   

    public int getPotenciacv() {
        return potenciacv;
    }

    public void setPotenciacv(int potenciacv) {
        this.potenciacv = potenciacv;
    }

    public int getNumerocamarote() {
        return numerocamarote;
    }

    public void setNumerocamarote(int numerocamarote) {
        this.numerocamarote = numerocamarote;
    }
    
    public void crearYate(){
    super.crearBarco();
        System.out.println("Ingrese su potencia en caballos de fuerza");
        this.potenciacv = leer.nextInt();
        System.out.println("Ingrese el numero del camarote");
        this.numerocamarote = leer.nextInt();
        
        
    }
   
    
}
