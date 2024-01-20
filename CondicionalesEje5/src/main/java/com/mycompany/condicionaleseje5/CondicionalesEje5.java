/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionaleseje5;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class CondicionalesEje5 {

    public static void main(String[] args) {
        /*
        Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente
        manera:
        *Si trabaja 40 horas o menos se le paga 16 por hora
        * si trabaja mas de 40 horas se le paga 16 por cada 
        una de las primeras 40 horas y 20 por cada hora extra
        */
        float  salarioTotal,salario, CantidadHorasTrabajadas,CantidadHorasExtras,horasExtras;
        
        CantidadHorasTrabajadas=Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese las horas trabajadas"));
        CantidadHorasExtras=Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese las horas extras trabajadas"));
        
        if(CantidadHorasTrabajadas>=40){
            salario= CantidadHorasTrabajadas*16;
            horasExtras=CantidadHorasExtras*20;
            salarioTotal=salario+horasExtras;
            JOptionPane.showMessageDialog(null,"el salario total sera: " + salarioTotal );
        }
        else{
            salario= CantidadHorasTrabajadas*16;
            JOptionPane.showMessageDialog(null,"el salario total sera: " + salario );
        }
        //corregir
    }
}
