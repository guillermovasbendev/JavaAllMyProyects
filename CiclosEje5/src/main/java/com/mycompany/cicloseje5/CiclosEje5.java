/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cicloseje5;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CiclosEje5 {

    public static void main(String[] args) {
        /*
        Realizar un juego, para adivinar un numero.Para ello generar
        un numero aleatorio del 1 al 100, y luego ir pidiendo numeros
        indicando "es mayor" o "es menor" segun sea mayor o menor con 
        respecto a N. El proceso termina ciando el usuario acierta y mostrar
        el numero de intentos
        */
        int numUsuario, contador;
        int pNumero;

        pNumero = (int) (Math.random() * 100);
        contador = 0;

        numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu número"));

        while (pNumero != numUsuario) {
            contador++;

            if (numUsuario > pNumero) {
                JOptionPane.showMessageDialog(null, "Es menor y este es tu " + contador + " intento");
            } else {
                JOptionPane.showMessageDialog(null, "Es mayor y este es tu " + contador + " intento");
            }

            numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu número"));
        }

        JOptionPane.showMessageDialog(null, "¡Tu número es correcto! Has adivinado en " + contador + " intentos.");
    }
}
