/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadorincrementodecremento;

/**
 *
 * @author GUILLERMO
 */
public class OperadorIncrementoDecremento {

    public static void main(String[] args) {
       int x=5;
       int y =18;
       
       x++;//esto equivale a decir x=x+1;
       y--;//equivale a lo mismo retado
        System.out.println("el x ahora es " + x);
        System.out.println("el y ahora es " + y);
        System.out.println("En cuanto a precedencia de operadores siempre se ejecuta primero el incremento");
        System.out.println("o decremento antes de la asignacion si se colocan los simbolos ++ antes de x");
        System.out.println("y=++x como prefijo primero se realiza el aumento");
        System.out.println("y=x++ como sufijo primero hace la asignacion");
    }
}
