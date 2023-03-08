/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.servicioElectrodomestico;


/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
static Scanner leer = new Scanner(System.in);  
    static ArrayList <Electrodomestico> ae = new ArrayList();
                
    public static void main(String[] args) {
       
   
        Lavadora b5 = new Lavadora();
        Televisor b6 = new Televisor();
        
      //  Electrodomestico b1 = new Electrodomestico();
      //  Electrodomestico b2 = new Electrodomestico();
      //  Electrodomestico b3 = new Electrodomestico();
      //  Electrodomestico b4 = new Electrodomestico();
        
     //   b1.crearElectrodomestico();
      //    ae.add(b1);
      //  b2.crearElectrodomestico();
      //    ae.add(b2);
    // b3.crearElectrodomestico();
     //     ae.add(b3);
      //  b4.crearElectrodomestico();
    //ae.add(b4);
   
    
        System.out.println("¡BIENVENIDO A ELECTRODOMESTICOS S.A!");
        System.out.println("A CONTINUACION ELIJA SU OPCION: ");
        System.out.println("TELEVISOR / LAVADORA");
        String opcion = leer.next();
        switch(opcion){
           
            case "lavadora":
                b5.crearLavadora();
                b5.precioFinal();
                ae.add(b5);
                for (Electrodomestico electrodomestico : ae) {
                    System.out.println(electrodomestico);
                }
                System.out.println("¿DESEA COMPRAR OTRO ELECTRODOMESTICO?");
                String respuesta = leer.next();
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.println("Seleccione que objeto quiere comprar: ");
                    System.out.println("TELEVISOR / LAVADORA");
                    String respuestan = leer.next();
                    menu2(respuestan);
                }
              
            case "televisor":
                b6.crearTelevisor();
                b6.precioFinalT();
                ae.add(b6);
            
            
        }
        
}
    public static void menu2(String respuestan){
        Lavadora b7 = new Lavadora();
        Televisor b8 = new Televisor();
    switch(respuestan){
        case "lavadora":
            b7.crearLavadora();
            b7.precioFinal();
        ae.add(b7);
            for (Electrodomestico electrodomesticoN : ae) {
                System.out.println(electrodomesticoN);
            }
            break;
        case "televisor": 
          b8.crearTelevisor();
          b8.precioFinalT();
            for (Electrodomestico electrodomesticoT : ae) {
                System.out.println(electrodomesticoT);
            }
 
    }    
        
        
    }

}