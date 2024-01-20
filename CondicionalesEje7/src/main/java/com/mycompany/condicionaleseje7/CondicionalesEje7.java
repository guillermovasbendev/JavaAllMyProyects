/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje7;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje7 {

    public static void main(String[] args) {
        /*
        Pedir tres numeros y mostrarlos ordenados de mayor a menor
        */
        
        //Declaracion de variables
        int num1, num2, num3;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer numero:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo numero:"));
        num3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el tercer numero:"));    
        
        
        if((num1>num2)&&(num2>num3)){
            JOptionPane.showMessageDialog(null,"orden:" + num1+num2+num3);
        }
        else if((num2>num1)&&(num2>num3))
        JOptionPane.showMessageDialog(null,"orden:" + num2+num1+num3);
        else{
         JOptionPane.showMessageDialog(null,"orden:" + num3+num2+num1);   
        }
    }
}
