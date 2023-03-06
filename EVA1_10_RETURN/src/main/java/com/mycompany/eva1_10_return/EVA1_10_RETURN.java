/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_10_return;

/**
 *
 * @author campa
 */
public class EVA1_10_RETURN {

    public static void main(String[] args) {
        int resu; 
        resu = square(3);//Llamada a funcion, pero sin procesar el resultado
        System.out.println(resu);//Llamada a funcion, almacenando el resultado
        System.out.println(square(5));
    }
    public static int square(int num){
        return num * num;
    }
}
