/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Electrodomestico;
import enume.Color;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioElectrodomestico {
    Electrodomestico e = new Electrodomestico();
    static Scanner leer = new Scanner(System.in);
   public void crearElectrodomestico(){
       System.out.println("ingresa el precio del electrodomestico");    
       e.setPrecio(leer.nextInt());
       System.out.println("ingrese el consumo energetico del electrodomestico");
       comprobarConsumoEnergetico();
       System.out.println("ingrese el color del electrodomestico");
       comprobarColor();
       System.out.println(e.getColor());
       System.out.println("ingrese el peso del electrodomestico");
  
   }
    
    private void comprobarConsumoEnergetico(){
       
       char letra = leer.next().charAt(0);
        if (letra != 'a' || letra != 'b' || letra != 'c' || letra != 'd' || letra != 'e'  ) {
            e.setConsumoElectrico('f');
        }else{
            e.setConsumoElectrico(letra);
        }
        
    }
    private void comprobarColor(){
        System.out.println("LOS COLORES DISPONIBLES SON:");
        
        for (Color aux : Color.values()) {
           System.out.println(aux.toString());
            
        } 
        
        
        String color2 = leer.next();
        for (Color aux : Color.values() ) {
            if (aux.getColor().equals(color2)) {     
              e.setColor(aux);
              break;
            }else{
             e.setColor(aux.BLANCO);
             
            }
            
        }
       
    }
  private void precioFinal(){
      
  }  
    
}
