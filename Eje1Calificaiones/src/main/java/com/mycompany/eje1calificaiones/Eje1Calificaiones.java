/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje1calificaiones;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class Eje1Calificaiones {

    public static void main(String[] args) {
        //Hacer un programa que calcule e imprima la suma de tres calificaciones
        //Yo use JOptionPane
        double cal1, cal2, cal3;
        double total;
        
        cal1 =Double.parseDouble(JOptionPane.showInputDialog("Digite la primera nota"));
        cal2 =Double.parseDouble(JOptionPane.showInputDialog("Digite la segunda nota"));
        cal3 =Double.parseDouble(JOptionPane.showInputDialog("Digite la tercera nota"));
        
        total=cal1+cal2+cal3;
        
        JOptionPane.showMessageDialog(null,"la suma de las tres notas es "+ total);
        
    }
}
