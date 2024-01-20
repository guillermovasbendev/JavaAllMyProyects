/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje8raicez;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class Eje8raicez {

    public static void main(String[] args) {
        /*Construir un programa que calcule 
        y muestre por pantalla las raices de la ecuacion de segundo grado
        de coeficientes reales.
        ax^2 + bx + c =0

        x=(-b+-sqrt(b^2-4ac))/2a                       */
        //declaracion de variables
        Double a, b, c, resultadoPos, resultadoNeg;
        
        //Declaracion de Scanner para entradas del usuario
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        //ingreso de las tres variables por el usuario
        
        System.out.println("Ingresa el valor de a como numero entero:");
        a=entrada.nextDouble();
        
        System.out.println("Ingresa el valor de b como numero entero:");
        b=entrada1.nextDouble();
        
        System.out.println("Ingresa el valor de c como numero entero:");
        c=entrada2.nextDouble();
        
        //ejecucion de la formula cuadratica para raiz positiva y para raiz negativa
        resultadoPos= (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        resultadoNeg= (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        
        //Se imprimen las raicez
        System.out.println("El valor de x positivo es: " + resultadoPos );
        System.out.println("El valor de x negativo es: " + resultadoNeg );
        
    }
}
