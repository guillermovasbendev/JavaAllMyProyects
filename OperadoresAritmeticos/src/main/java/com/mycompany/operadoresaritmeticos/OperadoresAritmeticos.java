/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float numero1, numero2, suma, resta, mult,div,mod;//instanciar scanner
        System.out.println("Digite dos numeros");
        numero1= entrada.nextFloat();//nextFloat confirma que los numeros seran flotantes decimales
        numero2= entrada.nextFloat();//nextFloat confirma que los numeros seran flotantes decimales
        suma=numero1+numero2;
        resta=numero1-numero2;
        mult= numero1*numero2;
        div=numero1/numero2;
        mod=numero1%numero2;
        System.out.println("la suma es:" + suma);
        System.out.println("la resta es:" + resta);
        System.out.println("la multiplicacion es:" + mult);
        System.out.println("la division es:" + div);
        System.out.println("El modulo es:" + mod);
        //
    }
}
