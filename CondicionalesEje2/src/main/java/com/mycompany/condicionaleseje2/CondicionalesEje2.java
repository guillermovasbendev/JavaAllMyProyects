/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje2;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje2 {

    public static void main(String[] args) {
        /*
        Pedir dos numeros y decidir cual es mayor o si son iguales
        */
        
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Digita una el primer numero:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digita una el segundo numero:"));
      
                
        if(a>b){ 
        JOptionPane.showMessageDialog(null, " el numero mayor es: " + a);
        }
        else if(a<b){
        JOptionPane.showMessageDialog(null, " el numero mayor es: " + b);
        }
        else { //else no lleva condicion, solo funciona cuando ninguna de las otras dos opciones es verdad
        JOptionPane.showMessageDialog(null, " Los numeros son iguales ");
        }
    }
}
