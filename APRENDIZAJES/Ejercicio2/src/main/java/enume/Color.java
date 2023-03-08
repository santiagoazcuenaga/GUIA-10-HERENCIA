/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enume;

/**
 *
 * @author Usuario
 */

    public enum Color{
        NEGRO("negro"), ROJO("rojo"), AZUL("azul"),GRIS("gris"), BLANCO("blanco") ;
        private String color;

    private Color() {
    }

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
    }

