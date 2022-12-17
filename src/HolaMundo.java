//Mi clase en Java

public class HolaMundo {
    public static void main(String args[]){

        //System.out.println("Hola Mundo desde Java");
        //Definimos la variable literal numérica entera
        int miVariableEntera = 10;  
        System.out.println(miVariableEntera);
        
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        //Atajo para impresión en consola "sout+tab"
        System.out.println(miVariableEntera);
        
        //Definimos la variable literal String
        String miVariableCadena = "Saludos";
        //Con ctrl+space despliega las variables
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        //Con ctrl+space despliega las variables
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        //Se identifica de manera automatica el tipo de variable
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVaribaleCadena2 = "Nueva Cadena";
        //soutv + tab, atajo para impresion de cadena
        //Se realiza concatenacion de cadenas
        System.out.println("miVaribaleCadena2 = " + miVaribaleCadena2);
    }
}
