/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoreseje1;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class OperadoresEje1 {

    public static void main(String[] args) {
        /*
        Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
        */
        
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita una entero:"));
        
        JOptionPane.showMessageDialog(null,(numero%10==0) ? "Es multiplo de 10" : "No es multiplo de 10");
                
    }
}
