/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.variables;

/**
 *
 * @author GUILLERMO
 */
public class Variables {

    public static void main(String[] args) {
        // byte de -128 hasta el 127 (8 bits)
        byte entero ; //declaracion de variable
        entero=12;//definicion de variable
        System.out.println("la variable byte es: " + entero);
        
        //short desde -32768 a 32767 (16 bits)
        short numero;
        numero=22345;
         System.out.println("la variable short es: " + numero);
         
        //int desde -2147483648 a 2147483647(32 bits)
        int numeroInt;
        numeroInt=1245656;
         System.out.println("la variable int  es: " + numeroInt);
         
        //int desde -9223372036854775808 a 9223372036854775807 (64 bits)
        long numeroLong;
        numeroLong=12345656;
         System.out.println("la variable Long  es: " + numeroLong);
         
         //variables con punto decimal
         System.out.println("Las siguientes son variables con punto decimal float y double");
         
        //int desde -4.9e-324 a 1.8e 308 (32 bits) 1.4e-0.45 a 3.4e+038
        float numeroFloat;
        numeroFloat=12.3f;//las variables tipo float deben llevar una f para no presentar error
        
         System.out.println("la variable float  es: " + numeroFloat);
         System.out.println("las variables tipo float deben llevar una f para no presentar error");
         System.out.println("Dentro el codigo ejemplo: 12.3f");
         
        double numeroDouble;
        numeroDouble=15.3456;//las variables tipo float deben llevar una f para no presentar error
        
         System.out.println("la variable double  es: " + numeroDouble);
         
         //char alamacena caracteres como a  T 1 / etc. 
        char caracter = 'a';
        System.out.println("Para usar un caracter char debe ir entre comillas sencillas 'a' ");
        System.out.println("o produce error");
        System.out.println("el caracter es: " + caracter);
        
        boolean decision= true;
        System.out.println("el booleano es: " + decision);
       
    }
}
