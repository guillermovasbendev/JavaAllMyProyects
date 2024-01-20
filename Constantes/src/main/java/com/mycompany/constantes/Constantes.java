/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constantes;

/**
 *
 * @author GUILLERMO
 */
public class Constantes {

    public static void main(String[] args) {
        System.out.println("Las variables declaradas como const (constantes)");
        System.out.println("no cambian en el transcurso del resto del programa");
        int cambia= 13;
        System.out.println("la variable con int es: " + cambia);
        cambia =43;
        System.out.println("la variable con int cambio: " + cambia);
        
        final int constante = 34;
        System.out.println("");
        System.out.println("Para declarar una constante se usa final el tipo de dato y la asignacion final int constante = 34; ");
        System.out.println("El numero declarado con const no cambia es " + constante);
           
    }
}
