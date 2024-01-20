/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cicloseje2;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CiclosEje2 {

    public static void main(String[] args) {
        /*
        Leer un numero e indicar si es positivo o negativo. 
        El proceso se repetira hasta que se introdusca un 0
        */
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu número"));

        while (n != 0) {
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "El numero es positivo");
            } else {
                JOptionPane.showMessageDialog(null, "El numero es negativo");
            }

            // Se vuelve a solicitar el número para continuar el proceso
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu número"));
        }

        // El usuario ingresó 0, por lo que se termina el ciclo
        JOptionPane.showMessageDialog(null, "Has ingresado 0. El proceso ha terminado.");
    }
    }

