/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradasalidadatos;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class EntradaSalidaDatos {

    public static void main(String[] args) {
        System.out.println("Existen dos tipos de entrada ");
        System.out.println("el primero es scaner con mayuscula Scanner");
        System.out.println("necesita importar scanner");
        Scanner entrada= new Scanner(System.in);
        System.out.println(" ");
        int numero; // Declara la variable para guardar el dato ingresado del usuario
        System.out.println("Digita un numero: ");
        
        numero = entrada.nextInt(); //linea que guarda el dato ingresado en la variable numero
        
        System.out.println("El numero es: "+ numero);// imprime el numero ingresado por el usuario
        System.out.println("");
        System.out.println("si el dato es tipo Int usamos entrada.nextInt");
        System.out.println("si el dato es tipo Float usamos entrada.nextFloat");
        System.out.println("si el dato es tipo double usamos entrada.nextDouble");
        System.out.println("");
        System.out.println("NOTA: En java se debe usar , en vez de punto, el punto produce errores");
        System.out.println("    ");

        
        
    }
}
