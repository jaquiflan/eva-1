/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_9_mensaje;

/**
 *
 * @author campa
 */
public class EVA1_9_MENSAJE {

    public static void main(String[] args) {
        nPrintln("HOLA", 5);
    }
    public static void nPrintln(String message, int num){
        for(int i = 0; i < num; i++){
            System.out.println(message);
        }
    }
}
