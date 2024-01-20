/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclodowhile;

/**
 *
 * @author GUILLERMO
 */
public class CicloDoWhile {

    public static void main(String[] args) {
        /*
        do{
        Instrucciones;
        }
        while(condicion){
        }
        
        Se ejecutan las instrucciones por lo menos una vez dentro del do
        */
        int i=11;
        
         do{
             System.out.println(i); //Se ejecutan las instrucciones por lo menos una vez
             i++;
        }
        while(i<=10);// Se establece la condicion
    }
    
}
