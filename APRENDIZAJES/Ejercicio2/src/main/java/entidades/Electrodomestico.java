/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enume.Color;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Electrodomestico {
    protected double precio;
    protected Color color;
    protected char consumoElectrico;
    protected int peso;

static Scanner leer = new Scanner(System.in);
    public Electrodomestico() {
     
    }

    public Electrodomestico(double precio ,Color color, char consumoElectrico, int peso) {
        this.precio = precio;
      this.color = color;
        this.consumoElectrico = consumoElectrico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
     public void crearElectrodomestico(){
       
         
         this.precio = 1000;
 
         System.out.println("ingrese el consumo energetico del electrodomestico");
       comprobarConsumoEnergetico();
       
       System.out.println("ingrese el color del electrodomestico");
       comprobarColor();
              System.out.println(color); 
       System.out.println("ingrese el peso del electrodomestico");
          this.peso = leer.nextInt();
  precioFinalPeso();
  precioFinalConsumo();

   
   }
    
    private void comprobarConsumoEnergetico(){
       
       char letra = leer.next().charAt(0);
        if (letra != 'a' && letra != 'b' && letra != 'c' && letra != 'd' && letra != 'e'  ) {
            this.consumoElectrico = 'f';
        }else{
            this.consumoElectrico =letra;
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
              this.color=aux;
              break;
            }else{
             this.color=aux.BLANCO;
             
            }
            
        }
       
    }
  private void precioFinalPeso(){    
          if (peso > 1 && peso <19){
          precio = precio + 100;  
           } 
          if(peso > 20 && peso <49){
          this.precio = precio +500;       
          }    
          if(peso > 50 && peso < 79){
              
           this.precio = precio + 800;   
          }
          if(precio < 80){
           this.precio = precio + 1000;   
          }
          
      
  }  
 private void precioFinalConsumo(){
     
     
     if ( consumoElectrico == 'a') {
     precio = precio + 1000;    
     }
  if(consumoElectrico == 'b'){
     this.precio = precio + 800; 
      
  }
  if(consumoElectrico == 'c'){
     this.precio = precio + 600; 
      
  }
  if(consumoElectrico == 'd'){
     this.precio = precio + 500; 
      
  }
  if(consumoElectrico == 'e'){
     this.precio = precio + 300; 
      
  }
  if(consumoElectrico == 'f'){
     this.precio = precio + 100; 
      
  }
 }   

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + '}';
    }


 
    
}
