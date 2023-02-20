/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_2_clases_y_objetos;

/**
 *
 * @author campa
 */
public class Persona {
    //Datos: Atributos 
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    
    /*Metodos: Comportamiento de la clase
    Leer y escribir los atributos de la clase
    Leer: Get
    Escribir: Set
    Modificador de acceso valor de retorno nombre del metodo(argumentos)(implementacion)*/
    
    public String getNombre(){
        return nombre;  
    }
    public void setNombre(String n){
        nombre = n;  
    }
    
    
    public String getApellidos(){
        return apellidos;  
    }  
    public void setApellidos(String a){
        apellidos = a;  
    }
    
    
    public int getEdad(){
        return edad;  
    }
    public void setEdad(int ed){
        edad = ed;  
    }
     
    
    public char getGenero(){
        return genero;  
    }
    public void setGenero(char g){
        genero = g;  
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+ nombre + " " + apellidos);
       
       System.out.println("Edad: " + edad); 
       
       System.out.println("Genero: " + genero);
    }
}
