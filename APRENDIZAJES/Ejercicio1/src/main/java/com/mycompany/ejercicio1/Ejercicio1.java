/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Animal p1 = new Perro("susu", "dogchow", 7, "terrier");
        p1.Alimentarse();
       Gato p2 = new Gato(4, "gato", "catchow", 4, "callejero");
       p2.Alimentarse();
       Animal p3 = new Caballo("semental", "alfalfa", 5, "alazan");
       p3.Alimentarse();
    }
}
