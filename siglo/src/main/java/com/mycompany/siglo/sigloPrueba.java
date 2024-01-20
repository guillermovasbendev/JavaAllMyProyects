/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.siglo;

import javax.swing.JOptionPane;

/**
 *
 * Autores
 * JUAN CARLOS BOTERO MARTINEZ
 * LEIDY JOHANNA LONDONO MONTOYA
 * FABIAN ANDRES NOPSA ACERO
 * JEIMMY LILIANA RACHE CAMARGO
 * JOSE GUILLERMO VASQUEZ BENITEZ
 */
public class sigloPrueba {

    public static void main(String[] args) {
      int anho;
      int siglo;
        
      anho = Integer.parseInt(JOptionPane.showInputDialog("Digita por favor el año completo: "));
       
       siglo = (anho/100)+1;
       
       JOptionPane.showMessageDialog(null,"El año que ingresaste pertenece al siglo:" + siglo);
    }
}
