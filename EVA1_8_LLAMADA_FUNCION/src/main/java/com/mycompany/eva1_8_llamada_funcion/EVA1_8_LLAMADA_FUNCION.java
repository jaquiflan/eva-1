/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_8_llamada_funcion;

/**
 *
 * @author campa
 */
public class EVA1_8_LLAMADA_FUNCION {

    public static void main(String[] args) {
        System.out.println("INICIA main()");
        A();
        System.out.println("TERMINA main()");
        //se queda en espera hasta que se termine de ejecutar la llamada a la funcion
        
    }
    public static void A(){
        System.out.println("INICIA A()");
        B();
        System.out.println("TERMINA A()");
    }
    public static void B(){
        System.out.println("INICIA B()");
        System.out.println("TERMINA B()");
    }
}
