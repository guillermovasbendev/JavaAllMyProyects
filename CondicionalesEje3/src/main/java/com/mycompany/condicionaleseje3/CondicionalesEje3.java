/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje3;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje3 {

    public static void main(String[] args) {
        /*
        Programa que lea un caracter por teclado y compruebe si es mayuscula o minuscula
        */
        char letra;
        letra=JOptionPane.showInputDialog(null, "digite una letra").charAt(0);
    
    
    if(Character.isUpperCase(letra)){
        JOptionPane.showMessageDialog(null,"La letra es mayuscula");
    }
    else{
    JOptionPane.showMessageDialog(null,"La letra es minuscula");
    }
}
}

