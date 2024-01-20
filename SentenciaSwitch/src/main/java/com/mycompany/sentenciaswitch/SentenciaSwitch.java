/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sentenciaswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class SentenciaSwitch {

    public static void main(String[] args) {
        /*
        
        switch(dato){
        case 1: Instrucciones1;
                break;
        case 2: Instrucciones2;
                break;
        case 3: Instrucciones3;
                break;
        default: Caso diferente;
                break;
        }
        
        */
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita una numero de 1 a 3:"));
        
        switch(numero){
        case 1: JOptionPane.showMessageDialog(null,"El numero es 1");
                break;
        case 2: JOptionPane.showMessageDialog(null,"El numero es 2");
                break;
        case 3: JOptionPane.showMessageDialog(null,"El numero es 3");
                break;
        default:JOptionPane.showMessageDialog(null,"Tu numero no es ni 1, ni 2, ni 3");
                break;
        }
    }
}
