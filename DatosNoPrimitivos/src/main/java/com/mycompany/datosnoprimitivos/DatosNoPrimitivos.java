/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datosnoprimitivos;

/**
 *
 * @author GUILLERMO
 */
public class DatosNoPrimitivos {

    public static void main(String[] args) {
        //los tipos no primitivos Pueden almacenar datos como null
        System.out.println("Integer se escribe con mayuscula I");
        Integer numero=10; //si en vez de 10 ponemos null see escribe null
        System.out.println("El numero es:" + numero);
        System.out.println(" ");
        System.out.println("Los datos no primitivos pueden usar metodos");
        System.out.println("  ");
        
        
        //las cadenas
        String cadena = "hola esto es un string";
        System.out.println("String se escribe con S MAYUSCULA");
        System.out.println("el string es " + cadena);
        System.out.println(" ");
        System.out.println("Para caracteres comillas simples ' para string comillas dobles");
    }
}
