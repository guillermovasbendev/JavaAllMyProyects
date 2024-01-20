/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje4;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje4 {

    public static void main(String[] args) {
        /*
        En un centro comercial se hace un 20% de descuento a clientes cuya compra sea mayor a $300
        ¿Cual sera la cantidad que pagara una persona por su compra?
        */
        Double valorCompra,valorAPagar,descuento;
        
       valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null,"Digita el valor de la compra:"));

       
        if(valorCompra>300){ 
        descuento=valorCompra*0.2;
        valorAPagar=valorCompra-descuento;
        JOptionPane.showMessageDialog(null, "El precio a pagar es de:" + valorAPagar);
        }
        else{
        valorAPagar=valorCompra;
        JOptionPane.showMessageDialog(null, "El precio a pagar es de:" + valorAPagar);
        }
        // seria mejor utilizar float para las variables ya que usan menos espacio en memoria
    }
}
