/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cicloseje3;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CiclosEje3 {

    public static void main(String[] args) {
        /*
        Leer numeros hasta que se introdusca un0. Para cada uno indicar si es par o impar
        */
         int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu número"));

        while (n != 0) {
            if (n%2==0) {
                JOptionPane.showMessageDialog(null, "El numero es par");
            } else {
                JOptionPane.showMessageDialog(null, "El numero es impar");
            }

            // Se vuelve a solicitar el número para continuar el proceso
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu número"));
        }

        // El usuario ingresó 0, por lo que se termina el ciclo
        JOptionPane.showMessageDialog(null, "Has ingresado 0. El proceso ha terminado.");
    }
    }

