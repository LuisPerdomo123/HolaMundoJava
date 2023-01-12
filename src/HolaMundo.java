
import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {

        //System.out.println("Hola Mundo desde Java");
        //Definimos la variable literal numérica entera
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

        //Modificamos el valor de la variable
        miVariableEntera = 5;
        //Atajo para impresion en consola "sout+tab"
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

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _MiVariable = 2;
        var $miVariable = 3;

        //var áVariable = 10; No se recomienda utilizar
        //Concatenacion de variables
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;

        System.out.println("unión = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); //Se realiza la suma de numeros
        System.out.println(i + j + usuario); //Realiza la suma se las primeras variables y despues concatena
        System.out.println(usuario + i + j);//Contexto cadena. Todo se toma como una cadena
        System.out.println(usuario + (i + j));//Priemro se realiza la suma y luego concatena

        //Caracteres especiales
        var nombre = "Lizeth";//Ingreso de codigo duro

        
        System.out.println("Nueva linea: \n" + nombre);//Salto de linea
        System.out.println("Tabulador: \t" + nombre);//Ingresa tabulador
        System.out.println("Retroceso: \b"+nombre);//Regresa una pósicio
        System.out.println("Comilla simple: \'"+nombre+"\'");//El nombre esta entre comilla simple
        System.out.println("Comilla doble: \""+nombre+"\"");//Impresion dela comilla doble
        
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuarioScanner = consola.nextLine();
        System.out.println("usuarioScanner = " + usuarioScanner);
        System.out.println("Escribe el titulo: ");
        var titulo2 = consola.nextLine();
        System.out.println("Resultado = " + titulo2 + " "+ usuarioScanner);

        
        /*
        Tipos primitivos que almacenan enteros:
        byte 8 bits, short 16 bits, char 16 bots, int 32 bits, long 64 bits
        CPU trabaja tipo 32 bits o 64 bits, por tanto no hay probabilidad que
        se ahorre espacio
        */
        
        byte numeroByte = (byte)129;
        //conversión de valores. Se utiliza parentesis para cambio de valor
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo byte: " + Short.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483647L;//Conversion a valor tipo Long a entero, pero pierde presicion
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo byte: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Integer.MAX_VALUE);
        
        long numeroLong = (long)9223372036854775807D;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo byte: " + Long.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Long.MAX_VALUE);
    }
}
