/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje13;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje13 {

    public static void main(String[] args) {
       /*
        Hacer un programa que simule un cajero automatico con un saldo
        inicial de 1000 dolares, con el siguiente menu de opciones
        1. Ingresar dinero a la cuenta
        2. retirar dinero de la cuenta
        3.Salir
        */
       
       float saldo, nuevoSaldo, consignacion,retiro;
       
       saldo=1000;
       
       JOptionPane.showMessageDialog(null,"Bienvenido al cajero, su saldo es de: \n "+ saldo + " click en ok para continuar \n ");
        int decision = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que desea hacer: \n para ingresar dinero escriba 1 \n para retirar dinero escriba 2 \n para salir escriba 3"));
       
       
        
       
        switch(decision){
        case 1: consignacion=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la consignacion:")) ;
                nuevoSaldo= saldo+consignacion;
                JOptionPane.showMessageDialog(null,"tu nuevo saldo es: "+ nuevoSaldo);
                break;
        case 2: retiro=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del retiro")) ;
        
                if (retiro<=saldo) {
                nuevoSaldo= saldo-retiro;
                JOptionPane.showMessageDialog(null,"tu nuevo saldo es: "+ nuevoSaldo);
            }
                else{
                 JOptionPane.showMessageDialog(null,"Fondos insuficientes");   
                }        
                break;
        case 3: JOptionPane.showMessageDialog(null,"tu saldo es: "+ saldo + " \n Gracias por utilizar nuestro cajero");
                break;
        default: JOptionPane.showMessageDialog(null, "No has seleccionado ninguna opcion valida");
                break;
        }
    }
}
