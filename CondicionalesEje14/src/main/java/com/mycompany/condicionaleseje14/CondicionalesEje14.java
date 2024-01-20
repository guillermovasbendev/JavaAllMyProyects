/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje14;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje14 {

    public static void main(String[] args) {
       /*
         Hacer un programa que pase de Kg a otra unidad de medida de masa, 
         mostrar en pantalla un menu con las opciones posibles
        */
       
       float masa,masag,masaT,masaMg;
       int option;
       
       masa=Float.parseFloat(JOptionPane.showInputDialog("por favor ingrese la masa en Kg"));
       
       option=Integer.parseInt(JOptionPane.showInputDialog(null, "Escoge la unidad de medida a convertir \n 1. pasar a gramos(g) \n 2. pasar a toneladas(t) \n 3. pasar a miligramos (mg)"));
       
        switch (option) {
            case 1:
                masag=masa*1000;
                JOptionPane.showMessageDialog(null, "el valor de " + masa +"kg "+ "en gramos es de: " + masag +"g");
                break;
            case 2:
                masaT=masa/1000;
                JOptionPane.showMessageDialog(null, "el valor de " + masa +"kg "+ "en toneladas es de: " + masaT +"t");
                break;
            case 3:masaMg=masa/1000;
                JOptionPane.showMessageDialog(null, "el valor de " + masa +"kg "+ "en miligramos es de: " + masaMg +"mg");
                break;  
            default:JOptionPane.showMessageDialog(null, "La opcion escogida no es valida");
                break;
        }
 
       
       
    }
}
