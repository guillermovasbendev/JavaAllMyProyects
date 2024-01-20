/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.operadores;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero1,numero2,suma,resta,multiplicacion,div,residuo;
        System.out.println("Digite 2 numeros");
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        div=numero1/numero2;
        residuo=numero1%numero2;
        System.out.println("la suma es igual a:"+ suma);
        System.out.println("la resta es igual a:"+ resta);
        System.out.println("el residuo es igual a:" + residuo);
        System.out.println("la multiplicacion es igual a:"+ multiplicacion);
        System.out.println("la division es igual a:" + multiplicacion);
      
        
        
        
        
        
        
        
                
    }
}
