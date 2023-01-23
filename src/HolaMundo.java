
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
        var nombre = "Luis E";//Ingreso de codigo duro

        System.out.println("Nueva linea: \n" + nombre);//Salto de linea
        System.out.println("Tabulador: \t" + nombre);//Ingresa tabulador
        System.out.println("Retroceso: \b" + nombre);//Regresa una pósicio
        System.out.println("Comilla simple: \'" + nombre + "\'");//El nombre esta entre comilla simple
        System.out.println("Comilla doble: \"" + nombre + "\"");//Impresion dela comilla doble

        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuarioScanner = consola.nextLine();
        System.out.println("usuarioScanner = " + usuarioScanner);
        System.out.println("Escribe el titulo: ");
        var titulo2 = consola.nextLine();
        System.out.println("Resultado = " + titulo2 + " " + usuarioScanner);

        /*
        Tipos primitivos que almacenan enteros:
        byte 8 bits, short 16 bits, char 16 bots, int 32 bits, long 64 bits
        CPU trabaja tipo 32 bits o 64 bits, por tanto no hay probabilidad que
        se ahorre espacio
         */
        byte numeroByte = (byte) 129;
        //conversión de valores. Se utiliza parentesis para cambio de valor
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = (int) 2147483647L;//Conversion a valor tipo Long a entero, pero pierde presicion
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong = (long) 9223372036854775807D;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

        /*
        Tipos primitivos flotantes:
        float 32 bits, double 64 bits
         */
        float numeroFloat = 10.0F;//Por defecto, Java asigna flotantes como double
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

        double numeroDouble = 10.0;//Por defecto, Java asigna flotantes como double
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);

        var numeroEntero = 10;//Por defecto quedan variables de tipo entero.
        System.out.println("numeroEntero = " + numeroEntero);

        var numDouble = 10.0; //Asignacion varible tipo double
        System.out.println("numDouble = " + numDouble);

        var numFloat = 10.0F;//Variable tipo float
        System.out.println("numFloat = " + numFloat);

        /*
        Tipos primitivo char
         */
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        //Se rige por lista de caracter unicode
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        //Ahora se utilizará la variable var. Se realiza una inferencia de tipo.
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);

        var varCharDecimal2 = 33;//En este caso se crea una variable de tipo entero.
        System.out.println("varCharDecimal2 = " + varCharDecimal2);

        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);

        int variableEnteraSimbolo = '!';//Se convierte a su variable decimal
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'a';//Se convierte al valor decimal del caracter.
        System.out.println("letra = " + letra);

        /*
        Tipos primitivos boolean
         */
        boolean varBoolean = true;//Valores de tipo bandera
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean == true) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        //Desarrollo de algorimo para determianr edad
        var edad = 30;
        var esAdulto = edad >= 18;//Opcion para variable boolean
        if (esAdulto) {

            System.out.println("Eres mayor de edad");
        } else {

            System.out.println("Eres menor de edad");
        }

        /*
        Conversiones de tipo primitivo
         */
        //Conversion tipo string to int & string to douoble
        var edad1 = Integer.parseInt("20");
        System.out.println("edad1 = " + (edad1 + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor utililazndo clase scanner
        var consola1 = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad1 = Integer.parseInt(consola1.nextLine());
        System.out.println("Edad = " + edad1);

        //Conversio tipo int to string
        var edadTexto = String.valueOf(10);
        System.out.println("edadTeaxto = " + edadTexto);

        var caracter = "Hola".charAt(2);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter: ");
        caracter = consola1.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

        /*
        Operadores aritmeticos
         */
        int a = 40, b = 2;

        var resultado = a + b;
        System.out.println("resultado suma= " + resultado);

        resultado = a - b;
        System.out.println("resultado resta= " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion= " + resultado);

        resultado = a / b;//No incluye el punto flotante porque la variable resultado es de tipo entero
        System.out.println("resultado division= " + resultado);

        var resultado2 = 3.0 / b; //La variable resultado2 es asignada como fltoante
        System.out.println("resultado2 division flotante= " + resultado2);

        resultado = a % b;//Residuo entero
        System.out.println("resultado = " + resultado);

        //Determinar si la variable a es par o impar
        if (a % 2 == 0) {

            System.out.println("Es un numero par");
        } else {

            System.out.println("Es un numero impar");
        }

        /*
        Operadores de asignacion
         */
        int c = a + 5 - b;//La evaluacion se realiza de izquierda a derecha
        System.out.println("c = " + c);

        //Operador de composicion
        a += 1;//a=a+1
        System.out.println("a = " + a);

        a += 3;//a=a+3
        System.out.println("a = " + a);

        a -= 2;//a=a-2
        System.out.println("a = " + a);

        // *=   /=  %=
        /*
        Operadores unarios
         */
        var e = 3;
        var f = -e;//Operador cambio de signo

        System.out.println("e = " + e);
        System.out.println("f = " + f);

        var g = true;
        var h = !g;//Inversion de la variable h

        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Incremento
        //1. pre incremento (simbolo antes de la variable)
        var ee = 3;
        var ff = ++ee;//Primero se incrementa la variable y despues se usa su valor

        System.out.println("ee = " + ee);
        System.out.println("ff = " + ff);

        //2. Postincremento (simbolo despues de la variable)
        var gg = 5;
        var hh = gg++;//primero se utiliza el valor y despues se incrementa

        System.out.println("gg = " + gg);//Tenemos pendiente un incremento
        System.out.println("hh = " + hh);

        //decremento
        //1. Predecremento
        var ii = 2;
        var jj = --ii;

        System.out.println("ii = " + ii);//Ya esta decrementada
        System.out.println("jj = " + jj);

        //2. Postdecremento
        var kk = 4;
        var ll = kk--;//Primero se usa el valor de la variable y queda pendiente decremento

        System.out.println("kk = " + kk);
        System.out.println("ll = " + ll);

        /*
        Operador de igualdad y relaciones
         */
        a = 3;
        b = 2;

        //Operador de igualdad
        var cc = (a == b);//Parentesis es opcional
        System.out.println("cc = " + cc);

        //Operador diferencia
        var dd = a != b;
        System.out.println("dd = " + dd);

        //Para trabajar con cadena tipo String
        var cadena11 = "Hola";
        var cadena12 = "Adios";

        var cadeEva = cadena11 == cadena12;//No esta comparando el contenido sino la referencia de memoria del objeto
        System.out.println("cadeEva = " + cadeEva);

        var cadeF = cadena12.equals(cadena11);//Se esta evaluando el contenido de cadenas
        System.out.println("cadeF = " + cadeF);

        /*
        operadores relacionales
         */
        var ge = a >= b;//mayor que > o mayor o igual que >=
        System.out.println("ge = " + ge);

        if (a % 2 == 0) {

            System.out.println("Es numero par");
        } else {

            System.out.println("Es numero impar");
        }

        //Ejercicio mayor de edad
        var edad11 = 10;
        var adulto = 18;

        if (edad11 >= adulto) {

            System.out.println("Es adulto");
        } else {

            System.out.println("Es menor de edad");
        }

        /*
        Operadores condicionales
         */
        a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado12 = a >= 0 && a <= 10;//Operador AND

        if (resultado12) {//Esta expresion se asume verdadera

            System.out.println("Dentro de rango");
        } else {

            System.out.println("Fuera de rango");
        }

        //Ejemplo de operador OR. Un padre puede asistir al juego de su hijo
        var vacaciones = false;
        var diaDescanso = false;

        if (vacaciones || diaDescanso) {//Esta expresion se toma como verdadera. Operador OR

            System.out.println("Padre puede asistir al juego del hijo");
        } else {

            System.out.println("El padre esta ocupado");
        }

        /*
        Operador ternario
         */
        //Se utiliza como una estructura simplificada de if else
        //Se debe utilizar en estructuras sencillas
        var resultado13 = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado13 = " + resultado13);

        var numero13 = 8;
        resultado13 = (numero13 % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado13 = " + resultado13);

        /*
        Precedencia de operadores
        Orden en que se evaluaran los operadores
         */
        var x = 5;
        var y = 10;
        var z = ++x + y--;//Preincrementa x y postdecrementa y. Solo hasta la proxima vez que se utilice y se vera el cambio

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var resultado14 = 4 + 5 * 6 / 3;//Se evalua de izquierda a derecha. Prioridad *,/,+,-
        //4 + ((5*6)/3)=14. Esta ejecucion igual el uso de parentesis
        System.out.println("resultado14 = " + resultado14);

        //Modificacion de resultado con parentesis
        resultado14 = (4 + 5) * 6 / 3;//Tiene mayor prioridad el parentesis
        System.out.println("resultado14 = " + resultado14);

        /*
        Sentencia de control if else
         */
        var condicion = true;

        if (condicion) {

            System.out.println("Condicion verdadera");
        } else {

            System.out.println("Condicion falsa");
        }

        //ejercicio para convertir un numero a texto
        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {

            numeroTexto = "Numero uno";
        } else if (numero == 2) {

            numeroTexto = "Numero dos";
        } else if (numero == 3) {

            numeroTexto = "Numero tres";
        } else if (numero == 4) {

            numeroTexto = "Numero cuatro";
        } else {

            numeroTexto = "Numero no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);

        //Segundo ejemplo if else para estacion del anio
        var mes = 1;
        var estacion = "Estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {

            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {

            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {

            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);

        /*
        Sentencia de control switch
        son utilizados en tipo menu
         */
        //Ejercicio de conversion numero a texto
        numero = 2;
        numeroTexto = "Valor desconocido";

        switch (numero) {

            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);

        //Ejemplo 2 sentencia Switch
        mes = 1;
        estacion = "Estacion desconocida";

        switch (mes) {

            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otonio";
                break;

        }
        System.out.println("estacion = " + estacion);
        
        /*
        Estructuracion de ciclos
        Repeticion de lineas de codigo
        */
        
        //Ciclo While
        
        var contador = 0;
        
        while(contador < 3){//Se tiene un contador
        
            System.out.println("contador = " + contador);
            contador++;
        }
        
        //Ciclo Do While
        
        contador = 0;
        
        do{
        
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 3);

        
        //Ciclo for
        for(var contador1 = 0;contador1 < 3;contador1++){
        
            System.out.println("contador1 = " + contador1);
        }
        
    }
}
