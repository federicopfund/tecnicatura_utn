/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author federico pfund
 */


   
//import java.util.Scanner;

public class  HolaMundo {

    // creamos el main "psvm + tab"
    public static void main(String[] args) {
        //para escribir en consola "sout + tab"
        // ln significa line
        // ctrl + c para guardar el proyecto
        /*
        System.out.println("Hello Java");
       //Tipos de enteros y STRING
       int miVariable = 10;
       System.out.println(miVariable);
       miVariable = 5;
       System.out.println(miVariable);
       // Tipos de String
       String miVariableCadena = "Bienvenidos";
       System.out.println(miVariableCadena);
       miVariableCadena = "Sigamos creciendo en Programacion";
       System.out.println(miVariableCadena);
       /*
        
       /*
       
        
        // Var  inferencia de tipos en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);     
       
       
        //sout v + tab
        //Para ejecutar Shift + F6
        
        var usuario = "Federico Pfund";
        var titulo = "Developer Full Stack";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        
        // Ejercicio: Caracteres especiales con Java
        var nombre = "FENDERZ";
       // Digonal inversa y letra n, para agregar una linea en el print
        System.out.println("\nNueva linea: \n" + nombre);
        //Tabulador son cuatro espacios
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("\t\t.:MENÚ:.");
       // Caracter de retroceso
        System.out.println("Retroceso: \b\b" + nombre); 
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");
         */
        // Clase Scanner
        /*
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
        
        int entero;
        float decimal;
        String cadena; 
        String cadena2;
        
        
        System.out.print("Digite un numero entero:  ");
        entero = entrada.nextInt();
        System.out.println("El numero es de tipo entero:  "+entero);
        System.out.print("Digite un numero tipo flotante:  ");
        decimal = entrada.nextFloat();
        System.out.println("El Numero decimal es:  "+decimal);
        System.out.println("");
        System.out.print("Digite una String: ");
        cadena = entrada.next();
        System.out.println("La cadena con next es "+cadena);
        System.out.println("");
        System.out.print("Digite una cadena con next line  ");
        cadena2 = entrada.nextLine();
        System.out.println("La cadena es "+cadena2);
         */

        // Tipos de datos primitivos:
        //los tipos de datos primitivos incluyen
        // boolean, char, byte, short, int, long, float y double.
        /*
        // El valor minimo de byte -128 y el maximo 127
        byte numEnteroByte = 127; 
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: "+ Byte.MAX_VALUE);
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: "+ Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: "+ Short.MAX_VALUE);
        
        int numEnteroInt = 2996853852;
        
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int: "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: "+ Integer.MAX_VALUE);
        
        // Debemos agregar la letra "L" al final del número.
        
        long numEnteroLong = 24422L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor maximo del long: "+ Long.MAX_VALUE);
        System.out.println("Valor minimo del long: "+ Long.MIN_VALUE);
        
        // Tipos primitivos Flotantes.
        // Debemos agragar la letra "f" al final del número
        float numFloat = 3.4028235E38f; 
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo de float: "+ Float.MIN_VALUE);
        System.out.println("Valor maximo de float: "+ Float.MAX_VALUE);
        */
         /*
        double d = 1.0 / 0;
        System.out.println("Lo que se mostrará en la"
                + " pantalla después de ejecutar : "
                + d);/*
        //En el caso de la división doble/flotante,
        // la salida es Infinito, ya que la división por cero no arroja una excepción aritmética.
        // La razón de esto es que double y float usan el algoritmo aritmético de coma flotante,
        // que especifica valores especiales como "No es un número" o "infinito" mientras "se divide por cero" según los estándares IEEE 754.
        /*
        double numDouble = 1.34457793158e108;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo de double: "+ Double.MIN_VALUE);
        System.out.println("Valor maximo de double: "+ Double.MAX_VALUE);
         */
        // Inferencia de tipos var y tipos primitivos
        /*
        // Las literales sin punto automaticamente son de tipo int
        var numEntero = 20; 
        System.out.println("numEntero = " + numEntero);
         // Automaticamente con el punto y la F se transforma en tipo float
        var numFloat = 15.0F;
        System.out.println("numFloat = " + numFloat);
        // Automaticamente con el punto se transforma en tipo double
        var numDouble = 10.0;
         */
        // Tipos primitivos CHAR
        /*
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
       
        // Indicamos a Java la asignación con el código unicode
        char varCaracter = '\u0024'; 
        System.out.println("varCaracter = " + varCaracter);
        // Valor decimal del juego de caracteres unicode
        char varCaracterDecimal = 36; 
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        // Un caracter especial, podemos copiar y pegar desde unicode
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
         // Indicamos a Java la asignación con el código unicode
        var varCaracter1 = '\u0024'; 
        System.out.println("varCaracter1 = " + varCaracter1);
         // Valor entero y le asigna un tipo char
        var varCaracterDecimal1 = (char)36;
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
         // Un caracter especial, podemos copiar y pegar desde unicode
        var varCaracterSimbolo1 = '$'; 
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
         */
        // Tipos primitivos tipos booleanos
        /*
        boolean varBool = true;
        System.out.println("varBool = " + varBool);
        
        if (varBool) {
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La vandera es roja");
        }
         */
 /*
        var edad = 30;
         // Esta es una expresión booleana
        // var adulto = edad >= 18; 
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("No eres mayor de edad");
        }
         */
        // Conversion de tipos primitivos
        /*
        // La clase integer con el metodo parseint, transforma la cadena en un entero
        var edad = Integer.parseInt("20"); 
        // resultado sera 25
        System.out.println("edad = " + (edad + 1)); 
        
        var edad = "27"; // tipo cadena
        // esto nos dara como resultado 201
        System.out.println("edad = " + (edad + 1)); 
        
        var valorPI = Double.parseDouble("3.141657");
        System.out.println("valorPI = " + valorPI);
         */
        // Pedir un valor
        /*
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("entrada = " + entrada);
        System.out.println("edad = " + edad);
         */
        // Conversión de tipos primitivos (parte dos)
        /*
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter");
        var entrada = new Scanner(System.in);
        fraseChar = entrada.nextLine().charAt(0); // por mas que pongamos una cadena, solo tomara el carater en el indice especificado.
        System.out.println("fraseChar = " + fraseChar);
         */
        /*
        // Comparacion de Booleanos
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("eNum: " + cNum);

        //Comparacion de STRING
        var cadenaA = "Hello";
        var cadenaB = "Hello";
       
        System.out.println(cadenaA == cadenaB);
        //mostrar un mensaje al usuario si el numero es par
        if (aNum % 2 == 0) {// comparacion por referencia
            System.out.println("El Numero es para");
        } else {
            System.out.println("El Numero es impar");
        }
        
        // metodos para comparacion, 
        // comparacion interna de lo que tienen las variables adentro
        var fvar = cadenaA.equals(cadenaB);
        System.out.println("fvar : " + fvar);
        
        //Operadores Relacionada
        var TVar = aNum > bNum;//> >= < <= == 1=
        System.out.println("TVar =" + TVar);
        var FVar = aNum < bNum;
        System.out.println("gVar =" + FVar);
        var rVar = aNum >= bNum;
        System.out.println("gVar =" + rVar);
        
        var Edad = 30;
        
          if (Edad >= 18) {// comparacion por referencia
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
        */
       var valorA = 11;
       var valorMinimo = 0;
       var valorMaximo = 10;
       var respuesta = valorA >= 0 && valorA <=10;
       
       if (respuesta){
           System.out.println("Esta dentro del rango establecido.");
       }else{
           System.out.println("Este Numero esta dentro de rango establecido.");        
       }

    }
}