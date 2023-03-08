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
public final class Veleros extends Barco {
    private int nmastil;

    public Veleros() {
    }

    public Veleros(int nmastil, int sumaTotal, String matricula, int metros, LocalDate anio) {
        super(sumaTotal, matricula, metros, anio);
        this.nmastil = nmastil;
    }

    public int getNmastil() {
        return nmastil;
    }

    public void setNmastil(int nmastil) {
        this.nmastil = nmastil;
    }
    public void crearVelero(){
     super.crearBarco();
        System.out.println("Ingrese el numero del mastil");
        this.nmastil = leer.nextInt();
        
    }
  
}
