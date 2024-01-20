/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eje2salariosemanal;

import java.util.Scanner;

/**
 *
 * @author GUILLERMO
 */
public class Eje2SalarioSemanal {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int horasSemanales;
        float salarioHora,salarioTotal;
        System.out.println("digite las horas semanales trabajadas");
        horasSemanales=entrada.nextInt();
        System.out.println("digite el salario por hora");
        salarioHora=entrada.nextFloat();
        salarioTotal=horasSemanales*salarioHora;
        System.out.println("el salario total es de:" + salarioTotal);
        //Este salario solo funciona para numeros enteros  no decimales 3.8
    }
}
