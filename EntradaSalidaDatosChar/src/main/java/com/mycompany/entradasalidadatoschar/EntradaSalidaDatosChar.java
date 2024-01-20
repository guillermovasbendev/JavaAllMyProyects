/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.entradasalidadatoschar;

import java.util.Scanner;//Importar scanner si lo voy a usar

/**
 *
 * @author GUILLERMO
 */
public class EntradaSalidaDatosChar {

    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);//Siempre instanciar escaner dentro del codigo
        
        char letra;
        System.out.println("Digite un string:");
        
        letra= entrada.next().charAt(0);//Recibe como parametro la posicion del string
        System.out.println("el caracter es: " + letra);
    }
}
