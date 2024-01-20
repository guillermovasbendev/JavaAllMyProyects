/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje8;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje8 {

    public static void main(String[] args) {
        //pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
        
    int n;
    n= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero entre 0 y 99999:"));
    
   if(n<10){
   JOptionPane.showMessageDialog(null, "el numero tiene 1 cifras");
   }
   else if(n<100){
   JOptionPane.showMessageDialog(null, "el numero tiene 2 cifras");
   }
   else if(n<1000){
   JOptionPane.showMessageDialog(null, "el numero tiene 3 cifras");
   }
   else if (n<10000) {
    JOptionPane.showMessageDialog(null, "el numero tiene 4 cifras");   
   }
   else{
    JOptionPane.showMessageDialog(null, "el numero tiene 5 cifras"); 
    }
    }
}
