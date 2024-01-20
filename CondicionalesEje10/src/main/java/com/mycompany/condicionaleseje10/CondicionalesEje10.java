/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje10;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje10 {

    public static void main(String[] args) {
        /*
        Pedir el dia el mes y el año de una fecha e indicar si la fecha
        es correcta, con meses de 28, 30 y 31 dias. Sin años bisiestos
        */
        
        int dia, mes, anio;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if (anio > 0 && mes >= 1 && mes <= 12) {
            boolean fechaValida = false;
            switch (mes) {
                case 2:
                    fechaValida = dia <= 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    fechaValida = dia <= 30;
                    break;
                default:
                    fechaValida = dia <= 31;
                    break;
            }

            if (fechaValida) {
                JOptionPane.showMessageDialog(null, "La fecha es válida");
            } else {
                JOptionPane.showMessageDialog(null, "La fecha no es válida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha no es válida");
        }
    }
}
//revisar
