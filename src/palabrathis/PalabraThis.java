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
    
        //super();//Constructor de la clase padre. Esta es una llamada implicita, la clase object.
        this.nombre = nombre;
        this.apellido = apellido;
        
        System.out.println("Objeto persona usando this: " + this);//Se esta haciendo referencia al objeto new Persona("Juan", "Perez");
        
        /*
        Esta sintaxis es equivalente a escribir
        Imprimir imprimir = new Imprimir(this);
        
        Al colocar this, se esta compartiendo el objeto new Persona("Juan", "Perez");
        */
        new Imprimir().imprimir(this);
    }
}

class Imprimir{

    public Imprimir(){
    
        super();//El constructor de la clase object (clase padre) para resevar memoria
    }
    
    public void imprimir(Persona persona){
    
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);//Apunta al objeto new Imprimir().imprimir(this);
    }
}