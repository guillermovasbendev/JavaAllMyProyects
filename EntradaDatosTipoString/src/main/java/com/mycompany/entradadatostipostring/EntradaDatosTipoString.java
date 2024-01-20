/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradadatostipostring;
import java.util.Scanner;
/**
 *
 * @author GUILLERMO
 */
public class EntradaDatosTipoString {
    

    public static void main(String[] args) {
        System.out.println("Siempre se debe importar e INSTANCIAR scanner dentro del codigoHola scanner");
       Scanner entrada = new Scanner(System.in); // Crear un objeto Scanner para la entrada de datos
       System.out.println("ingresando datos tipo cadenas");
        
        String cadena; // Declaración de la variable cadena
        
        System.out.println("Ingresa una cadena de texto:");
        cadena = entrada.nextLine(); // Usa nextLine() para leer toda la línea
        
        System.out.println("Para el dato tipo string usamos entrada.next");
        System.out.println("Pero next solo guarda hasta encontrar un espacio, si quieres la frase completa usar nextLine");
        System.out.println("La cadena ingresada por el usuario en nextLine es: " + cadena);
    }
}
