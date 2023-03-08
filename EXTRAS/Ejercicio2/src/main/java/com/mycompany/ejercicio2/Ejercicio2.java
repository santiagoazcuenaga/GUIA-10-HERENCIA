/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import entidades.Edificio;
import entidades.EdificioDeOficina;
import entidades.PoliDeportivo;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
      
        ArrayList <Edificio> ed = new ArrayList();
      PoliDeportivo p1 = new PoliDeportivo("SuperGYM", 50, 50, 20, true);    
      ed.add(p1);
           PoliDeportivo p2 = new PoliDeportivo("NOTANSUPERGYM", 30, 30, 10, false); 
           ed.add(p2);
      EdificioDeOficina e1 = new EdificioDeOficina(100, 100, 40);  
      e1.cuantasPersonas();
      ed.add(e1);
      EdificioDeOficina e2 = new EdificioDeOficina(35, 20, 15); 
     e2.cuantasPersonas();
     ed.add(e2);
       
        for (Edificio edificio : ed) {
            System.out.println(edificio);
        }
     
    }
}
