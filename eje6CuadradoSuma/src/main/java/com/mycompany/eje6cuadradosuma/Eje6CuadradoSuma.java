/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje6cuadradosuma;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class Eje6CuadradoSuma {
    // crear el cuadrado de la suma de dos numeros (a + b)^2 =a^2 + 2ab + b^2

    public static void main(String[] args) {
        //declaracion de variables
        Double primerNumero, segundoNumero, resultado;
        Scanner entrada =new Scanner( System.in);
        Scanner entrada2 =new Scanner( System.in);
        
        //Ingreso de datos del usuario
        
        System.out.println("Ingresa el primer numero:");
        primerNumero=entrada.nextDouble();
        
        System.out.println("Ingresa el segundo numero:");
        segundoNumero=entrada2.nextDouble();
        
        resultado= (Math.pow(primerNumero, 2))+(2*primerNumero*segundoNumero)+(Math.pow(segundoNumero, 2));
        System.out.println("El resultado de la expresión es: " + resultado);
    
    }
}  
       
