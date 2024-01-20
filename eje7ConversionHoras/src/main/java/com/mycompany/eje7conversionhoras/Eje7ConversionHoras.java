/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje7conversionhoras;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class Eje7ConversionHoras {

    public static void main(String[] args) {
        /*Construir un programa que, dado un numero total de horas, 
        devuelve el numero de semanas, dias y horas equivalentes.Por ejemplo
        dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.*/
        int nHoras, nDias, nSemanas;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de horas:");
        nHoras=entrada.nextInt();
        
        //las horas en una semana son 24h x 7 dias= 168
        
        nSemanas=nHoras/168;
        nDias=nHoras%168/24;//se saca el residuo de las semanas / 24 horas de cada dia
        nHoras=nHoras%24;
        
        System.out.println("Estas horas equivalen a:" +nSemanas  + " Semanas");
        System.out.println("Estas horas equivalen a:" + nDias+ " Dias");
        System.out.println("Estas horas equivalen a:" + nHoras + " Horas");
        
        
        
        
        

        
        
    }
}
