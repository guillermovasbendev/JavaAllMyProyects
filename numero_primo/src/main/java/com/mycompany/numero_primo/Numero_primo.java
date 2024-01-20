/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numero_primo;



/**
 *
 * @author GUILLERMO
 */
public class Numero_primo {

    public static void main(String[] args) {
       for (int i=1;i>=39;i++){
           double a = Math.pow(i, 2)+1+41;
           System.out.println("es numero primo " + a);
       }
    }
}
