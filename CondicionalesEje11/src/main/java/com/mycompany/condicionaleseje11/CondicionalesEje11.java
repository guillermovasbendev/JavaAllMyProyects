/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje11;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje11 {

    public static void main(String[] args) {
        /*
        construir un programa que simule el funcionamiento de una calculadora que puede realizar las 
        cuatro operaciones aritmeticas basicas( suma, resta, multiplicacion, division) con valores
        numericos enteros. El usuario debe especificar la operacion con el primer caracter del primer 
        parametro de la linea de comandos: S o s para sum, R o r para resta, P,p, M,m para el producto 
        y D o D para la d para la division 
        */
        char letra;
        int n1,n2,res;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
        letra=JOptionPane.showInputDialog("digita la operacion que quieres hacer, si es suma una S, si es resta R si es multiplicacion una S, si es division una D").charAt(0);
        
        if((letra=='S')||(letra=='s')){
            res=n1+n2;
            JOptionPane.showMessageDialog(null, "el resultado es: " + res);
        }
        else if((letra=='R')||(letra=='r')){
           res=n1+n2;
           JOptionPane.showMessageDialog(null, "el resultado es: " + res); 
        }
        else if((letra=='M')||(letra=='m')){
           res=n1*n2;
           JOptionPane.showMessageDialog(null, "el resultado es: " + res); 
        }
         else if((letra=='D')||(letra=='d')){
           res=n1/n2;
           JOptionPane.showMessageDialog(null, "el resultado es: " + res); 
        }
    }
}
//faltaria la excepcion de manejo de error si no se usa ni S,R,M,D ni s,r,m,d.