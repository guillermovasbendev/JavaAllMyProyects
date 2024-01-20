/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje12;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje12 {

    public static void main(String[] args) {
       /* 
        Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, 
        Suficiente, Bien, notable y sobresaliente.
        Insuficiente 0-4
        Suficiente 4-5
        bien 5-7
        notable 7-8 
        sobresaliente 9
        Excelente 10
        */
       //
       float nota;
       
       nota=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota (entre 1 y 10):"));
     
       if (nota<4f){
           JOptionPane.showMessageDialog(null, "tu nota es Insuficiente");
       }
       else if((nota>4f)&&(nota<=5f)){
           JOptionPane.showMessageDialog(null, "tu nota es Suficiente");
       }
        else if((nota>5f)&&(nota<=7f)){
           JOptionPane.showMessageDialog(null, "tu nota esta bien pero puedes mejorar");
       }
        else if((nota>7f)&&(nota<=8f)){
           JOptionPane.showMessageDialog(null, "tu nota es notable, pero con esfuerzo puede ser excelente");
       }
        else if((nota>9f)&&(nota<10f)){
           JOptionPane.showMessageDialog(null, "tu nota es Sobresaliente");
       }
        else if(nota==10){
           JOptionPane.showMessageDialog(null, "tu nota es excelente"); 
        }  
        else if ((nota<0f)||(nota>10f)){
           JOptionPane.showMessageDialog(null, "error las notas deben estar entre el rango 1-10");
       }
       
    }
}
