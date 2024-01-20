/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cicloseje4;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CiclosEje4 {

    public static void main(String[] args) {
        /*
        Pedir numeros hasta que se teclee uno negativo, 
        y mostrar cuantos numeros se han introducido
        */
        
        int numero,contador;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        contador=0;
        
        while(numero>=0){
            contador+=1;
            JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " numeros");
            numero=Integer.parseInt(JOptionPane.showInputDialog("ingresa otro numero"));
        }
        JOptionPane.showMessageDialog(null, "tu numero es negativo, fin del programa");
    }
}
