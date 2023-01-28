/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palabrathis;

/**
 *
 * @author lepo9
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");//Se almacena la informacion en el espacio "Pull String" el cual es administrado por Java
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: = " + persona.nombre);
        System.out.println("persona apellido: = " + persona.apellido);
        
        
    }
}

class Persona{//Definicion de clase Persona

    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){//Constructor de la clase Persona
    
        this.nombre = nombre;
        this.apellido = apellido;
    }
}