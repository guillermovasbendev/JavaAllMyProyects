/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sentenciaifelse;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class SentenciaIfElse {

    public static void main(String[] args) {
        /* estructura:
        
        if(condicion){ 
        Instruccion;
        }
        else{
        instruccion;
        }
        
        el operador de igualdad == (un solo = es asignacion)
        el operador de diferencia !=
        el operador de mayor que >
        el operador > menor que 
        el operador mayor o igual >=
        rl operador menor o igual <=
        */
        
        int numero,dato=5;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero:"));
        
          if(numero==dato){ 
         JOptionPane.showMessageDialog(null,"los numeros son iguales");
        }
        else{
        JOptionPane.showMessageDialog(null,"los numeros NO son iguales");
        }
    }
}
