/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje3problema;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class Eje3Problema {

    public static void main(String[] args) {
        /*Guillermo tiene N dolares. 
        Luis tiene la mitad de lo que posee Guillermo, 
        Juan tiene la mitad de lo que posee Luis y Guillermo Juntos
        Calcule e imprima la cantidad de dinero que tienen entre los 3 */
        Scanner entrada = new Scanner(System.in);
        double n; // n equivale a Guillermo
        double x; // x equivale a Luis
        double y; // y equivale a Juan
        double total;
        
        System.out.println("Ingrese la cantidad de dinero que tiene Guillermo:5");
        String input=entrada.nextLine();//creamos la variable input 
        //y en ella almacenamos el dato de usuario
        n=Double.parseDouble(input);// Hacemos parse Double para 
        //convertir el dato en  Double
        System.out.println("Decidiste que la cantidad que tiene Guillermo es de: " + n);
        x=n/2;
        System.out.println("Luis tiene: "+ x);
        y=(x+n)/2;
        System.out.println("Juan tiene: "+ y);
        total=n+x+y;
        System.out.println("En total la suma de los tres es igual a: " + total);
        
        
        
    }
}
