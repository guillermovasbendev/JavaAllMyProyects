/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sentenciaoperadorternario;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class SentenciaOperadorTernario {

    public static void main(String[] args) {
        /*
        valor=(condicion) ? valor1 : valor2
        */
        
        int numero;
        String mensaje;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero:"));
        
        //comprobar si el numero es par se divide en 2 y el residuo debe ser igual a 0
        mensaje=(numero%2==0) ? "Es par" : "Es impar";
        
        JOptionPane.showMessageDialog(null,mensaje);
        
        // o puede funcionar asi:
        //JOptionPane.showMessageDialog(null,(numero%2==0) ? "Es par" : "Es impar");
    }
}
