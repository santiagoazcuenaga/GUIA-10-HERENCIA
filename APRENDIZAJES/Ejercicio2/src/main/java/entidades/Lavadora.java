/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enume.Color;

/**
 *
 * @author Usuario
 */
public final class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, Color color, char consumoElectrico, int peso) {
        super(precio, color, consumoElectrico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

  public void crearLavadora(){
      super.crearElectrodomestico();
      System.out.println("Indique la carga del lavarropas");
      this.carga = leer.nextInt();
      
  }
public void precioFinal(){
    super.getPrecio();
    System.out.println(precio);
    if (carga > 30) {
        this.precio = precio + 500;
    }
    System.out.println("El precio final de la lavadora es de: "+precio);
}
   
    
}
