/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_11_califas;

/**
 *
 * @author campa
 */
public class EVA1_11_CALIFAS {

    public static void main(String[] args) {
        System.out.println(resultado(50));
    }
    public static char resultado(int resu){
        char resultado = 'N';
        if(resu > 90 && resu <= 100){
            resultado = 'A';
        }else if(resu > 80 && resu <= 90){
            resultado = 'B';
        }else if(resu > 70 && resu <= 80){
            resultado = 'C';
        }else if(resu <= 70){
            resultado = 'D';
        }
        return resultado;
    }
}
