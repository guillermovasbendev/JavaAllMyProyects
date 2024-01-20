/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje6;

import javax.swing.JOptionPane;



/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje6 {

    public static void main(String[] args) {
        /*
        Hacer un programa que tome dos numeros 
        y diga si ambos son pares o impares.
        
        &&: Es un operador lógico AND condicional. A diferencia de &, && realiza una evaluación de 
        cortocircuito o "short-circuit". Esto significa que si la primera expresión es falsa, 
        la segunda expresión no se evalúa, ya que el resultado general será falso de todos modos.
        && es útil cuando no se quiere realizar una segunda evaluación si la primera ya determina el
        resultado final.
        */
        
       //Declaracion de variables
       int numero1, numero2;
       
       //Solicitar variables al usuario
       
       
       
       numero1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el primer numero: "));
        
       numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el segundo numero: "));
       
       
       if(numero1 % 2 == 0 & numero2 % 2 == 0){
           JOptionPane.showMessageDialog(null, "Los dos numeros son pares");
       }
       else{
          JOptionPane.showMessageDialog(null, "Los dos numeros NO son pares"); 
       }
    }
}
