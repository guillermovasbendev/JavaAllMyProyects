/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclowhile;

/**
 *
 * @author GUILLERMO
 */
public class CicloWhile {

    public static void main(String[] args) {
        /*
        while(condicion){
        instrucciones;
        }
        */
        int n;
        n=0;
        
        while(n<=100){ // se establece la condicion para que termine el ciclo
            System.out.println(n);
            n=n+1;//se establece la condicion de lo que le pasa al iterador puede escribirse n++
        }
    }
}
