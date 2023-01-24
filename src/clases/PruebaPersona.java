/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author lepo9
 */
public class PruebaPersona {
    
    public static void main(String[] args) {
     
        Persona persona1; //Creacion de la variable persona del tipo Persona
        persona1= new Persona();//Llamada del constructor de la clase. Permite asignar variables y reservar memoria.
        //Se ha creado un objeto tipo Persona. Retorna la referencia asignada a la variable persona1.
        
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
    }
}
