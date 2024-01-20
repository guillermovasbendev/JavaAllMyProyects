/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje5calificacionfinal;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class Eje5CalificacionFinal {

    public static void main(String[] args) {
        /*La calificacion final de un estudiante de informatica se calcula 
        con base a las calificaciones de cuatro aspectos de su rendimiento
        academico: participacion, primer examen parcial, segundo examen parcial 
        y examen final.
        sabbiendo que las calificaciones anteriores entran en la calificacion
        final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa
        que calcule e imprima la calificacion final obtenida */
        Scanner entrada1=new Scanner(System.in);
        Scanner entrada2=new Scanner(System.in);
        Scanner entrada3=new Scanner(System.in);
        Scanner entrada4=new Scanner(System.in);
        float participacion,primNota,segNota,examFinal,nota1,nota2,nota3,nota4, notaTotal;
        //float consume menos memoria que Double
        
        
        System.out.println("Ingrese la nota por participacion:");
        participacion= entrada1.nextFloat();
        
        System.out.println("Ingrese la nota primer examen parcial:");
        primNota= entrada2.nextFloat();
        
        System.out.println("Ingrese la nota primer examen parcial:");
        segNota= entrada3.nextFloat();
        
        System.out.println("Ingrese la nota primer examen parcial:");
        examFinal= entrada4.nextFloat();
        
        participacion*=0.10f;
        primNota*=0.25f;
        segNota*=0.25f;
        examFinal*=0.40f;
        
        
        notaTotal=participacion+primNota+segNota+examFinal;
        System.out.println("La nota definitiva es:"+ notaTotal);
        
    }
}
