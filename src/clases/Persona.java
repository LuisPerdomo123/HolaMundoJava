/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author lepo9
 */
public class Persona {
    /*
    Definicion de atributos de la clase
    */
    public String nombre;//Esto no es una practica adecuada. Se debe manejar por encapsulamiento
    public String apellido;
    
    /*
    Definicion de los metodos de la clase
    */
    public void desplegarInformacion(){//Void significa que no retorna informacion
    
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: " + apellido);
    }
}
