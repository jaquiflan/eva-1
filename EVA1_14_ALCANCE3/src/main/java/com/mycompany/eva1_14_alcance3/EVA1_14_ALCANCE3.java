/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_14_alcance3;

/**
 *
 * @author campa
 */
public class EVA1_14_ALCANCE3 {

    public static void main(String[] args) {
        int x = 100;
        System.out.println(x);
        for (int i = 0; i < 10; i++) {
            /*int x = 100; 
            no se puede volver a declarar porque la x ya fue declarada
            anteriormente en el main*/
            System.out.println(x);
            System.out.println(i);
            if(i == 5){
                System.out.println(x);//visible en todo el main
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);            
        }
    }
    public static void Algo(int x){
        
    }
    
    public static void Algo2(int x){
        
    }
    
}
