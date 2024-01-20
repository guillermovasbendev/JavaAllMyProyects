/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cicloseje1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CiclosEje1 {

    public static void main(String[] args) {
        /*
        Leer un numero y mostrar su cuadrado, repetir el
        proceso hasta que se introdusca un numero negativo
        */
        
        int n, cuadrado;

        
        n=Integer.parseInt(JOptionPane.showInputDialog("ingresa tu numero"));

        while(n>0){
            cuadrado = (int) Math.pow(n, 2);
            JOptionPane.showMessageDialog(null, "El cuadrado del numero es: " + cuadrado);
            n=Integer.parseInt(JOptionPane.showInputDialog("ingresa otro numero"));
        }
    

    }
}
