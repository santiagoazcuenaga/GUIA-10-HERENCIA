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
public final class BarcoAMotor extends Barco {
   private int potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potencia, int sumaTotal, String matricula, int metros, LocalDate anio) {
        super(sumaTotal, matricula, metros, anio);
        this.potencia = potencia;
    }

   

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
   public void crearBarcoAMotor(){
    super.crearBarco();
       System.out.println("Ingrese la potencia en caballos de fuerza");
       this.potencia = leer.nextInt();
       
       
   }

}
