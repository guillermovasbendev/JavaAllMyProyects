/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje9;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje9 {

    public static void main(String[] args) {
        /*
        Pedir el dia mes y año de una fecha e indicar si la fecha es correcta
        suponiendo que todos los meses son de 30 dias
        */
        int dia, mes, anio;

        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el día:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el mes:"));
        anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el año:"));

        if (anio > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
            JOptionPane.showMessageDialog(null, "La fecha es válida: " + dia + "/" + mes + "/" + anio);
        } else {
            JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida.");
        }
    }
}
