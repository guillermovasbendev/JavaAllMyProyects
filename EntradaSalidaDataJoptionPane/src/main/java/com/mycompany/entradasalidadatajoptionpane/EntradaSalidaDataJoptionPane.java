/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradasalidadatajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class EntradaSalidaDataJoptionPane {

    public static void main(String[] args) {
       System.out.println("JOptionPane ingresa datos mediante un cuadro mas estilizado");
       System.out.println("Siempre importar JOptionPane");
       String cadena;
       int entero;
       char letra;
       double decimal;
       System.out.println("");
       System.out.println("Para ingresar se usaJOptionPane.showInputDialog(Aqui el mensaje) ");
       cadena=JOptionPane.showInputDialog("Digita una cadena:");
       entero=Integer.parseInt(JOptionPane.showInputDialog("Digita una entero:"));
       //En la anterior se usa Integer.parseInt para transformar toda la linea
       //esta linea: JOptionPane.showInputDialog("Digita una entero:") a un entero
       letra =JOptionPane.showInputDialog("Digite un string para obtener el caracter").charAt(0);
       // en el anterior, es necesario usar el parametro charAT para indicar
       //cual es el numero del caracter que vamos a traer
       decimal =Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
       //para convertir el dato en double se usa Double.parseDuble y dentro se le pasa como
       //argumento JOptionPane.showInputDialog("Digite un decimal") que es el cuadro de option Pane
       
       //para un dato float se usa Float.parseFloat y asi
        System.out.println("");
        System.out.println("Para salida o mostrar el mensaje se usa JOptionPane.showMessageDialog(arg1arg2)");
        System.out.println("Primer argumento dejar NULL");
        System.out.println("Segundo argumento lleva el mensaje entre comillas");
        
        
        JOptionPane.showMessageDialog(null,"la cadena es "+ cadena);
        // El primer parametro representa la ubicacion respecto al componente padre es decir
        //apareceria asociado respecto al componente padre, centrado con respecto a el
        //el primer parametro seria el nombre del componente padre
        JOptionPane.showMessageDialog(null,"el numero entero es "+ entero);
        JOptionPane.showMessageDialog(null,"la caracter de la cadena es "+ letra);
        JOptionPane.showMessageDialog(null,"la decimal es "+ decimal);
    }
}
