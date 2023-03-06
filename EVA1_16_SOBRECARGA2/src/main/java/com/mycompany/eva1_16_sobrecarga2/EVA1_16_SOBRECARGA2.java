/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_16_sobrecarga2;

/**
 *
 * @author campa
 */
public class EVA1_16_SOBRECARGA2 {

    public static void main(String[] args) {
        System.out.println("Suma: " + suma(4, 9));
        System.out.println("Suma: " + suma(4.0, 9.0));
        System.out.println("Suma: " + suma("Hola ", "Mundo"));
        suma();
    }
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    public static double suma(double val1, double val2){
        return val1 + val2;
    }
    public static String suma(String val1, String val2){
        return val1 + val2;
    }
    public static void suma(){
        System.out.println("Suma: sin argumentos");
    }
}
