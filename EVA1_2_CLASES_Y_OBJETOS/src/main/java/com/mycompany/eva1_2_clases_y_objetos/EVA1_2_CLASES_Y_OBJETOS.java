/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_2_clases_y_objetos;

/**
 *
 * @author campa
 */
public class EVA1_2_CLASES_Y_OBJETOS {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1. setNombre("Patricio");
        perso1. setApellidos("Estrella");
        perso1. setEdad(32);
        perso1. setGenero('H');
      
       /*System.out.println(perso1.getNombre()+ " " + perso1.getApellidos());
       System.out.println(perso1.getEdad()); 
       System.out.println(perso1.getGenero()); */
        
        perso1. imprimirDatos();
    }
}
