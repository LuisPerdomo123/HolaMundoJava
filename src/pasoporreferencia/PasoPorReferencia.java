/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author lepo9
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();//Almacena referencia a los objetos
        persona1.nombre = "Juan";
        System.out.println("personal nombre: " + persona1.nombre);//Esta no es la mejor practica para modificar y retornar valores
        
        cambiarValor(persona1);
        System.out.println("persona1 cambio nombre:  = " + persona1.nombre);
    }
    
    public static void cambiarValor(Persona persona){
    
        //Se esta modiificando el valor de memoria heap en el objeto. El objeto tiene la misma referencia de espacio de memoria.
        //Se esta apuntando al espacio de memoria del objeto.
        //Paso por valor por referencia
        persona.nombre = "Karla";
        
    }
}
